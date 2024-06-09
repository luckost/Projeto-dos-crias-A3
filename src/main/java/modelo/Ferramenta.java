package modelo;

import dao.FerramentaDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ferramenta {
    private int id;
    private String nome;
    private String marca;
    private double custo;

    // Construtor vazio
    public Ferramenta() {
    this(0, "", "",0.0);
    }

    // Construtor com parâmetros
    public Ferramenta(int id, String nome, String marca, double custo) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
    }

    // Getters e Setters
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    // Override do método toString
    @Override
    public String toString() {
        return "Ferramenta{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", custo=" + custo +
                '}';
    }

     public ArrayList<Ferramenta> getListaFerramenta() {
        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        return ferramentaDAO.getListaFerramenta();
    }

    // Cadastra uma nova ferramenta
    public boolean cadastrarFerramenta(String nome, String marca, double custo) throws SQLException {
        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        int id = this.getMaiorID() + 1;
        Ferramenta ferramenta = new Ferramenta(id, nome, marca, custo);
        return ferramentaDAO.inserirFerramentaBD(ferramenta);
    }

    // Atualiza uma ferramenta existente
    public boolean atualizarFerramenta(int id, String nome, String marca, double custo) {
        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        Ferramenta ferramenta = new Ferramenta(id, nome, marca, custo);
        return ferramentaDAO.updateFerramentaBD(ferramenta);
    }

    // Deleta uma ferramenta pelo seu ID
    public boolean deletarFerramenta(int id) {
        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        return ferramentaDAO.deleteFerramentaBD(id);
    }

    // Carrega uma ferramenta pelo seu ID
    public Ferramenta carregarFerramenta(int id) {
        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        return ferramentaDAO.carregarFerramentaBD(id);
    }

    // Retorna o maior ID da base de dados
    public int getMaiorID() {
        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        return ferramentaDAO.getMaiorID();
    }
}