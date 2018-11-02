/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deletar;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author saviovscncls
 */
public class DeletarContato {

    public static void main(String[] args) {
        try {
            Connection mysql = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/contato?useSSL=false", "root", "savio123");

            String sql = "delete from contato where idContato = ?";
            PreparedStatement i = mysql.prepareStatement(sql);
            i.setInt(1, 3);
            i.execute();

            System.out.println("concluido");
        } catch (Exception e) {
            System.out.println("Erro2");
            throw new RuntimeException(e.getMessage());
        }
    }
}
