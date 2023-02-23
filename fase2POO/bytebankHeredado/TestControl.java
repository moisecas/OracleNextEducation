package fase2POO.bytebankHeredado;

public class TestControl {
    public static void main(String[] args) {
        Funcionario moises = new Contador();
        moises.setSalario(1000);

        Gerente maria = new Gerente();
        maria.setSalario(10000); //se llama al metodo setSalario de la clase Gerente y se le pasa el valor 10000

        ControlBonificacion control = new ControlBonificacion(); //se crea un objeto de la clase ControlBonificacion
        control.registrarSalario(moises);
        control.registrarSalario(moises); 

        Contador contador = new Contador();
        contador.setSalario(2000);
        control.registrarSalario(contador);


    }
}
