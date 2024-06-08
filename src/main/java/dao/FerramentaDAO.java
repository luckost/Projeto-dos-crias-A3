package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Ferramenta;

public class FerramentaDAO {
    private final BDConnection connectionBD;
    private static final Logger LOGGER = Logger.getLogger(FerramentaDAO.class.getName());

    public FerramentaDAO() {
        this.connectionBD = new BDConnection();
    }

    public int pegaMaiorID() {
        int maior = 0;
        String sql = "SELECT MAX(id_ferramenta) as id_ferramenta FROM ferramenta";
        try (Connection conexaoBD = BDConnection.getConnection();
             Statement stmt = conexaoBD.createStatement();
             ResultSet res = stmt.executeQuery(sql)) {
            if (res.next()) {
                maior = res.getInt("id_ferramenta");
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao pegar maior ID", ex);
        }
        return maior;
    }

    public ArrayList<Ferramenta> getListaFerramenta() {
        ArrayList<Ferramenta> lista = new ArrayList<>();
        String sql = "SELECT * FROM ferramenta";
        try (Connection conexaoBD = BDConnection.getConnection();
             Statement stmt = conexaoBD.createStatement();
             ResultSet resposta = stmt.executeQuery(sql)) {
            while (resposta.next()) {
                int id = resposta.getInt("id_ferramenta");
                String nome = resposta.getString("nome");
                String marca = resposta.getString("marca");
                double custo = resposta.getDouble("custo_aquisicao");

                Ferramenta ferramenta = new Ferramenta(id, nome, marca, custo);
                lista.add(ferramenta);
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao obter lista de ferramentas", ex);
        }
        return lista;
    }

    public boolean inserirFerramentaBD(Ferramenta ferramenta) {
        String sql = "INSERT INTO ferramenta(nome, marca, custo_aquisicao) VALUES(?, ?, ?)";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setString(1, ferramenta.getNome());
            stmt.setString(2, ferramenta.getMarca());
            stmt.setDouble(3, ferramenta.getCusto());
            stmt.executeUpdate();
            return true;
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao inserir ferramenta", erro);
        }
        return false;
    }

    public boolean deleteFerramentaBD(int id) {
        String sql = "DELETE FROM ferramenta WHERE id_ferramenta = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao deletar ferramenta", erro);
        }
        return false;
    }

    public boolean updateFerramentaBD(Ferramenta ferramenta) {
        String sql = "UPDATE ferramenta SET nome = ?, marca = ?, custo_aquisicao = ? WHERE id_ferramenta = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setString(1, ferramenta.getNome());
            stmt.setString(2, ferramenta.getMarca());
            stmt.setDouble(3, ferramenta.getCusto());
            stmt.setInt(4, ferramenta.getId());
            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao atualizar ferramenta", erro);
        }
        return false;
    }

    public Ferramenta carregarFerramentaBD(int id) {
        String sql = "SELECT * FROM ferramenta WHERE id_ferramenta = ?";
        try (Connection conexaoBD = BDConnection.getConnection();
             PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet resposta = stmt.executeQuery()) {
                if (resposta.next()) {
                    int ferramentaId = resposta.getInt("id_ferramenta");
                    String nome = resposta.getString("nome");
                    String marca = resposta.getString("marca");
                    double custo = resposta.getDouble("custo_aquisicao");
                    return new Ferramenta(ferramentaId, nome, marca, custo);
                }
            }
        } catch (SQLException erro) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar ferramenta", erro);
        }
        return null;
    }
public Ferramenta buscarFerramentaPorId(int id) {
    String sql = "SELECT * FROM ferramenta WHERE id_ferramenta = ?";
    try (Connection conexaoBD = BDConnection.getConnection();
         PreparedStatement stmt = conexaoBD.prepareStatement(sql)) {
        stmt.setInt(1, id);
        try (ResultSet resposta = stmt.executeQuery()) {
            if (resposta.next()) {
                int ferramentaId = resposta.getInt("id_ferramenta");
                String nome = resposta.getString("nome");
                String marca = resposta.getString("marca");
                double custo = resposta.getDouble("custo_aquisicao");

                return new Ferramenta(ferramentaId, nome, marca, custo);
            }
        }
    } catch (SQLException erro) {
        LOGGER.log(Level.SEVERE, "Erro ao buscar ferramenta por ID", erro);
    }
    return null;
}

    
    public int getMaiorID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}