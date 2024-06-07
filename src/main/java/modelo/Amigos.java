package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;
import java.sql.SQLException;

public class Amigos {
    // Atributos
    private int id;
    private String nome;
    private String telefone;

    // Construtor de Objeto Vazio
    public Amigos() {
        this(0, "", "");
    }

    // Construtor de Objeto, com parâmetros
    public Amigos(int id, String nome, String telefone) {
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
    //Retorna a Lista de Amigos(objetos)
    public ArrayList<Amigos> getMinhaLista() {
        AmigoDAO amigoDAO = new AmigoDAO();
        return amigoDAO.getMinhaLista();
    }

    //Cadastra novo Amigos
    public boolean inserirAmigoDB(String nome, String telefone) throws SQLException {
        AmigoDAO amigoDAO = new AmigoDAO();
        int id = this.maiorID() + 1;
        Amigos objeto = new Amigos(id, nome, telefone);
        return amigoDAO.inserirAmigoBD(objeto);
    }

    //Edita um Amigos específico pelo seu campo ID
    public boolean updateAmigoDB(String nome, int id, String telefone) {
        AmigoDAO amigoDAO = new AmigoDAO();
        Amigos objeto = new Amigos(id, nome, telefone);
        return amigoDAO.atualizarAmigo(objeto);
    }

    //Deleta um Amigos específico pelo seu campo ID
    public boolean deleteAmigoDB(int id) {
        AmigoDAO amigoDAO = new AmigoDAO();
        return amigoDAO.deletaAmigoBD(id);
    }

    //Carrega dados de um Amigos específico pelo seu Id
    public Amigos carregaAmigo(int id) {
        AmigoDAO amigoDAO = new AmigoDAO();
        return amigoDAO.carregaAmigo(id);
    }

    //Retorna o maior Id da nossa base de dados
    public int maiorID() {
        AmigoDAO amigoDAO = new AmigoDAO();
        return amigoDAO.pegaMaiorID();
    }
}
