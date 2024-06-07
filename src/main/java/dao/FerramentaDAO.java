package dao;

import modelo.Ferramentas;
import java.util.ArrayList;
import java.util.List;

public class FerramentaDAO {
    private List<Ferramentas> ferramentas;
    private int proximoId;

    public FerramentaDAO() {
        ferramentas = new ArrayList<>();
        proximoId = 1;
    }

    public boolean inserirFerramenta(Ferramentas ferramenta) {
        ferramenta.setId(proximoId);
        proximoId++;
        return ferramentas.add(ferramenta);
    }

    public boolean updateFerramenta(Ferramentas ferramenta) {
        for (int i = 0; i < ferramentas.size(); i++) {
            if (ferramentas.get(i).getId() == ferramenta.getId()) {
                ferramentas.set(i, ferramenta);
                return true;
            }
        }
        return false;
    }

    public boolean deleteFerramenta(int id) {
        for (Ferramentas ferramenta : ferramentas) {
            if (ferramenta.getId() == id) {
                return ferramentas.remove(ferramenta);
            }
        }
        return false;
    }

    public Ferramentas buscarFerramentaPorId(int id) {
        for (Ferramentas ferramenta : ferramentas) {
            if (ferramenta.getId() == id) {
                return ferramenta;
            }
        }
        return null;
    }

    public List<Ferramentas> listarFerramentas() {
        return new ArrayList<>(ferramentas); // Retorna uma cópia da lista para evitar modificação direta
    }
}