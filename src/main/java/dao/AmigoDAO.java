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

/**
 * Esta classe fornece métodos para acessar e manipular dados de amigos no banco de dados.
 */
public class AmigoDAO {
    private final BDConnection connectionBD;
    private static final Logger LOGGER = Logger.getLogger(AmigoDAO.class.getName());

    /**
     * Construtor da classe AmigoDAO.
     */
    public AmigoDAO() {
        this.connectionBD = new BDConnection();
    }

    /**
     * Obtém o maior ID entre os amigos cadastrados no banco de dados.
     * @return O maior ID encontrado.
     */
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

    /**
     * Obtém uma lista de todos os amigos cadastrados no banco de dados.
     * @return Uma lista de objetos Amigo.
     */
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

    /**
     * Insere um novo amigo no banco de dados.
     * @param objeto O objeto Amigo a ser inserido.
     * @return true se a inserção for bem-sucedida, false caso contrário.
     */
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

    /**
     * Deleta um amigo do banco de dados.
     * @param id O ID do amigo a ser deletado.
     * @return true se a exclusão for bem-sucedida, false caso contrário.
     */
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

    /**
     * Atualiza os dados de um amigo no banco de dados.
     * @param objeto O objeto Amigo com os dados atualizados.
     * @return true se a atualização for bem-sucedida, false caso contrário.
     */
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

    /**
     * Carrega os dados de um amigo do banco de dados com base no ID fornecido.
     * @param id O ID do amigo a ser carregado.
     * @return Um objeto Amigo com os dados carregados, ou null se nenhum amigo for encontrado com o ID fornecido.
     */
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
    
    /**
     * Busca um amigo no banco de dados com base no ID fornecido.
     * @param id O ID do amigo a ser buscado.
     * @return Um objeto Amigo com os dados encontrados, ou null se nenhum amigo for encontrado com o ID fornecido.
     */
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