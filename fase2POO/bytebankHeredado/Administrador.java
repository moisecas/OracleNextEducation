package fase2POO.bytebankHeredado;

public class Administrador extends Funcionario  {
     
    public Administrador(String nombre, String documento, double salario, int tipo) {
        super(nombre, documento, salario, tipo);
        // TODO Auto-generated constructor stub
    }
    
    public Administrador() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getBonificacion() {
        // TODO Auto-generated method stub
        return this.getSalario() * 0.2;
    }
}
