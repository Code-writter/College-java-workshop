import java.sql.Connection;                           
import java.sql.DriverManager ;
import java.sql.Statement ;




public class App {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college/root/");
            Statement smt = cn.createStatement();
            int i = smt.executeUpdate("insert into employee values (1001, 'Amit', 800.8)");
            
            System.out.println("Data inserted");
            cn.close();
        } catch (Exception e) {
                System.err.println("Error while inserting"+ e);
        }
    }
}
