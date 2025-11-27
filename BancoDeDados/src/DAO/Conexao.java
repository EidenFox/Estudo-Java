package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() {
        try {
            String url = "jdbc:mysql://localhost:3306/JavaDB";  //URL
            String user = "root";   //Alterar para o user do seu banco
            String password = "SENHA!"; //Aletar para a senha do seu banco
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }
}
