
package co.edu.ue.entities;

public class Administrador {
    
    private String admin_documento;
    private String admin_nombres;
    private String admin_apellidos;
    private int tel_codigo;
    private int dir_codigo;
    private int corr_codigo;

    public Administrador(String admin_documento, String admin_nombres, String admin_apellidos, int tel_codigo, int dir_codigo, int corr_codigo) {
        this.admin_documento = admin_documento;
        this.admin_nombres = admin_nombres;
        this.admin_apellidos = admin_apellidos;
        this.tel_codigo = tel_codigo;
        this.dir_codigo = dir_codigo;
        this.corr_codigo = corr_codigo;
    }

    public String getAdmin_documento() {
        return admin_documento;
    }

    public void setAdmin_documento(String admin_documento) {
        this.admin_documento = admin_documento;
    }

    public String getAdmin_nombres() {
        return admin_nombres;
    }

    public void setAdmin_nombres(String admin_nombres) {
        this.admin_nombres = admin_nombres;
    }

    public String getAdmin_apellidos() {
        return admin_apellidos;
    }

    public void setAdmin_apellidos(String admin_apellidos) {
        this.admin_apellidos = admin_apellidos;
    }

    public int getTel_codigo() {
        return tel_codigo;
    }

    public void setTel_codigo(int tel_codigo) {
        this.tel_codigo = tel_codigo;
    }

    public int getDir_codigo() {
        return dir_codigo;
    }

    public void setDir_codigo(int dir_codigo) {
        this.dir_codigo = dir_codigo;
    }

    public int getCorr_codigo() {
        return corr_codigo;
    }

    public void setCorr_codigo(int corr_codigo) {
        this.corr_codigo = corr_codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Administrador{");
        sb.append("admin_documento=").append(admin_documento);
        sb.append(", admin_nombres=").append(admin_nombres);
        sb.append(", admin_apellidos=").append(admin_apellidos);
        sb.append(", tel_codigo=").append(tel_codigo);
        sb.append(", dir_codigo=").append(dir_codigo);
        sb.append(", corr_codigo=").append(corr_codigo);
        sb.append('}');
        return sb.toString();
    }


    
    
}
