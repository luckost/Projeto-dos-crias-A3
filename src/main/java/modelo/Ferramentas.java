package modelo;

import java.util.ArrayList;

public class Ferramentas {
    private int id;
    private String nome;
    private String marca;
    private double custo;

    // Construtor vazio
    public Ferramentas() {}

    // Construtor com parâmetros
    public Ferramentas(int id, String nome, String marca, double custo) {
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

    // Métodos para manipulação no banco de dados
    public static boolean inserirFerramentaDB(Ferramentas ferramenta) {
        // Adicione sua lógica de inserção no banco de dados aqui
        return false; // Substitua por sua lógica real
    }

    public static boolean updateFerramentaDB(Ferramentas ferramenta) {
        // Adicione sua lógica de atualização no banco de dados aqui
        return false; // Substitua por sua lógica real
    }

    public static boolean deleteFerramentaDB(int id) {
        // Adicione sua lógica de exclusão no banco de dados aqui
        return false; // Substitua por sua lógica real
    }

    public static int procurarIndice(int id) {
        // Adicione sua lógica de busca no banco de dados aqui
        return -1; // Substitua por sua lógica real
    }

    public static ArrayList<Ferramentas> carregaFerramentas() {
        // Adicione sua lógica de carregamento de ferramentas do banco de dados aqui
        return new ArrayList<>(); // Substitua por sua lógica real
    }
}