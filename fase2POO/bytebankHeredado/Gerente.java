package fase2POO.bytebankHeredado;

public class Gerente extends FuncionarioAutenticable {
    //nombre, documento, salario
    
    private String clave; 
    private String nombre;
    private String documento;
    private double salario;
    private int tipo; //1 = gerente, 2 = funcionario
   

   

    
    public double getBonificacion() {
        System.out.println("Metodo getBonificacion de Gerente");
        return super.getSalario() + this.getSalario(); 
    }

    //set salario 
    public void setSalario(double salario) {
        if (salario >= 0) {
            super.setSalario(salario);
        }
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Gerente() {
        // TODO Auto-generated constructor stub
    }

    public Gerente(String nombre, String documento, double salario) {
        super();
        this.nombre = nombre;
        this.documento = documento;
        this.salario = salario;
    }

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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public String setClave() {
        return clave;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }






}
