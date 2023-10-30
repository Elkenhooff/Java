package sqlconnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws SQLException{
        Connection conexao = SqlConnection.conectar();
        
        if (conexao != null){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Qual nome você deseja inserir no banco de dados?");
            String nome = input.nextLine();
            
            String sql = "INSERT INTO teste (nome) VALUES ('" + nome + "')";

            Statement teste = conexao.createStatement();
            
            teste.executeUpdate(sql);
            
            teste.close();
            conexao.close();
        }
        else{
            System.out.println("Erro na conexão ao banco de dados");
        }
    }
}
