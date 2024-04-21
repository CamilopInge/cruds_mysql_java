
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class conexion {

    public static Connection conection() {
        Connection con = null;
        String URL="jdbc:mysql://127.0.0.1/prueba_user"; //prueba_user is DB
        String USER="root";
        String PASSWORD="";
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement st = con.createStatement();
            System.out.println("CONEXION EXITOSA");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Fallida " + e, " conexion", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}
