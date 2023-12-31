
package co.edu.ue.entities;

public class Clientes {
    
   private String cli_documento;
   private String cli_nombres;
   private String cli_apellidos;
   private String cli_contraseña;
   private int tel_codigo;
   private int dir_codigo;
   private int corr_codigo;

    public Clientes(String cli_documento, String cli_nombres, String cli_apellidos, String cli_contraseña, int tel_codigo, int dir_codigo, int corr_codigo) {
        this.cli_documento = cli_documento;
        this.cli_nombres = cli_nombres;
        this.cli_apellidos = cli_apellidos;
        this.cli_contraseña = cli_contraseña;
    }

    public String getCli_documento() {
        return cli_documento;
    }

    public void setCli_documento(String cli_documento) {
        this.cli_documento = cli_documento;
    }

    public String getCli_nombres() {
        return cli_nombres;
    }

    public void setCli_nombres(String cli_nombres) {
        this.cli_nombres = cli_nombres;
    }

    public String getCli_apellidos() {
        return cli_apellidos;
    }

    public void setCli_apellidos(String cli_apellidos) {
        this.cli_apellidos = cli_apellidos;
    }

    public String getCli_contraseña() {
        return cli_contraseña;
    }

    public void setCli_contraseña(String cli_contraseña) {
        this.cli_contraseña = cli_contraseña;
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
        sb.append("Clientes{");
        sb.append("cli_documento=").append(cli_documento);
        sb.append(", cli_nombres=").append(cli_nombres);
        sb.append(", cli_apellidos=").append(cli_apellidos);
        sb.append("cli_contraseña").append(cli_contraseña);
        sb.append(", tel_codigo=").append(tel_codigo);
        sb.append(", dir_codigo=").append(dir_codigo);
        sb.append(", corr_codigo=").append(corr_codigo);
        sb.append('}');
        return sb.toString();
    }
   
}
