package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;
import java.sql.SQLException;

public class Amigo {
    // Atributos
    private int id;
    private String nome;
    private String telefone;

    // Construtor de Objeto Vazio
    public Amigo() {
        this(0, "", "");
    }

    // Construtor de Objeto, com parâmetros
    public Amigo(int id, String nome, String telefone) {
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

    @Override
    public String toString() {
        return super.toString() + "id=" + id
                + ",nome=" + nome + ", telefone=" + telefone;
    }

    /* Abaixo os métodos para uso junto com o DAO simulando a estrutura em camadas 
    para usar com bancos de dados.*/
    //Retorna a Lista de Amigo(objetos)
    public ArrayList<Amigo> getMinhaLista() {
        AmigoDAO amigoDAO = new AmigoDAO();
        return amigoDAO.getMinhaLista();
    }

    //Cadastra novo Amigo
    public boolean inserirAmigoBD(String nome, String telefone) throws SQLException {
        AmigoDAO amigoDAO = new AmigoDAO();
        int id = this.maiorID() + 1;
        Amigo objeto = new Amigo(id, nome, telefone);
        return amigoDAO.inserirAmigoBD(objeto);
    }

    //Edita um Amigo específico pelo seu campo ID
    public boolean updateAmigoBD(int id, String nome, String telefone) {
        AmigoDAO amigoDAO = new AmigoDAO();
        Amigo objeto = new Amigo(id, nome, telefone);
        return amigoDAO.atualizarAmigoBD(objeto);
    }

    //Deleta um Amigo específico pelo seu campo ID
    public boolean deleteAmigoBD(int id) {
        AmigoDAO amigoDAO = new AmigoDAO();
        return amigoDAO.deletaAmigoBD(id);
    }

    //Carrega dados de um Amigo específico pelo seu Id
    public Amigo carregaAmigoBD(int id) {
        AmigoDAO amigoDAO = new AmigoDAO();
        return amigoDAO.carregaAmigoBD(id);
    }

    //Retorna o maior Id da nossa base de dados
    public int maiorID() {
        AmigoDAO amigoDAO = new AmigoDAO();
        return amigoDAO.pegaMaiorID();
    }
}
