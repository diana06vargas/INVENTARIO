
package co.edu.ue.entities;

import java.sql.Date;

public class CompraClientes {
    
    private int comp_codigo;
    private String comp_monto;
    private String comp_descripcion;
    private String cli_documento;
    private int cat_codigo;
    private Date comp_fecha;

    public CompraClientes(String comp_monto, String comp_descripcion, String cli_documento, int cat_codigo, Date comp_fecha) {
        this.comp_monto = comp_monto;
        this.comp_descripcion = comp_descripcion;
        this.cli_documento = cli_documento;
        this.cat_codigo = cat_codigo;
        this.comp_fecha = comp_fecha;
    }

    public int getComp_codigo() {
        return comp_codigo;
    }

    public void setComp_codigo(int comp_codigo) {
        this.comp_codigo = comp_codigo;
    }

    public String getComp_monto() {
        return comp_monto;
    }

    public void setComp_monto(String comp_monto) {
        this.comp_monto = comp_monto;
    }

    public String getComp_descripcion() {
        return comp_descripcion;
    }

    public void setComp_descripcion(String comp_descripcion) {
        this.comp_descripcion = comp_descripcion;
    }

    public String getCli_documento() {
        return cli_documento;
    }

    public void setCli_documento(String cli_documento) {
        this.cli_documento = cli_documento;
    }

    public int getCat_codigo() {
        return cat_codigo;
    }

    public void setCat_codigo(int cat_codigo) {
        this.cat_codigo = cat_codigo;
    }

    public Date getComp_fecha() {
        return comp_fecha;
    }

    public void setComp_fecha(Date comp_fecha) {
        this.comp_fecha = comp_fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompraClientes{");
        sb.append("comp_codigo=").append(comp_codigo);
        sb.append(", comp_monto=").append(comp_monto);
        sb.append(", comp_descripcion=").append(comp_descripcion);
        sb.append(", cli_documento=").append(cli_documento);
        sb.append(", cat_codigo=").append(cat_codigo);
        sb.append(", comp_fecha=").append(comp_fecha);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
