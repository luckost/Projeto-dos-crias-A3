package dao;

import modelo.Ferramentas;
import java.util.ArrayList;

public class FerramentaDAO {

    public static ArrayList<Ferramentas> minhaLista = new ArrayList<>();

    public static ArrayList<Ferramentas> getMinhaLista() {
        return minhaLista;
    }

    public static void setMinhaLista(ArrayList<Ferramentas> minhaLista) {
        FerramentaDAO.minhaLista = minhaLista;
    }

    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId() > maiorID) {
            }
        }
        return maiorID;
    }
}
