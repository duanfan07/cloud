import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class testMysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/df?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","123.");
        Statement statement = connection.createStatement();
        boolean execute = statement.execute(" select * from payment");
        System.out.println(execute);
    }
}
