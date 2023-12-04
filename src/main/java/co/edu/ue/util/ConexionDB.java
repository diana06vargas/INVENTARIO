/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        this.dataBase="proyecto_poobd";
        this.portDataBase="3306";
        this.server="localhost";
        this.strConexion="jdbc:mysql://"+this.server+":"+this.portDataBase+"/"+this.dataBase;
        this.con = null;
    }   
    
    private Connection conexionDataBase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection(this.strConexion,this.user,this.password);
            JOptionPane.showMessageDialog(null, "Se establecio Conexión");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en la Conexión"+e.toString());  
        }
        return this.con;
    }
    
    public Connection getConexionDB(){
        return this.conexionDataBase();
    }
}