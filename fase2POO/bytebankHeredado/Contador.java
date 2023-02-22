package fase2POO.bytebankHeredado;

public class Contador extends Funcionario {

    public double getBonificacion() {
        System.out.println("Bonificacion de contador"); 
        return 200;
    }

    //constructor
    public Contador() {
        super();
    }
    
}
