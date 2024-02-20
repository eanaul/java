import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        dbFunctions db = new dbFunctions();
        Connection conn = db.connect_to_db("java","postgres", "12345678" );
//        db.createTable(conn, "siswa");
//        db.insertRow(conn, "siswa", "cuy", "12209999");
//        db.readData(conn, "siswa");
//        System.out.println("\n");
//        db.updateData(conn, "siswa", "cuy", "98765", "cuy");
//        db.readData(conn, "siswa");
//        System.out.println("\n");
//        db.deleteData(conn, "siswa", "cuy");
//        db.readData(conn, "siswa");
//
//        db.searchData(conn, "siswa", "cuy");

        db.dropTb(conn, "siswa");
    }
}