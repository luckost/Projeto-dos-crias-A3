package dao;

import modelo.Amigos;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmigoDAO {

    private static final Logger LOGGER = Logger.getLogger(AmigoDAO.class.getName());

    public AmigoDAO() {
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

    public ArrayList<Amigos> getMinhaLista() {
        ArrayList<Amigos> lista = new ArrayList<>();
        String sql = "SELECT * FROM amigos";
        try (Connection conexaoBD = BDConnection.getConnection();
             Statement stmt = conexaoBD.createStatement();
             ResultSet resposta = stmt.executeQuery(sql)) {
            while (resposta.next()) {
                int id = resposta.getInt("id_amigo");
                String nome = resposta.getString("nome");
                String telefone = resposta.getString("telefone");

                Amigos objeto = new Amigos(id, nome, telefone);
                lista.add(objeto);
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao obter lista de amigos", ex);
        }
        return lista;
    }

    public boolean inserirAmigoBD(Amigos objeto) {
        String sql = "INSERT INTO amigos(nome, telefone) VALUES(?, ?)";
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
        String sql = "DELETE FROM amigos WHERE id_amigo = ?";
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

    public boolean atualizarAmigo(Amigos objeto) {
        String sql = "UPDATE amigos SET nome = ?, telefone = ? WHERE id_amigo = ?";
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

    public Amigos carregaAmigo(int id) {
        String sql = "SELECT * FROM amigos WHERE id_amigo = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet resposta = stmt.executeQuery()) {
                if (resposta.next()) {
                    int amigoId = resposta.getInt("id_amigo");
                    String nome = resposta.getString("nome");
                    String telefone = resposta.getString("telefone");
                    return new Amigos(amigoId, nome, telefone);
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar amigo", erro);
        }
        return null;
    }
    
    public Amigos buscarAmigoPorId(int id) {
        String sql = "SELECT * FROM amigos WHERE id_amigo = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet resposta = stmt.executeQuery()) {
                if (resposta.next()) {
                    int amigoId = resposta.getInt("id_amigo");
                    String nome = resposta.getString("nome");
                    String telefone = resposta.getString("telefone");
                    return new Amigos(amigoId, nome, telefone);
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao buscar amigo por ID", erro);
        }
        return null;
    }
}
