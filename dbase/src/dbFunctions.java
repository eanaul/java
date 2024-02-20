import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbFunctions {
    public Connection connect_to_db(String dbname, String usn, String pass){
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,usn,pass);
            if (conn != null){
                System.out.println("Connection established!");
            }else{
                System.out.println("Connection failed");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }

    public void createTable(Connection conn, String table_name){
        Statement statement;
        try{
            String query = "create table "+ table_name + "(id SERIAL, name varchar(255), nis varchar(11), primary key(id));";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table created");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insertRow(Connection conn, String table_name, String name, String nis){
        Statement statement;
        try{
            String query = String.format("insert into %s(name, nis) values ('%s','%s');", table_name, name, nis);
            statement= conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row successfully inserted");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readData(Connection conn, String table_name){
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("select * from %s", table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.print(rs.getString("id") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.println(rs.getString("nis") + " ");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void updateData(Connection conn, String table_name, String name, String nis, String where){
        Statement statement;
        try{
            String query = String.format("update %s set name = '%s', nis = '%s' where name = '%s'", table_name, name, nis, where);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data successfuly changed!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void deleteData(Connection conn, String table_name, String name){
        Statement statement;
        try{
            String query = String.format("delete from %s where name = '%s'", table_name, name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Successfully deleted!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void searchData(Connection conn, String table_name, String name){
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("select * from %s where name = '%s'", table_name, name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                System.out.print(rs.getString("id") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.println(rs.getString("nis") + " ");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void dropTb(Connection conn, String table_name){
        Statement statement;
        try{
            String query = String.format("drop table %s", table_name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("table dropped!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
