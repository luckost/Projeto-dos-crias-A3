package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BDConnection {
    private static final Logger LOGGER = Logger.getLogger(BDConnection.class.getName());
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados"; // Atualize com o URL do seu banco de dados
    private static final String USER = "root"; // Atualize com seu usuário do banco de dados
    private static final String PASSWORD = "252426cd"; // Atualize com sua senha do banco de dados

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao estabelecer conexão com o banco de dados", e);
            return null;
        }
    }
}
