package Desplegables;

import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Telefonos {
    public void Tel (String tabla, String valor, JComboBox combo){
        String query="select * from " +tabla;//Casi me da un error por no darle espacio entre from y +tabla
        ConexionDB con = new ConexionDB();
        Statement st;
        Connection conexion = con.getConexionDB();
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                combo.addItem(rs.getString(valor));
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error:"+e.toString());
        }
        
        
    }
    
}