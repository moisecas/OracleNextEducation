package fase2POO.bytebankHeredado;

public class Gerente extends Funcionario {
    //nombre, documento, salario
    
    private String clave; 

    //constructor
    public Gerente(String nombre, String documento, double salario, int tipo, String clave) { //se llama como la clase
        super(nombre, documento, salario, tipo);
        this.clave = clave;
    }

    public Gerente() { //se llama como la clase
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

    //sobreescribir el metodo getBonificacion de la clase Funcionario
    public double getBonificacion() {
        return super.getSalario() + 
        (super.getSalario()*0.1); //de la clase padre, de la clase que esta arriba de mi en la jerarquia de herencia traigo el salario
    }




}
