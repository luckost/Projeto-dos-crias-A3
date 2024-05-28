/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Amigo;
import java.util.ArrayList;

public class AmigoDAO {

    public static ArrayList<Amigo> minhaLista = new ArrayList<>();

    public static ArrayList<Amigo> getMinhaLista() {
        return minhaLista;
    }

    public static void setMinhaLista(ArrayList<Amigo> minhaLista) {
        AmigoDAO.minhaLista = minhaLista;
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
