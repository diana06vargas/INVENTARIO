package co.edu.ue.model;

import co.edu.ue.entities.Telefonos;
import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class TelefonosDao {
    
   private ConexionDB conDB;
   PreparedStatement statement;
   
   public TelefonosDao(){
    conDB = new ConexionDB();
    this.statement = null;
   }
    
   public Telefonos addTelefono(Telefonos telefono){
       
       Connection conn = this.conDB.getConexionDB();
       String query ="INSERT telefonos VALUES(null,?,?)";
       
try{
            if(this.statement==null){
                this.statement=conn.prepareStatement(query);                
                this.statement.setString(2, telefono.getTel_numero());
                this.statement.setString(1, telefono.getTel_dominio());
                int response = this.statement.executeUpdate();
                if(response>0) JOptionPane.showMessageDialog(null, "Se ha agregado un telefono");
            }
        }catch(Exception e){
            System.out.println(""+e.toString());
            
        }finally{
            if(conn!=null){
                try {
                    this.statement.close();
                    conn.close();
                } catch (Exception e) {
                    System.out.println(""+e.toString());
                }
            }
        }
        return telefono;
    }

    public void addTel(Telefonos telefono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
