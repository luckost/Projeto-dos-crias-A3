package dao;

import modelo.Amigos;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmigoDAO {

    private static final Logger LOGGER = Logger.getLogger(AmigoDAO.class.getName());
    public static ArrayList<Amigos> MinhaLista = new ArrayList<>();

    public AmigoDAO() {
    }

    public int pegaMaiorID() {
        int maior = 0;
        try {
            Connection conexaoBD = BDConnection.getConexaoBD();
            if (conexaoBD != null) {
                try (Statement stmt = conexaoBD.createStatement()) {
                    ResultSet res = stmt.executeQuery("SELECT MAX(id_amigo) id_amigo FROM amigos");
                    if (res.next()) {
                        maior = res.getInt("id_amigo");
                    }
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao pegar maior ID", ex);
        }
        return maior;
    }

    public ArrayList<Amigos> getMinhaLista() {
        MinhaLista.clear();
        try {
            Connection conexaoBD = BDConnection.getConexaoBD();
            if (conexaoBD != null) {
                try (Statement stmt = conexaoBD.createStatement()) {
                    ResultSet resposta = stmt.executeQuery("SELECT * FROM amigos");
                    while (resposta.next()) {
                        int id = resposta.getInt("id_amigo");
                        String nome = resposta.getString("nome");
                        String telefone = resposta.getString("telefone");

                        Amigos objeto = new Amigos(id, nome, telefone);
                        MinhaLista.add(objeto);
                    }
                }
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao obter lista de amigos", ex);
        }
        return MinhaLista;
    }

    public boolean inserirAmigoBD(Amigos objeto) {
        String sql = "INSERT INTO amigos(nome, telefone) VALUES(?, ?)";
        try {
            Connection conexaoBD = BDConnection.getConexaoBD();
            if (conexaoBD != null) {
                try (PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
                    stmt.setString(1, objeto.getNome());
                    stmt.setString(2, objeto.getTelefone());
                    stmt.execute();
                    return true;
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao inserir amigo", erro);
        }
        return false;
    }

    public boolean deletaAmigoBD(int id) {
        try {
            Connection conexaoBD = BDConnection.getConexaoBD();
            if (conexaoBD != null) {
                try (Statement stmt = conexaoBD.createStatement()) {
                    stmt.executeUpdate("DELETE FROM amigos WHERE id_amigo = " + id);
                    return true;
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao deletar amigo", erro);
        }
        return false;
    }

    public boolean atualizarAmigo(Amigos objeto) {
        String sintaxe = "UPDATE amigos SET nome = ?, telefone = ? WHERE id_amigo = ?";
        try {
            Connection conexaoBD = BDConnection.getConexaoBD();
            if (conexaoBD != null) {
                try (PreparedStatement stmt = conexaoBD.prepareStatement(sintaxe)) {
                    stmt.setString(1, objeto.getNome());
                    stmt.setString(2, objeto.getTelefone());
                    stmt.setInt(3, objeto.getId());
                    int linhasAfetadas = stmt.executeUpdate();
                    return linhasAfetadas > 0;
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao atualizar amigo", erro);
        }
        return false;
    }

    public Amigos carregaAmigo(int id) {
        Amigos objeto = new Amigos(); //cria o objeto
        objeto.setId(id); //seta o id recebido por parametro para o objeto
        try {
            Connection conexaoBD = BDConnection.getConexaoBD();
            if (conexaoBD != null) {
                try (Statement stmt = conexaoBD.createStatement()) {
                    ResultSet resposta = stmt.executeQuery("SELECT * FROM amigos WHERE id_amigo = " + id);
                    if (resposta.next()) {
                        objeto.setNome(resposta.getString("nome"));
                        objeto.setTelefone(resposta.getString("telefone"));
                    }
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar amigo", erro);
        }
        return objeto;
    }
}
