import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static Connection con;
    public static Statement stm;

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/tutorial";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("Koneksi berhasil");
        }catch (Exception e){
            System.err.println("Koneksi gagal " + e.getMessage());
        }
    }
}