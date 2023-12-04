
package co.edu.ue.entities;

public class Proveedores {
    
    private String prov_nit;
    private String prov_nombreEmpresas;
    private String prov_descripcion;
    private String tel_codigo;
    private String dir_codigo;
    private String corr_codigo;

    public Proveedores(String prov_nit, String prov_nombreEmpresas, String prov_descripcion, String tel_codigo, String dir_codigo, String corr_codigo) {
        this.prov_nit = prov_nit;
        this.prov_nombreEmpresas = prov_nombreEmpresas;
        this.prov_descripcion = prov_descripcion;
        this.tel_codigo = tel_codigo;
        this.dir_codigo = dir_codigo;
        this.corr_codigo = corr_codigo;
    }

    public String getProv_nit() {
        return prov_nit;
    }

    public void setProv_nit(String prov_nit) {
        this.prov_nit = prov_nit;
    }

    public String getProv_nombreEmpresas() {
        return prov_nombreEmpresas;
    }

    public void setProv_nombreEmpresas(String prov_nombreEmpresas) {
        this.prov_nombreEmpresas = prov_nombreEmpresas;
    }

    public String getProv_descripcion() {
        return prov_descripcion;
    }

    public void setProv_descripcion(String prov_descripcion) {
        this.prov_descripcion = prov_descripcion;
    }

    public String getTel_codigo() {
        return tel_codigo;
    }

    public void setTel_codigo(String tel_codigo) {
        this.tel_codigo = tel_codigo;
    }

    public String getDir_codigo() {
        return dir_codigo;
    }

    public void setDir_codigo(String dir_codigo) {
        this.dir_codigo = dir_codigo;
    }

    public String getCorr_codigo() {
        return corr_codigo;
    }

    public void setCorr_codigo(String corr_codigo) {
        this.corr_codigo = corr_codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proveedores{");
        sb.append("prov_nit=").append(prov_nit);
        sb.append(", prov_nombreEmpresas=").append(prov_nombreEmpresas);
        sb.append(", prov_descripcion=").append(prov_descripcion);
        sb.append(", tel_codigo=").append(tel_codigo);
        sb.append(", dir_codigo=").append(dir_codigo);
        sb.append(", corr_codigo=").append(corr_codigo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
