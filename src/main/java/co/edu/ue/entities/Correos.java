
package co.edu.ue.entities;

public class Correos {
    
    private int corr_codigo;
    private String corr_usuario;
    private String corr_dominio;

    public Correos(String corr_usuario, String corr_dominio) {
        this.corr_usuario = corr_usuario;
        this.corr_dominio = corr_dominio;
    }

    public int getCorr_codigo() {
        return corr_codigo;
    }

    public void setCorr_codigo(int corr_codigo) {
        this.corr_codigo = corr_codigo;
    }

    public String getCorr_usuario() {
        return corr_usuario;
    }

    public void setCorr_usuario(String corr_usuario) {
        this.corr_usuario = corr_usuario;
    }

    public String getCorr_dominio() {
        return corr_dominio;
    }

    public void setCorr_dominio(String corr_dominio) {
        this.corr_dominio = corr_dominio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Correos{");
        sb.append("corr_codigo=").append(corr_codigo);
        sb.append(", corr_usuario=").append(corr_usuario);
        sb.append(", corr_dominio=").append(corr_dominio);
        sb.append('}');
        return sb.toString();
    }

    
    
}
