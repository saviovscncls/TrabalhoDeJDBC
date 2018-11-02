/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaContatos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author saviovscncls
 */
public class Listar {
    public static void main(String[] args) {
        try{
        Connection mysql = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/contato?useSSL=false", "root", "savio123");
            Statement st = mysql.createStatement();
            
            st.executeQuery("select * from contato");
            
            ResultSet rs = st.getResultSet();
            
            while (rs.next()){
                
                System.out.println("nome: " + rs.getString("nome"));
                System.out.println("Endereço: " + rs.getString("endereco"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("#######################");
                
                
            }          
           

            System.out.println("concluido");
        } catch (Exception e) {
            System.out.println("Erro3");
            throw new RuntimeException(e.getMessage());
        }
    }
}
