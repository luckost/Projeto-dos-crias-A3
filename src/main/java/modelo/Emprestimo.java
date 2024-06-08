package modelo;

import dao.BDConnection;
import dao.FerramentaDAO;
import dao.AmigoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private int id;
    private Ferramenta ferramenta;
    private Amigo amigo;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(int id, Ferramenta ferramenta, Amigo amigo, Date dataEmprestimo) {
        this.id = id;
        this.ferramenta = ferramenta;
        this.amigo = amigo;
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimos{" +
                "id=" + id +
                ", ferramenta=" + ferramenta +
                ", amigo=" + amigo +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }

    public static boolean inserirEmprestimoBD(Emprestimo emprestimo) {
        String sql = "INSERT INTO emprestimo (id_ferramenta, id_amigo, data_emprestimo, data_devolucao) VALUES (?, ?, ?, ?)";
        try (Connection connection = BDConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, emprestimo.getFerramenta().getId());
            pstmt.setInt(2, emprestimo.getAmigo().getId());
            pstmt.setDate(3, new java.sql.Date(emprestimo.getDataEmprestimo().getTime()));
            pstmt.setDate(4, emprestimo.getDataDevolucao() != null ? new java.sql.Date(emprestimo.getDataDevolucao().getTime()) : null);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir empréstimo: " + e.getMessage());
            return false;
        }
    }

    public static boolean atualizarEmprestimoBD(Emprestimo emprestimo) {
        String sql = "UPDATE emprestimo SET id_ferramenta = ?, id_amigo = ?, data_emprestimo = ?, data_devolucao = ? WHERE id = ?";
        try (Connection connection = BDConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, emprestimo.getFerramenta().getId());
            pstmt.setInt(2, emprestimo.getAmigo().getId());
            pstmt.setDate(3, new java.sql.Date(emprestimo.getDataEmprestimo().getTime()));
            pstmt.setDate(4, emprestimo.getDataDevolucao() != null ? new java.sql.Date(emprestimo.getDataDevolucao().getTime()) : null);
            pstmt.setInt(5, emprestimo.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar empréstimo: " + e.getMessage());
            return false;
        }
    }

    public static boolean deletarEmprestimoBD(int id) {
        String sql = "DELETE FROM emprestimo WHERE id = ?";
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

    public static List<Emprestimo> carregarEmprestimos() {
    List<Emprestimo> emprestimos = new ArrayList<>();
    String sql = "SELECT * FROM emprestimo";
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

            Ferramenta ferramenta = ferramentaDAO.buscarFerramentaPorId(ferramentaId);
            Amigo amigo = amigoDAO.buscarAmigoPorId(amigoId);

            Emprestimo emprestimo = new Emprestimo(id, ferramenta, amigo, (java.sql.Date) dataEmprestimo);
            emprestimos.add(emprestimo);
        }
    } catch (SQLException e) {
        System.err.println("Erro ao carregar empréstimos: " + e.getMessage());
    }
    return emprestimos;
}

    }

