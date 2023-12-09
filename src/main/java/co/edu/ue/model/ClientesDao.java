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
       String query ="INSERT clientes VALUES(?,?,?)";
       String queryTel ="INSERT telefonos VALUES(NULL,?,?)";
       String queryCorr ="INSERT correos VALUES(NULL,?,?)";
       String queryDir ="INSERT direcciones VALUES(NULL,?,?)";
       
       try {
           if(this.statement==null){
               this.statement = conn.prepareStatement(query);
               this.statement.setString(0, cliente.getCli_documento());
               this.statement.setString(1, cliente.getCli_nombres());
               this.statement.setString(2, cliente.getCli_apellidos());
               this.statement = conn.prepareStatement(queryTel);
               this.statement.setString(1, cliente.getTel_codigo());
               this.statement = conn.prepareStatement(queryCorr);
               this.statement.setString(1, cliente.getCorr_codigo());
               this.statement = conn.prepareStatement(queryDir);
               this.statement.setString(1, cliente.getDir_codigo());
               
           }
       } catch (Exception e) {
       }
       
       
       
   return cliente;
   }

    public void addUser(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
