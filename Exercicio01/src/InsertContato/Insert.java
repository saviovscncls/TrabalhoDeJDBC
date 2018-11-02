package InsertContato;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author saviovscncls
 */
public class Insert {

    public static void main(String[] args) {
        String conexao;
        try {
            Connection mysql = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/contato?useSSL=false", "root", "savio123");

            String sql = "insert into contato (idContato, nome, endereco, email) values ('3','savio pinheiro','AV. fim do mundo','savio@gmail.com')";

            PreparedStatement i = mysql.prepareStatement(sql);

            i.execute();

            System.out.println("Cadastrado");
        } catch (Exception e) {
            System.out.println("Erro");
            throw new RuntimeException(e.getMessage());

        }
    }
}
