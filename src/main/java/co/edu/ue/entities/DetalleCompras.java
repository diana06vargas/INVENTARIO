
package co.edu.ue.entities;


public class DetalleCompras {
    
    private int deta_codigo;
    private String deta_descripcion;
    private String deta_cantidadProducto;
    private String deta_monto;
    private String prov_nit;
    private int prod_codigo;

    public DetalleCompras(String deta_descripcion, String deta_cantidadProducto, String deta_monto, String prov_nit, int prod_codigo) {
        this.deta_descripcion = deta_descripcion;
        this.deta_cantidadProducto = deta_cantidadProducto;
        this.deta_monto = deta_monto;
        this.prov_nit = prov_nit;
        this.prod_codigo = prod_codigo;
    }

    public int getDeta_codigo() {
        return deta_codigo;
    }

    public void setDeta_codigo(int deta_codigo) {
        this.deta_codigo = deta_codigo;
    }

    public String getDeta_descripcion() {
        return deta_descripcion;
    }

    public void setDeta_descripcion(String deta_descripcion) {
        this.deta_descripcion = deta_descripcion;
    }

    public String getDeta_cantidadProducto() {
        return deta_cantidadProducto;
    }

    public void setDeta_cantidadProducto(String deta_cantidadProducto) {
        this.deta_cantidadProducto = deta_cantidadProducto;
    }

    public String getDeta_monto() {
        return deta_monto;
    }

    public void setDeta_monto(String deta_monto) {
        this.deta_monto = deta_monto;
    }

    public String getProv_nit() {
        return prov_nit;
    }

    public void setProv_nit(String prov_nit) {
        this.prov_nit = prov_nit;
    }

    public int getProd_codigo() {
        return prod_codigo;
    }

    public void setProd_codigo(int prod_codigo) {
        this.prod_codigo = prod_codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetalleCompras{");
        sb.append("deta_codigo=").append(deta_codigo);
        sb.append(", deta_descripcion=").append(deta_descripcion);
        sb.append(", deta_cantidadProducto=").append(deta_cantidadProducto);
        sb.append(", deta_monto=").append(deta_monto);
        sb.append(", prov_nit=").append(prov_nit);
        sb.append(", prod_codigo=").append(prod_codigo);
        sb.append('}');
        return sb.toString();
    }

    
    
}
