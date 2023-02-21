package fase2POO.bytebankHeredado;

public class ControlBonificacion {
    private double suma;

    public double registrarSalario(Funcionario funcionario) {
        
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("La suma de bonificaciones es: " + this.suma);
        return this.suma;
    }

    public double registrarSalario(Contador contador) {
        
        this.suma = contador.getBonificacion() + this.suma;
        System.out.println("La suma de bonificaciones es: " + this.suma);
        return this.suma;
    }
}
