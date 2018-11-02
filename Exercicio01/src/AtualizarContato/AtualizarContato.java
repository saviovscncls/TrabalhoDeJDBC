/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtualizarContato;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author saviovscncls
 */
public class AtualizarContato {

    public static void main(String[] args) {
        try {
            Connection mysql = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/contato?useSSL=false", "root", "savio123");

            String sql = "update contato set nome = ?, endereco = ?, email = ? where idContato = ?";
            PreparedStatement i = mysql.prepareStatement(sql);

            i.setString(1, "Eva Vasconcelos");
            i.setString(2, "Rua Açucena");
            i.setString(3, "eva@gmail.com");
            i.setInt(4, 1);

            i.execute();

            System.out.println("concluido");
        } catch (Exception e) {
            System.out.println("Erro2");
            throw new RuntimeException(e.getMessage());
        }
    }
}
