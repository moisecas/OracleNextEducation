package fase2POO.bytebankHeredado;

public abstract class  Funcionario {
    //nombre, documento, salario
    private String nombre;
    private String documento;
    private double salario;
    private int tipo; //1 = gerente, 2 = funcionario

    //constructor
    public Funcionario(String nombre, String documento, double salario, int tipo) { //se llama como la clase
        this.nombre = nombre;
        this.documento = documento;
        this.salario = salario;
        this.tipo = tipo;
     }   

     public Funcionario() { //se llama como la clase
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

    public abstract double getBonificacion(); 
    //metodo abstracto, no tiene cuerpo, no tiene implementacion, no tiene codigo, no tiene logica, no tiene nada, solo se declara

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


}
