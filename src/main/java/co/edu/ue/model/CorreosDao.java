package co.edu.ue.model;

import co.edu.ue.entities.Correos;
import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CorreosDao {
       
   private ConexionDB conDB;
   PreparedStatement statement;
   
   public CorreosDao(){
    conDB = new ConexionDB();
    this.statement = null;
   }
    
   public Correos addCorreo(Correos correo){
       
       Connection conn = this.conDB.getConexionDB();
       String query ="INSERT correos VALUES(null,?,?)";
       
try{
            if(this.statement==null){
                this.statement=conn.prepareStatement(query);                
                this.statement.setString(1, correo.getCorr_usuario());
                this.statement.setString(2, correo.getCorr_dominio());
                int response = this.statement.executeUpdate();
                if(response>0) JOptionPane.showMessageDialog(null, "Se ha agregado un correo");
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
        return correo;
    }


    public void addCorr(Correos correo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
