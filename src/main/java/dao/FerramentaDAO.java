package dao;

import modelo.Ferramentas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FerramentaDAO {
    private List<Ferramentas> ferramentas;
    private int proximoId;

    public FerramentaDAO() {
        ferramentas = new ArrayList<>();
        proximoId = 1;
    }

    public boolean inserirFerramenta(Ferramentas ferramenta) {
        ferramenta.setId(proximoId);
        proximoId++;
        return ferramentas.add(ferramenta);
    }

    public boolean updateFerramenta(Ferramentas ferramenta) {
        for (int i = 0; i < ferramentas.size(); i++) {
            if (ferramentas.get(i).getId() == ferramenta.getId()) {
                ferramentas.set(i, ferramenta);
                return true;
            }
        }
        return false;
    }

    public boolean deleteFerramenta(int id) {
        for (Ferramentas ferramenta : ferramentas) {
            if (ferramenta.getId() == id) {
                return ferramentas.remove(ferramenta);
            }
        }
        return false;
    }

    public Ferramentas buscarFerramentaPorId(int id) {
        String sql = "SELECT * FROM ferramentas WHERE id_ferramenta = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Ferramentas ferramenta = new Ferramentas();
                    ferramenta.setId(rs.getInt("id_ferramenta"));
                    ferramenta.setNome(rs.getString("nome"));
                    return ferramenta;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Ferramentas> listarFerramentas() {
        return new ArrayList<>(ferramentas); // Retorna uma cópia da lista para evitar modificação direta
    }
}
