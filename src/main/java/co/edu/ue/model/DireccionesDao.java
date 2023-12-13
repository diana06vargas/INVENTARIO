package co.edu.ue.model;

import co.edu.ue.entities.Direcciones;
import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DireccionesDao {
    
   private ConexionDB conDB;
   PreparedStatement statement;
   
   public DireccionesDao(){
    conDB = new ConexionDB();
    this.statement = null;
   }
    
   public Direcciones addDireccion(Direcciones direccion){
      
       Connection conn = this.conDB.getConexionDB();
       String query ="INSERT direcciones VALUES(null,?,?)";
       
try{
            if(this.statement==null){
                this.statement=conn.prepareStatement(query);                
                this.statement.setString(1, direccion.getDir_codigoPostal());
                this.statement.setString(2, direccion.getDir_descripcion());
                int response = this.statement.executeUpdate();
                if(response>0) JOptionPane.showMessageDialog(null, "Se ha agregado una dirección");
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
        return direccion;
    }

    public void addDir(Direcciones direccions) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
