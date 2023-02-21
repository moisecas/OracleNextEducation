package fase2POO.bytebankHeredado;

public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero); //llama al constructor de la clase padre que recibe dos parametros
    }
    @Override //sobreescribir el metodo de la clase padre Cuenta que se llama retiar, si borro el @Override no se sobreescribe
    public boolean retiar(double valor) {
        // TODO Auto-generated method stub
        double comision = 0.2;
        return super.retiar(valor + comision); //retire lo solicitado mas la comision para el banco y lo retorne a la clase padre
    }
    

}
