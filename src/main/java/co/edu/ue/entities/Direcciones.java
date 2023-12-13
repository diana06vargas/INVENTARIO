
package co.edu.ue.entities;


public class Direcciones {
    
    private int dir_codigo;
    private String dir_descripcion;
    private String dir_codigoPostal;

    public Direcciones(String dir_descripcion, String dir_codigoPostal) {
        this.dir_descripcion = dir_descripcion;
        this.dir_codigoPostal = dir_codigoPostal;
    }

    public int getDir_codigo() {
        return dir_codigo;
    }

    public void setDir_codigo(int dir_codigo) {
        this.dir_codigo = dir_codigo;
    }

    public String getDir_descripcion() {
        return dir_descripcion;
    }

    public void setDir_descripcion(String dir_descripcion) {
        this.dir_descripcion = dir_descripcion;
    }

    public String getDir_codigoPostal() {
        return dir_codigoPostal;
    }

    public void setDir_codigoPostal(String dir_codigoPostal) {
        this.dir_codigoPostal = dir_codigoPostal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Direcciones{");
        sb.append("dir_codigo=").append(dir_codigo);
        sb.append(", dir_descripcion=").append(dir_descripcion);
        sb.append(", dir_codigoPostal=").append(dir_codigoPostal);
        sb.append('}');
        return sb.toString();
    }
    
    
        
}
