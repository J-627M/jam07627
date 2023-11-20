package Waza;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class conexion {

    Connection conectar = null;

    String usuario = "root";
    String contraseña = "1234";
    String bd = "bdpersonas";
    String ip = "localhost";
    String puerto = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection bdConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "la coneccion se concreto");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion: " + e.toString());

        }
        return conectar;
    }
    
    
    

}
