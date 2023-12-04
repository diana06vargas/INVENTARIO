
package co.edu.ue.entities;

public class Productos {
    
    private String prod_codigo;
    private String prod_descripcion;
    private String prod_cantidad;
    private String prod_precio;

    public Productos(String prod_codigo, String prod_descripcion, String prod_cantidad, String prod_precio) {
        this.prod_codigo = prod_codigo;
        this.prod_descripcion = prod_descripcion;
        this.prod_cantidad = prod_cantidad;
        this.prod_precio = prod_precio;
    }

    public String getProd_codigo() {
        return prod_codigo;
    }

    public void setProd_codigo(String prod_codigo) {
        this.prod_codigo = prod_codigo;
    }

    public String getProd_descripcion() {
        return prod_descripcion;
    }

    public void setProd_descripcion(String prod_descripcion) {
        this.prod_descripcion = prod_descripcion;
    }

    public String getProd_cantidad() {
        return prod_cantidad;
    }

    public void setProd_cantidad(String prod_cantidad) {
        this.prod_cantidad = prod_cantidad;
    }

    public String getProd_precio() {
        return prod_precio;
    }

    public void setProd_precio(String prod_precio) {
        this.prod_precio = prod_precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{");
        sb.append("prod_codigo=").append(prod_codigo);
        sb.append(", prod_descripcion=").append(prod_descripcion);
        sb.append(", prod_cantidad=").append(prod_cantidad);
        sb.append(", prod_precio=").append(prod_precio);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
