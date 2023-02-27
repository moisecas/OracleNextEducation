package fase2POO.bytebankHeredado;

public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero); //llama al constructor de la clase padre que recibe dos parametros
    }
    
    @Override
    public void retirar (double valor) throws SaldoInsuficienteException{ //throws SaldoInsuficienteException es para indicar que el metodo puede lanzar una excepcion de tipo SaldoInsuficienteException
        if(this.saldo < valor){ //si el saldo es menor al valor a retirar
            throw new SaldoInsuficienteException("No hay suficiente saldo"); //lanzamos una excepcion de tipo SaldoInsuficienteException
        }
        this.saldo -= valor; //restamos el valor al saldo
    }

    @Override
    public void deposita(double valor) { //sobreescribimos el metodo deposita de la clase padre
         this.saldo += valor; //saldo = saldo + valor
    }
    

}
