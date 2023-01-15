package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author teguh8464_
 */

public class Koneksi {

    private static final String URL = "jdbc:mysql://localhost/krs_java";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getKoneksi(){
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL,USER,PASS);
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            System.err.println("Error getKoneksi(): " + e.getMessage());
            return con = null;
        }
    }
    
    public static void main(String[] args) {
        getKoneksi();
    } 
}
