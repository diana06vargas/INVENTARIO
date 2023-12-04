
package co.edu.ue.entities;

public class Empleados {
    
    private String emp_codigo;
    private String emp_nombres;
    private String emp_apellidos;
    private String tel_codigo;
    private String dir_codigo;
    private String corr_codigo;

    public Empleados(String emp_codigo, String emp_nombres, String emp_apellidos, String tel_codigo, String dir_codigo, String corr_codigo) {
        this.emp_codigo = emp_codigo;
        this.emp_nombres = emp_nombres;
        this.emp_apellidos = emp_apellidos;
        this.tel_codigo = tel_codigo;
        this.dir_codigo = dir_codigo;
        this.corr_codigo = corr_codigo;
    }

    public String getEmp_codigo() {
        return emp_codigo;
    }

    public void setEmp_codigo(String emp_codigo) {
        this.emp_codigo = emp_codigo;
    }

    public String getEmp_nombres() {
        return emp_nombres;
    }

    public void setEmp_nombres(String emp_nombres) {
        this.emp_nombres = emp_nombres;
    }

    public String getEmp_apellidos() {
        return emp_apellidos;
    }

    public void setEmp_apellidos(String emp_apellidos) {
        this.emp_apellidos = emp_apellidos;
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
        sb.append("Empleados{");
        sb.append("emp_codigo=").append(emp_codigo);
        sb.append(", emp_nombres=").append(emp_nombres);
        sb.append(", emp_apellidos=").append(emp_apellidos);
        sb.append(", tel_codigo=").append(tel_codigo);
        sb.append(", dir_codigo=").append(dir_codigo);
        sb.append(", corr_codigo=").append(corr_codigo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
