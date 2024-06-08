package dao;

import modelo.Amigo;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;

public class AmigoDAO {
    private final BDConnection connectionBD;
    private static final Logger LOGGER = Logger.getLogger(AmigoDAO.class.getName());

    public AmigoDAO() {
        this.connectionBD = new BDConnection();

    }

    public int pegaMaiorID() {
        int maior = 0;
        String sql = "SELECT MAX(id_amigo) as id_amigo FROM amigos";
        try (Connection conexaoBD = BDConnection.getConnection();
             Statement stmt = conexaoBD.createStatement();
             ResultSet res = stmt.executeQuery(sql)) {
            if (res.next()) {
                maior = res.getInt("id_amigo");
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao pegar maior ID", ex);
        }
        return maior;
    }

    public ArrayList<Amigo> getMinhaLista() {
        ArrayList<Amigo> lista = new ArrayList<>();
        String sql = "SELECT * FROM amigo";
        try (Connection conexaoBD = BDConnection.getConnection();
             Statement stmt = conexaoBD.createStatement();
             ResultSet resposta = stmt.executeQuery(sql)) {
            while (resposta.next()) {
                int id = resposta.getInt("id_amigo");
                String nome = resposta.getString("nome");
                String telefone = resposta.getString("telefone");

                Amigo objeto = new Amigo(id, nome, telefone);
                lista.add(objeto);
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao obter lista de amigos", ex);
        }
        return lista;
    }

    public boolean inserirAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO amigo(nome, telefone) VALUES(?, ?)";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTelefone());
            stmt.executeUpdate();
            return true;
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao inserir amigo", erro);
        }
        return false;
    }

    public boolean deletaAmigoBD(int id) {
        String sql = "DELETE FROM amigo WHERE id_amigo = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao deletar amigo", erro);
        }
        return false;
    }

    public boolean atualizarAmigoBD(Amigo objeto) {
        String sql = "UPDATE amigo SET nome = ?, telefone = ? WHERE id_amigo = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getId());
            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao atualizar amigo", erro);
        }
        return false;
    }

    public Amigo carregaAmigoBD(int id) {
        String sql = "SELECT * FROM amigo WHERE id_amigo = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet resposta = stmt.executeQuery()) {
                if (resposta.next()) {
                    int amigoId = resposta.getInt("id_amigo");
                    String nome = resposta.getString("nome");
                    String telefone = resposta.getString("telefone");
                    return new Amigo(amigoId, nome, telefone);
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar amigo", erro);
        }
        return null;
    }
    
    public Amigo buscarAmigoPorId(int id) {
        String sql = "SELECT * FROM amigo WHERE id_amigo = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet resposta = stmt.executeQuery()) {
                if (resposta.next()) {
                    int amigoId = resposta.getInt("id_amigo");
                    String nome = resposta.getString("nome");
                    String telefone = resposta.getString("telefone");
                    return new Amigo(amigoId, nome, telefone);
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao buscar amigo por ID", erro);
        }
        return null;
    }
}
