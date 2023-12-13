
package co.edu.ue.entities;

public class Telefonos {

    private int tel_codigo;
    private String tel_dominio;
    private String tel_numero;

    public Telefonos(String tel_dominio, String tel_numero) {
        this.tel_dominio = tel_dominio;
        this.tel_numero = tel_numero;
    }

    public int getTel_codigo() {
        return tel_codigo;
    }

    public void setTel_codigo(int tel_codigo) {
        this.tel_codigo = tel_codigo;
    }

    public String getTel_dominio() {
        return tel_dominio;
    }

    public void setTel_dominio(String tel_dominio) {
        this.tel_dominio = tel_dominio;
    }

    public String getTel_numero() {
        return tel_numero;
    }

    public void setTel_numero(String tel_numero) {
        this.tel_numero = tel_numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Telefonos{");
        sb.append("tel_codigo=").append(tel_codigo);
        sb.append(", tel_dominio=").append(tel_dominio);
        sb.append(", tel_numero=").append(tel_numero);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
