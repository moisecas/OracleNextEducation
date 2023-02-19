package fase2POO.bytebankHeredado;

public class Gerente {
    //nombre, documento, salario
    private String nombre;
    private String documento;
    private double salario;
    private int tipo; //1 = gerente, 2 = funcionario 

    //constructor
    public Gerente(String nombre, String documento, double salario, int tipo) { //se llama como la clase
        this.nombre = nombre;
        this.documento = documento;
        this.salario = salario;
        this.tipo = tipo;
     }

     //set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodo bonificacion = a otro salario
    public double getBonificacion() {
        return this.salario; //accede al salario de la clase Funcionario
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }




}
