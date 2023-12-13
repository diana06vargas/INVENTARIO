
package co.edu.ue.entities;

import java.util.Calendar;

public class Productos {
    
    private int prod_codigo;
    private String prod_descripcion;
    private String prod_lote;

    public Productos(String prod_descripcion, String prod_lote) {
        this.prod_descripcion = prod_descripcion;
        this.prod_lote = prod_lote;
    }

    public int getProd_codigo() {
        return prod_codigo;
    }

    public void setProd_codigo(int prod_codigo) {
        this.prod_codigo = prod_codigo;
    }

    public String getProd_descripcion() {
        return prod_descripcion;
    }

    public void setProd_descripcion(String prod_descripcion) {
        this.prod_descripcion = prod_descripcion;
    }

    public String getProd_lote() {
        return prod_lote;
    }

    public void setProd_lote(String prod_lote) {
        this.prod_lote = prod_lote;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{");
        sb.append("prod_codigo=").append(prod_codigo);
        sb.append(", prod_descripcion=").append(prod_descripcion);
        sb.append(", prod_lote=").append(prod_lote);
        sb.append('}');
        return sb.toString();
    }
    
}
