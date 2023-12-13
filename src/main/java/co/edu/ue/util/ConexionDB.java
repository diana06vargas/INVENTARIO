package co.edu.ue.util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionDB {
    private String user;
    private String password;
    private String dataBase;
    private String portDataBase;
    private String server;
    private String strConexion;
    private Connection con;
    
    //Mtdo Constructor
    
    public ConexionDB(){
        this.user="root";
        this.password="";
        this.dataBase="final_poo";
        this.portDataBase="3306";
        this.server="localhost";
        this.strConexion="jdbc:mysql://"+this.server+":"+this.portDataBase+"/"+this.dataBase;
        this.con = null;
    }   
    
    private Connection conexionDataBase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection(this.strConexion,this.user,this.password);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en la Conexión"+e.toString());  
        }
        return this.con;
    }
    
    public Connection getConexionDB(){
        return this.conexionDataBase();
    }
}