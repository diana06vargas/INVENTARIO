
package co.edu.ue.principal;

import co.edu.ue.util.ConexionDB;

public class Principal {
    
    public static void main (String[]args) {
        ConexionDB cdb = new ConexionDB ();
        cdb.getConexionDB();
    }
    
}
