
package co.edu.ue.entities;

public class Pagos {
    
    private String pag_codigo;
    private String pag_fecha;
    private String pag_monto;

    public Pagos(String pag_codigo, String pag_fecha, String pag_monto) {
        this.pag_codigo = pag_codigo;
        this.pag_fecha = pag_fecha;
        this.pag_monto = pag_monto;
    }

    public String getPag_codigo() {
        return pag_codigo;
    }

    public void setPag_codigo(String pag_codigo) {
        this.pag_codigo = pag_codigo;
    }

    public String getPag_fecha() {
        return pag_fecha;
    }

    public void setPag_fecha(String pag_fecha) {
        this.pag_fecha = pag_fecha;
    }

    public String getPag_monto() {
        return pag_monto;
    }

    public void setPag_monto(String pag_monto) {
        this.pag_monto = pag_monto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pagos{");
        sb.append("pag_codigo=").append(pag_codigo);
        sb.append(", pag_fecha=").append(pag_fecha);
        sb.append(", pag_monto=").append(pag_monto);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
