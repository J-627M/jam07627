package Waza;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Personas {

    int codigo;
    String nombresPersonas;
    String apellidosPersonas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombresPersonas() {
        return nombresPersonas;
    }

    public void setNombresPersonas(String nombresPersonas) {
        this.nombresPersonas = nombresPersonas;
    }

    public String getApellidosPersonas() {
        return apellidosPersonas;
    }

    public void setApellidosPersonas(String apellidosPersonas) {
        this.apellidosPersonas = apellidosPersonas;
    }

    public void InsertarPersona(JTextField txtNombre, JTextField txtApellido) {
        setNombresPersonas(txtNombre.getText());
        setApellidosPersonas(txtApellido.getText());

        conexion objCon = new conexion();

        String consulta = "insert into Personas (nombres,apellidos) values (?,?);";

        try {
            CallableStatement wz = objCon.bdConexion().prepareCall(consulta);

            wz.setString(1, getNombresPersonas());
            wz.setString(2, getApellidosPersonas());

            wz.execute();

            JOptionPane.showMessageDialog(null, "se inserto!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se inserto, error" + e.toString());
        }

    }

    public void MostrarPersonas(JTable haloPersonas) throws SQLException {

        conexion objCon = new conexion();
        DefaultTableModel modelo = new DefaultTableModel();

        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        haloPersonas.setRowSorter(OrdenarTabla);
        String sql = "";

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");

        haloPersonas.setModel(modelo);

        sql = "select * from Personas;";

        String[] datos = new String[3];

        Statement st;

        try {
            st = objCon.bdConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            haloPersonas.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar");
        }

    }
    
 public void SeleccionarPersona (JTable tblPersonas, JTextField txtID, JTextField txtNombre, JTextField txtApellido){
   
     
     try {
         int fila = tblPersonas.getSelectedRow();
         if (fila >= 0){
         txtID.setText( (tblPersonas.getValueAt(fila,0).toString()));
         txtNombre.setText((tblPersonas.getValueAt(fila,1).toString()));
         txtApellido.setText( (tblPersonas.getValueAt(fila,2).toString()));
     }
         else{
             JOptionPane.showMessageDialog(null,"fila no seleccionada");
         }
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"Error de seleccion, error:"+ e.toString());
     }
 }
public void ModificarPersonas (JTextField pCodigo, JTextField txtNombres, JTextField txtApellidos){
    setCodigo(Integer.parseInt(pCodigo.getText()));
    setNombresPersonas(txtNombres.getText());
    setApellidosPersonas(txtApellidos.getText());
    
    conexion objCon = new conexion();
    String consulta ="update Personas Set personas.nombres = ?, personas.apellidos = ? where personas.id=?;";
    
    try {
        CallableStatement cs = objCon.bdConexion().prepareCall(consulta);
        cs.setString(1, getNombresPersonas());
        cs.setString(2, getApellidosPersonas());
        cs.setInt(3,getCodigo());
        
        cs.execute();
        
        JOptionPane.showMessageDialog(null, "Modificacion Completa");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"no se modifico"+e.toString());
    }
   
}
public void EliminarAlumnos(JTextField pCodigo){
    setCodigo(Integer.parseInt(pCodigo.getText()));
    conexion objCon = new conexion();
    String consulta = "delete from personas where personas.id = ?;";
    try {
        CallableStatement cs = objCon.bdConexion().prepareCall(consulta);
        cs.setInt(1, getCodigo());
        cs.execute();
        JOptionPane.showMessageDialog(null, "es elimino correctamente");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"no se elimino"+e.toString());
    }
}
}
