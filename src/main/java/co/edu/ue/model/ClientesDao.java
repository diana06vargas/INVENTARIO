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
       String query ="INSERT Clientes VALUES(?,?,?,?,?,?)";
       
       try {
           if(this.statement==null){
               this.statement = conn.prepareStatement(query);
           }
       } catch (Exception e) {
       }
       
   return cliente;
   }

    public void addUser(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
