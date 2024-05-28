/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Amigo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AmigoDAO {
    
    public static ArrayList<Amigo> List = new ArrayList<>();

    public AmigoDAO() {
    }

    //este método é utilizado para pegar o maior e o último id cadastrado no banco de dados
    public int pegarMaiorID() throws SQLException {
        int maior = 0;
        try {
            Connection conexao = conexao.getConectado();
            if (conexao != null) {
                try (Statement stmt = conexao.createStatement()) {
                    ResultSet res = stmt.executeQuery("SELECT (id_amigo) id_amigo FROM amigos");
                    res.next();
                    maior = res.getInt("id_amigo");
                }
            }
        } catch (SQLException ex) {
        }
        return maior;
    }

    public ArrayList getList() {
        List.clear();
        
        try {
            Connection conexao = conexao.getConnection();
            if (conexao != null) {
                Statement conecaox = conexao.createStatement();
                ResultSet resposta = conecaox.executeQuery("SELECT * FROM amigos");
                while (resposta.next()) {
                    int id = resposta.getInt("id_amigo");
                    String nome = resposta.getString("nome");
                    String telefone = resposta.getString("telefone");

                    Amigo objeto = new Amigo(id, nome, telefone);
                    List.add(objeto);
                }
                conecaox.close();
            }

        } catch (SQLException ex) {
            //caso de erro
        }
        return List;
    }

    public boolean cadastrarAmigo(Amigo objeto) {
        String sql = "INSERT INTO amigos(nome, telefone) VALUES(?, ?)";
        try {
            Connection conexao = conexao.getConnection();
            if (conexao != null) {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, objeto.getNome());
                    stmt.setString(2, objeto.getTelefone());
                    stmt.execute();
                }
                return true;
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return false;
    }

    public boolean apagarAmigo(int id) {
        try {
            Connection conexao = conexao.getConnection();
            if (conexao != null) {
                try (Statement stmt = conexao.createStatement()) {
                    stmt.executeUpdate("DELETE FROM amigos WHERE id_amigo = " + id);
                    stmt.close();
                }
            }
        } catch (SQLException erro) {
        }
        return true;
    }

    public boolean alterarAmigo(Amigo objeto) {
        String sintaxe = "UPDATE amigos SET nome = ?, telefone = ? WHERE id_amigo = ?";
        try {
            Connection conexao = conexao.getConnection();
            if (conexao != null) {
                try (PreparedStatement stmt = conexao.prepareStatement(sintaxe)) {
                    stmt.setString(1, objeto.getNome());
                    stmt.setString(2, objeto.getTelefone());
                    stmt.setInt(3, objeto.getId());
                    int linhasAfetadas = stmt.executeUpdate();
                    return linhasAfetadas > 0;
                }
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return false;
    }

    public Amigo carregarAmigo(int id) {
        Amigo objeto = new Amigo(); 
        objeto.setId(id); 
        try {
            Connection conexao = conexao.getConnection();
            if (conexao != null) {
                try (Statement stmt = conexao.createStatement()) {
                    //executa nossa query
                    ResultSet resposta = stmt.executeQuery("SELECT * FROM amigos WHERE id_amigo = " + id);
                    resposta.next();
                    objeto.setNome(resposta.getString("nome"));
                    objeto.setTelefone(resposta.getString("telefone"));
                }
            }
        } catch (SQLException erro) {
              throw new RuntimeException(erro);
        }
        return objeto;
    }
    
}
