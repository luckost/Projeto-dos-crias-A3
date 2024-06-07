import dao.AmigoDAO;
import dao.BDConnection;
import dao.FerramentaDAO;
import modelo.Amigos;
import modelo.Emprestimos;
import modelo.Ferramentas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmprestimoDAO {

    public boolean inserirEmprestimoDB(Emprestimos emprestimo) {
        String sql = "INSERT INTO emprestimos (ferramenta_id, amigo_id, data_emprestimo) VALUES (?, ?, ?)";
        try (Connection connection = BDConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, emprestimo.getFerramenta().getId());
            pstmt.setInt(2, emprestimo.getAmigo().getId());
            pstmt.setDate(3, new java.sql.Date(emprestimo.getDataEmprestimo().getTime())); // Convertendo java.util.Date para java.sql.Date
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir empréstimo: " + e.getMessage());
            return false;
        }
    }

    public List<Emprestimos> carregarEmprestimos() {
    List<Emprestimos> emprestimos = new ArrayList<>();
    String sql = "SELECT * FROM emprestimos";
    try (Connection connection = BDConnection.getConnection();
         PreparedStatement pstmt = connection.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {
        while (rs.next()) {
            int id = rs.getInt("id");
            Date dataEmprestimo = rs.getDate("data_emprestimo");
            int ferramentaId = rs.getInt("ferramenta_id");
            int amigoId = rs.getInt("amigo_id");

            FerramentaDAO ferramentaDAO = new FerramentaDAO();
            AmigoDAO amigoDAO = new AmigoDAO();

            Ferramentas ferramenta = ferramentaDAO.buscarFerramentaPorId(ferramentaId);
            Amigos amigo = amigoDAO.buscarAmigoPorId(amigoId);

            Emprestimos emprestimo = new Emprestimos(id, ferramenta, amigo, (java.sql.Date) dataEmprestimo);
            emprestimos.add(emprestimo);
        }
    } catch (SQLException e) {
        System.err.println("Erro ao carregar empréstimos: " + e.getMessage());
    }
    return emprestimos;
}


    public boolean removerEmprestimoDB(int id) {
        String sql = "DELETE FROM emprestimos WHERE id = ?";
        try (Connection connection = BDConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar empréstimo: " + e.getMessage());
            return false;
        }
    }
}
