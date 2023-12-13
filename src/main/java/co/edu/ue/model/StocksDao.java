package co.edu.ue.model;

import co.edu.ue.entities.Clientes;
import co.edu.ue.entities.Stocks;
import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class StocksDao {
    
   private ConexionDB conDB;
   PreparedStatement statement;
   
   public StocksDao(){
    conDB = new ConexionDB();
    this.statement = null;
   }
    
   public Stocks addStock(Stocks stock){
       
       Connection conn = this.conDB.getConexionDB();
       String query ="INSERT stocks VALUES(null,?,?,?,?,null,null,?)";
       
       try {
           if(this.statement==null){
               this.statement = conn.prepareStatement(query);
               this.statement.setString(2, stock.getProd_cantidad());
               this.statement.setString(3, stock.getProd_precio());
               this.statement.setString(4, stock.getDetal_descripcion());
           }   this.statement.setDate(5, stock.getDetal_fechastock());
               this.statement.setString(8, stock.getProd_lote());
                int response = this.statement.executeUpdate();
                if(response>0) JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo stock");
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
        return stock;
    }

    public void addStcks (Stocks stock) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
