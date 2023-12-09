/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ue.model;

import co.edu.ue.entities.Productos;
import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ProductosDao {
    
     private ConexionDB conDB;
   PreparedStatement statement;
   
   public ProductosDao(){
    conDB = new ConexionDB();
    this.statement = null;
   }
    
   public Productos addProducto(Productos cliente){
       
       Connection conn = this.conDB.getConexionDB();
       String query ="INSERT Productos VALUES(?,?,?,?,?,?)";
       
       try {
           if(this.statement==null){
               this.statement = conn.prepareStatement(query);
           }
       } catch (Exception e) {
       }
       
   return cliente;
   }

    public void addUser(Productos clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
