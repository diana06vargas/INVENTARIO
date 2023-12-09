package co.edu.ue.entities;

public class CategoriaPagos {
    
    private String cat_codigo;
    private String cat_descripcion;

    public CategoriaPagos(String cat_codigo, String cat_descripcion, String pag_codigo) {
        this.cat_codigo = cat_codigo;
        this.cat_descripcion = cat_descripcion;
    }

    public String getCat_codigo() {
        return cat_codigo;
    }

    public void setCat_codigo(String cat_codigo) {
        this.cat_codigo = cat_codigo;
    }

    public String getCat_descripcion() {
        return cat_descripcion;
    }

    public void setCat_descripcion(String cat_descripcion) {
        this.cat_descripcion = cat_descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CategoriaPagos{");
        sb.append("cat_codigo=").append(cat_codigo);
        sb.append(", cat_descripcion=").append(cat_descripcion);
        sb.append('}');
        return sb.toString();
    }
    
    //holaaaa
    
    
}

