package co.edu.ue.model;

import co.edu.ue.entities.Clientes;
import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClientesDao {
    
   private ConexionDB conDB;
   PreparedStatement statement;
   
   public ClientesDao(){
    conDB = new ConexionDB();
    this.statement = null;
   }
    
   public Clientes addCliente(Clientes cliente){
       
       Connection conn = this.conDB.getConexionDB();
       String query ="INSERT clientes VALUES(?,?,?,?, null, null, null)";
       
       try {
           if(this.statement==null){
               this.statement = conn.prepareStatement(query);
               this.statement.setString(0, cliente.getCli_documento());
               this.statement.setString(1, cliente.getCli_nombres());
               this.statement.setString(2, cliente.getCli_apellidos());
               this.statement.setString(3, cliente.getCli_contraseña());
               
           }
       } catch (Exception e) {
       }
       
       
       
   return cliente;
   }

    public void addUser(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
