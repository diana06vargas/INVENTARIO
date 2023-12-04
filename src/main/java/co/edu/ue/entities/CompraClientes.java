
package co.edu.ue.entities;

public class CompraClientes {
    
    private String comp_codigo;
    private String comp_monto;
    private String comp_descripcion;
    private String comp_cantidadProducto;
    private String cli_documento;
    private String pag_codigo;

    public CompraClientes(String comp_codigo, String comp_monto, String comp_descripcion, String comp_cantidadProducto, String cli_documento, String pag_codigo) {
        this.comp_codigo = comp_codigo;
        this.comp_monto = comp_monto;
        this.comp_descripcion = comp_descripcion;
        this.comp_cantidadProducto = comp_cantidadProducto;
        this.cli_documento = cli_documento;
        this.pag_codigo = pag_codigo;
    }

    public String getComp_codigo() {
        return comp_codigo;
    }

    public void setComp_codigo(String comp_codigo) {
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

    public String getComp_cantidadProducto() {
        return comp_cantidadProducto;
    }

    public void setComp_cantidadProducto(String comp_cantidadProducto) {
        this.comp_cantidadProducto = comp_cantidadProducto;
    }

    public String getCli_documento() {
        return cli_documento;
    }

    public void setCli_documento(String cli_documento) {
        this.cli_documento = cli_documento;
    }

    public String getPag_codigo() {
        return pag_codigo;
    }

    public void setPag_codigo(String pag_codigo) {
        this.pag_codigo = pag_codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompraClientes{");
        sb.append("comp_codigo=").append(comp_codigo);
        sb.append(", comp_monto=").append(comp_monto);
        sb.append(", comp_descripcion=").append(comp_descripcion);
        sb.append(", comp_cantidadProducto=").append(comp_cantidadProducto);
        sb.append(", cli_documento=").append(cli_documento);
        sb.append(", pag_codigo=").append(pag_codigo);
        sb.append('}');
        return sb.toString();
    }

    
    
}
