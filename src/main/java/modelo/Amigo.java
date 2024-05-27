package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;
import java.sql.SQLException;


public class Amigo {
// Atributos

    private int id;
    private String nome;
    private String telefone;
    private final AmigoDAO dao;
    public Amigo(){
        this.dao = new AmigoDAO();
    }  
}
