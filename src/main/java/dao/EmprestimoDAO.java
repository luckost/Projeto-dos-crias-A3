package dao;

import modelo.Emprestimo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta classe fornece métodos para acessar e manipular dados relacionados a empréstimos no banco de dados.
 */
public class EmprestimoDAO {
    private final BDConnection connectionBD;
    private static final Logger LOGGER = Logger.getLogger(EmprestimoDAO.class.getName());

    /**
     * Construtor da classe EmprestimoDAO.
     */
    public EmprestimoDAO() {
        this.connectionBD = new BDConnection();
    }

    /**
     * Obtém o maior ID de empréstimo presente no banco de dados.
     * @return O maior ID de empréstimo.
     */
    public int pegaMaiorID() {
        int maior = 0;
        String sql = "SELECT MAX(id_emprestimo) as id_emprestimo FROM emprestimo";
        try (Connection conexaoBD = BDConnection.getConnection();
             Statement stmt = conexaoBD.createStatement();
             ResultSet res = stmt.executeQuery(sql)) {
            if (res.next()) {
                maior = res.getInt("id_emprestimo");
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao pegar maior ID", ex);
        }
        return maior;
    }

    /**
     * Obtém uma lista de todos os empréstimos registrados no banco de dados.
     * @return Uma lista de objetos Emprestimo.
     */
    public ArrayList<Emprestimo> getMinhaLista() {
        ArrayList<Emprestimo> lista = new ArrayList<>();
        String sql = "SELECT * FROM emprestimo";
        try (Connection conexaoBD = BDConnection.getConnection();
             Statement stmt = conexaoBD.createStatement();
             ResultSet resposta = stmt.executeQuery(sql)) {
            while (resposta.next()) {
                int id = resposta.getInt("id_emprestimo");
                String nomeAmigo = resposta.getString("nome_amigo");
                String nomeFerramenta = resposta.getString("nome_ferramenta");
                Date dataEmprestimo = resposta.getDate("data_emprestimo");
                Date dataDevolucao = resposta.getDate("data_devolucao");
                boolean status = resposta.getBoolean("status");

                Emprestimo objeto = new Emprestimo(id, nomeAmigo, nomeFerramenta, dataEmprestimo, dataDevolucao, status);
                lista.add(objeto);
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao obter lista de empréstimos", ex);
        }
        return lista;
    }

    /**
     * Insere um novo empréstimo no banco de dados.
     * @param objeto O objeto Emprestimo a ser inserido.
     * @return true se a operação for bem-sucedida, false caso contrário.
     */
    public boolean inserirEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO emprestimo(nome_amigo, nome_ferramenta, data_emprestimo, data_devolucao, status) VALUES(?, ?, ?, ?, ?)";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setString(1, objeto.getNomeAmigo());
            stmt.setString(2, objeto.getNomeFerramenta());
            stmt.setDate(3, new java.sql.Date(objeto.getDataEmprestimo().getTime()));
            stmt.setDate(4, new java.sql.Date(objeto.getDataDevolucao().getTime()));
            stmt.setBoolean(5, objeto.getStatus());
            stmt.executeUpdate();
            return true;
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao inserir empréstimo", erro);
        }
        return false;
    }

    /**
     * Exclui um empréstimo do banco de dados com base no ID fornecido.
     * @param id O ID do empréstimo a ser excluído.
     * @return true se a operação for bem-sucedida, false caso contrário.
     */
    public boolean deleteEmprestimoBD(int id) {
        String sql = "DELETE FROM emprestimo WHERE id_emprestimo = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao deletar empréstimo", erro);
        }
        return false;
    }

    /**
     * Atualiza as informações de um empréstimo no banco de dados.
     * @param objeto O objeto Emprestimo com as informações atualizadas.
     * @return true se a operação for bem-sucedida, false caso contrário.
     */
    public boolean updateEmprestimoBD(Emprestimo objeto) {
        String sql = "UPDATE emprestimo SET nome_amigo = ?, nome_ferramenta = ?, data_emprestimo = ?, data_devolucao = ?, status = ? WHERE id_emprestimo = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setString(1, objeto.getNomeAmigo());
            stmt.setString(2, objeto.getNomeFerramenta());
            stmt.setDate(3, new java.sql.Date(objeto.getDataEmprestimo().getTime()));
            stmt.setDate(4, new java.sql.Date(objeto.getDataDevolucao().getTime()));
            stmt.setBoolean(5, objeto.getStatus());
            stmt.setInt(6, objeto.getId());
            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao atualizar empréstimo", erro);
        }
        return false;
    }

    /**
     * Carrega os detalhes de um empréstimo do banco de dados com base no ID fornecido.
     * @param id O ID do empréstimo a ser carregado.
     * @return Um objeto Emprestimo com os detalhes do empréstimo carregado, ou null se não for encontrado.
     */
    public Emprestimo carregaEmprestimoBD(int id) {
        String sql = "SELECT * FROM emprestimo WHERE id_emprestimo = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet resposta = stmt.executeQuery()) {
                if (resposta.next()) {
                    int emprestimoId = resposta.getInt("id_emprestimo");
                    String nomeAmigo = resposta.getString("nome_amigo");
                    String nomeFerramenta = resposta.getString("nome_ferramenta");
                    Date dataEmprestimo = resposta.getDate("data_emprestimo");
                    Date dataDevolucao = resposta.getDate("data_devolucao");
                    boolean status = resposta.getBoolean("status");
                    return new Emprestimo(emprestimoId, nomeAmigo, nomeFerramenta, dataEmprestimo, dataDevolucao, status);
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar empréstimo", erro);
        }
        return null;
    }
    
    /**
     * Verifica se um amigo possui empréstimos em aberto.
     * @param nomeAmigo O nome do amigo para verificar os empréstimos em aberto.
     * @return true se o amigo possui empréstimos em aberto, false caso contrário.
     */
    public boolean amigoTemEmprestimosAbertos(String nomeAmigo) {
        String sql = "SELECT COUNT(*) FROM emprestimo WHERE nome_amigo = ? AND status = false";
        
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            
            stmt.setString(1, nomeAmigo);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao verificar empréstimos abertos para o amigo", erro);
        }
        return false;
    }
}