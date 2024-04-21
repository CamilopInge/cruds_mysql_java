
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static modelo.conexion.conection;



public class clase_persona extends conexion {
    
    int id_user;
    String first_name, last_name, email_address,phonenumber;
    
    
    // metodos   
public void guardar(String first_name, String last_name, String email_address, String phonenumber) {
    Connection con;
    try {
        con = conection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO users(first_name, last_name, email_address, phonenumber) VALUES (?, ?, ?, ?)");
        ps.setString(1, first_name);
        ps.setString(2, last_name);
        ps.setString(3, email_address);
        ps.setString(4, phonenumber);

        int res = ps.executeUpdate();

        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Persona Guardada");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Guardar persona");
        }
        con.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar persona: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}

public void buscar(int id_user, JTextField txtID, JTextField txtNAME, JTextField txtLNAME, JTextField txtEMAIL, JTextField txtPHONE, JTextField txtTIME) {
        Connection con;
        try {
            con = conection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE id_user = ?");
            ps.setString(1, String.valueOf(id_user));

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                txtID.setText(rs.getString("id_user"));
                txtNAME.setText(rs.getString("first_name"));
                txtLNAME.setText(rs.getString("last_name"));
                txtEMAIL.setText(rs.getString("email_address"));
                txtPHONE.setText(rs.getString("phonenumber"));
                txtTIME.setText(rs.getString("create_at"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con la clave");
            }

            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar persona: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

public void editar(int id_user,String first_name, String last_name, String email_address, String phonenumber){
        Connection con;
        try {
            con = conection();
            PreparedStatement ps = con.prepareStatement("UPDATE `users` SET `first_name`=?,`last_name`=?,`email_address`=?,`phonenumber`=? WHERE id_user=?");
            ps.setString(1, first_name);
            ps.setString(2, last_name);
            ps.setString(3, email_address);
            ps.setString(4, phonenumber);
            ps.setString(5, String.valueOf(id_user));

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona Modificada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar persona");
            }
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar persona " + e, "ERROR", 0);
        }
}

public void eliminar(int id_user){
        Connection con;

        try {
            con = conection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE id_user=?");
            ps.setInt(1, id_user);

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona Eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar persona", "ERROR AL ELIMINAR", 0);
            }
            con.close();

        } catch (NumberFormatException | SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al eliminar persona " + e, "ERROR", 0);
        }

}

    //Getter & Setter

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getfirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
   
    //Constructor

    public clase_persona(int id_user, String first_name, String last_name, String email_address, String phonenumber) {
        this.id_user = id_user;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.phonenumber = phonenumber;
    }
    
    public clase_persona(String phonenumber, String first_name, String last_name, String email_address) { //datos:persona
        
        this.phonenumber = phonenumber;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
    }
    
    public clase_persona(int id_user) {  //id:user
        this.id_user = id_user;
    }
}
