package fase2POO.bytebankHeredado;

public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1000); //se llama al metodo setSalario de la clase Funcionario y se le pasa el valor 1000
    
        Gerente gerente = new Gerente(); 
        gerente.setSalario(10000); //se llama al metodo setSalario de la clase Gerente y se le pasa el valor 1000

        

    }
}
