
package co.edu.ue.entities;


public class DetalleCompras {
    
    private String deta_codigo;
    private String deta_descripcion;
    private String deta_cantiodadProducto;
    private String deta_monto;
    private String prov_nit;
    private String prod_codigo;

    public DetalleCompras(String deta_codigo, String deta_descripcion, String deta_cantiodadProducto, String deta_monto, String prov_nit, String prod_codigo) {
        this.deta_codigo = deta_codigo;
        this.deta_descripcion = deta_descripcion;
        this.deta_cantiodadProducto = deta_cantiodadProducto;
        this.deta_monto = deta_monto;
        this.prov_nit = prov_nit;
        this.prod_codigo = prod_codigo;
    }

    public String getDeta_codigo() {
        return deta_codigo;
    }

    public void setDeta_codigo(String deta_codigo) {
        this.deta_codigo = deta_codigo;
    }

    public String getDeta_descripcion() {
        return deta_descripcion;
    }

    public void setDeta_descripcion(String deta_descripcion) {
        this.deta_descripcion = deta_descripcion;
    }

    public String getDeta_cantiodadProducto() {
        return deta_cantiodadProducto;
    }

    public void setDeta_cantiodadProducto(String deta_cantiodadProducto) {
        this.deta_cantiodadProducto = deta_cantiodadProducto;
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

    public String getProd_codigo() {
        return prod_codigo;
    }

    public void setProd_codigo(String prod_codigo) {
        this.prod_codigo = prod_codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetalleCompras{");
        sb.append("deta_codigo=").append(deta_codigo);
        sb.append(", deta_descripcion=").append(deta_descripcion);
        sb.append(", deta_cantiodadProducto=").append(deta_cantiodadProducto);
        sb.append(", deta_monto=").append(deta_monto);
        sb.append(", prov_nit=").append(prov_nit);
        sb.append(", prod_codigo=").append(prod_codigo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
