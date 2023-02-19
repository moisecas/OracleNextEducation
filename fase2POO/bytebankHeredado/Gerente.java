package fase2POO.bytebankHeredado;

public class Gerente extends Funcionario {
    //nombre, documento, salario
    
    private String clave; 

    //constructor
    public Gerente(String nombre, String documento, double salario, int tipo, String clave) { //se llama como la clase
        super(nombre, documento, salario, tipo);
        this.clave = clave;
    }

    

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) { //recibe la clave que se ingresa en el main
        if (this.clave == clave) {
            System.out.println("Sesion iniciada");
            return true;
        } else {
            System.out.println("Sesion no iniciada");
            return false;
        }
    }




}
