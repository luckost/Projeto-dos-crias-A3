package modelo;

import dao.EmprestimoDAO;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.Date;

public class Emprestimo {
    // Atributos
    private int id;
    private String nomeAmigo;
    private String nomeFerramenta;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    // Construtor de Objeto Vazio
    public Emprestimo() {
        this(0, "", "", new Date(), new Date());
    }

    // Construtor de Objeto, com parâmetros
    public Emprestimo(int id, String nomeAmigo, String nomeFerramenta, Date dataEmprestimo, Date dataDevolucao) {
        this.id = id;
        this.nomeAmigo = nomeAmigo;
        this.nomeFerramenta = nomeFerramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Métodos GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
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
        return "Emprestimo{" +
                "id=" + id +
                ", nomeAmigo='" + nomeAmigo + '\'' +
                ", nomeFerramenta='" + nomeFerramenta + '\'' +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }

    /* Abaixo os métodos para uso junto com o DAO simulando a estrutura em camadas 
    para usar com bancos de dados.*/
    // Retorna a Lista de Emprestimo(objetos)
    public ArrayList<Emprestimo> getMinhaLista() {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        return emprestimoDAO.getMinhaLista();
    }

    // Cadastra novo Emprestimo
    public boolean inserirEmprestimoBD(String nomeAmigo, String nomeFerramenta, Date dataEmprestimo, Date dataDevolucao) throws SQLException {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        int id = this.maiorID() + 1;
        Emprestimo objeto = new Emprestimo(id, nomeAmigo, nomeFerramenta, dataEmprestimo, dataDevolucao);
        return emprestimoDAO.inserirEmprestimoBD(objeto);
    }

    // Edita um Emprestimo específico pelo seu campo ID
    public boolean updateEmprestimoBD(int id, String nomeAmigo, String nomeFerramenta, Date dataEmprestimo, Date dataDevolucao) {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        Emprestimo objeto = new Emprestimo(id, nomeAmigo, nomeFerramenta, dataEmprestimo, dataDevolucao);
        return emprestimoDAO.atualizarEmprestimoBD(objeto);
    }

    // Deleta um Emprestimo específico pelo seu campo ID
    public boolean deleteEmprestimoBD(int id) {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        return emprestimoDAO.deletaEmprestimoBD(id);
    }

    // Carrega dados de um Emprestimo específico pelo seu Id
    public Emprestimo carregaEmprestimoBD(int id) {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        return emprestimoDAO.carregaEmprestimoBD(id);
    }

    // Retorna o maior Id da nossa base de dados
    public int maiorID() {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        return emprestimoDAO.pegaMaiorID();
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
