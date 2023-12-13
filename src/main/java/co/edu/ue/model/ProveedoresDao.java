package co.edu.ue.model;

import co.edu.ue.entities.Proveedores;
import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ProveedoresDao {
    
   private ConexionDB conDB;
   PreparedStatement statement;
   
   public ProveedoresDao(){
    conDB = new ConexionDB();
    this.statement = null;
   }
    
   public Proveedores addProveedor(Proveedores proveedor){
       
       Connection conn = this.conDB.getConexionDB();
       String query ="INSERT proveedores VALUES(?,?,?, null, null, null)";
       
       try {
           if(this.statement==null){
               this.statement = conn.prepareStatement(query);
               this.statement.setString(0, proveedor.getProv_nit());
               this.statement.setString(1, proveedor.getProv_nombreEmpresas());
               this.statement.setString(2, proveedor.getProv_descripcion());
                int response = this.statement.executeUpdate();
                if(response>0) JOptionPane.showMessageDialog(null, "Se ha agregado una proveedor");
               
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
        return proveedor;
    }

    public void addProv(Proveedores proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
