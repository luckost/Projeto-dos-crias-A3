package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;
import java.sql.SQLException;

public class Amigo {
// Atributos

    private int id;
    private String nome;
    private String telefone;

//Construtor de Objeto Vazio
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
    //Retorna a Lista de Amigos(obejtos)

    public ArrayList getMinhaLista() {
        return AmigoDAO.getMinhaLista();
    }
//Cadastra novo Amigo

    public boolean inserirAmigoDB(String nome, String telefone) throws SQLException {
        int id = this.maiorID() + 1;
        Amigo objeto = new Amigo(id, nome, telefone);
        getMinhaLista().add(objeto);
        return true;
    }
//Edita um Amigo específico pelo seu campo ID

    public boolean updateAmigoDB(String nome, int id, String telefone) {
        Amigo objeto = new Amigo(id, nome, telefone);
        int indice = this.procuraIndice(id);
        getMinhaLista().set(indice, objeto);
        return true;
    }
//

    public boolean deleteAmigoDB(int id) {
        int indice = this.procuraIndice(id);
        getMinhaLista().remove(indice);
        return true;
    }
//Procura o indice de objeto da MinhaLista que contem o ID enviado

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < getMinhaLista().size(); i++) {
            if (getMinhaLista().get(i).getId() == id) {
                indice = i;
            }
        }

        return indice;

    }
//Carrega dados de um Amigo específico pelo seu Id

    public Amigo carregaAmigo(int id) {
        int indice = this.procuraIndice(id);
        return (Amigo) getMinhaLista().get(indice);
    }

    //Retorna o maior Id da nossa base de dados
    public int maiorID() {
        return AmigoDAO.maiorID();
    }

}
