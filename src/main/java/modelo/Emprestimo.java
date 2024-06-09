package modelo;

import dao.EmprestimoDAO;
import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
    // Atributos
    private int id;
    private String nomeAmigo;
    private String nomeFerramenta;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean status; // Alterado para boolean para representar "Entregue" ou "Aberto"

    // Construtor de Objeto Vazio
    public Emprestimo() {
        this(0, "", "", new Date(), new Date(), false);
    }

    // Construtor de Objeto, com parâmetros
    public Emprestimo(int id, String nomeAmigo, String nomeFerramenta, Date dataEmprestimo, Date dataDevolucao, boolean status) {
        this.id = id;
        this.nomeAmigo = nomeAmigo;
        this.nomeFerramenta = nomeFerramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", nomeAmigo='" + nomeAmigo + '\'' +
                ", nomeFerramenta='" + nomeFerramenta + '\'' +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", status='" + status + '\'' +
                '}';
    }

    // Retorna a Lista de Emprestimo(objetos)
    public ArrayList<Emprestimo> getMinhaLista() {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        return emprestimoDAO.getMinhaLista();
    }

    // Cadastra novo Emprestimo
    public boolean inserirEmprestimoBD(String nomeAmigo, String nomeFerramenta, Date dataEmprestimo, Date dataDevolucao, boolean status) {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        int id = this.maiorID() + 1;
        Emprestimo objeto = new Emprestimo(id, nomeAmigo, nomeFerramenta, dataEmprestimo, dataDevolucao, status);
        return emprestimoDAO.inserirEmprestimoBD(objeto);
    }

    // Edita um Emprestimo específico pelo seu campo ID
    public boolean updateEmprestimoBD(int id, String nomeAmigo, String nomeFerramenta, Date dataEmprestimo, Date dataDevolucao, boolean status) {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        Emprestimo objeto = new Emprestimo(id, nomeAmigo, nomeFerramenta, dataEmprestimo, dataDevolucao, status);
        return emprestimoDAO.updateEmprestimoBD(objeto);
    }

    // Deleta um Emprestimo específico pelo seu campo ID
    public boolean deleteEmprestimoBD(int id) {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        return emprestimoDAO.deleteEmprestimoBD(id);
    }

    // Encontra o maior ID entre os empréstimos
    private int maiorID() {
        ArrayList<Emprestimo> lista = getMinhaLista();
        int maior = 0;
        for (Emprestimo emprestimo : lista) {
            if (emprestimo.getId() > maior) {
                maior = emprestimo.getId();
            }
        }
        return maior;
    }
}
