package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/medetec_pedrodavid";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void desconectar(Connection conexao){
        if (conexao != null){
            try{
                conexao.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
