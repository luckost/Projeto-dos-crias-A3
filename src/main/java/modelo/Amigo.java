package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;
import java.sql.SQLException;

public class Amigo {
// Atributos

    private int id;
    private String nome;
    private String telefone;
    private final AmigoDAO dao;

    public Amigo() {
        this.dao = new AmigoDAO();
    }

    public Amigo(String nome, String telefone) {
        this.dao = new AmigoDAO();
        this.nome = nome;
        this.telefone = telefone;
    }
// Construtor de Objeto, com parâmetros

    public Amigo(int id, String nome, String telefone) {
        this.dao = new AmigoDAO();
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }
// Métodos GET e SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //controles 

    public int maiorID() throws SQLException {
        return dao.pegarMaiorID();
    }

    public ArrayList pegarList() {
        return dao.getList();
    }

    public boolean cadastrarAmigo(String nome, String telefone) throws SQLException {
        int id = this.maiorID() + 1;
        Amigo objeto = new Amigo(id, nome, telefone);
        dao.cadastrarAmigo(objeto);
        return true;
    }

    public boolean alterarAmigo(String nome, int id, String telefone) {
        Amigo objeto = new Amigo(id, nome, telefone);
        dao.alterarAmigo(objeto);
        return true;
    }

    public boolean apagarAmigo(int id) {
        dao.apagarAmigo(id);
        return true;
    }
}


