
package co.edu.ue.entities;

import java.sql.Date;

public class Stocks {
    
    private String prod_precio;
    private String prod_cantidad;
    private int detal_codigo;
    private String detal_descripcion;
    private Date detal_fechastock;
    private String emp_codigo;
    private int prod_codigo;
    private String prod_lote;

    public Stocks(String prod_precio, String prod_cantidad, String detal_descripcion, Date detal_fechastock, String emp_codigo, int prod_codigo, String prod_lote) {
        this.prod_precio = prod_precio;
        this.prod_cantidad = prod_cantidad;
        this.detal_descripcion = detal_descripcion;
        this.detal_fechastock = detal_fechastock;
        this.emp_codigo = emp_codigo;
        this.prod_codigo = prod_codigo;
        this.prod_lote = prod_lote;
    }

    public String getProd_precio() {
        return prod_precio;
    }

    public void setProd_precio(String prod_precio) {
        this.prod_precio = prod_precio;
    }

    public String getProd_cantidad() {
        return prod_cantidad;
    }

    public void setProd_cantidad(String prod_cantidad) {
        this.prod_cantidad = prod_cantidad;
    }

    public int getDetal_codigo() {
        return detal_codigo;
    }

    public void setDetal_codigo(int detal_codigo) {
        this.detal_codigo = detal_codigo;
    }

    public String getDetal_descripcion() {
        return detal_descripcion;
    }

    public void setDetal_descripcion(String detal_descripcion) {
        this.detal_descripcion = detal_descripcion;
    }

    public Date getDetal_fechastock() {
        return detal_fechastock;
    }

    public void setDetal_fechastock(Date detal_fechastock) {
        this.detal_fechastock = detal_fechastock;
    }

    public String getEmp_codigo() {
        return emp_codigo;
    }

    public void setEmp_codigo(String emp_codigo) {
        this.emp_codigo = emp_codigo;
    }

    public int getProd_codigo() {
        return prod_codigo;
    }

    public void setProd_codigo(int prod_codigo) {
        this.prod_codigo = prod_codigo;
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
        sb.append("Stocks{");
        sb.append("prod_precio=").append(prod_precio);
        sb.append(", prod_cantidad=").append(prod_cantidad);
        sb.append(", detal_codigo=").append(detal_codigo);
        sb.append(", detal_descripcion=").append(detal_descripcion);
        sb.append(", detal_fechastock=").append(detal_fechastock);
        sb.append(", emp_codigo=").append(emp_codigo);
        sb.append(", prod_codigo=").append(prod_codigo);
        sb.append(", prod_lote=").append(prod_lote);
        sb.append('}');
        return sb.toString();
    }

    
}
