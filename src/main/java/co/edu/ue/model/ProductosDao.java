/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ue.model;

import co.edu.ue.entities.Productos;
import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class ProductosDao {
    
     private ConexionDB conDB;
   PreparedStatement statement;
   
   public ProductosDao(){
    conDB = new ConexionDB();
    this.statement = null;
   }
    
   public Productos addProducto(Productos producto){
       
       Connection conn = this.conDB.getConexionDB();
       String query ="INSERT productos VALUES(null,?,?)";
       
       try {
           if(this.statement==null){
               this.statement = conn.prepareStatement(query);
               this.statement.setString(1, producto.getProd_descripcion());
               this.statement.setString(2, producto.getProd_lote());
                int response = this.statement.executeUpdate();
                if(response>0) JOptionPane.showMessageDialog(null, "Se ha agregado un producto");
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
        return producto;
    }
    public void addProd(Productos producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
