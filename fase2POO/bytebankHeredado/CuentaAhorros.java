package fase2POO.bytebankHeredado;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero); //llama al constructor de la clase padre que recibe dos parametros
    }

    @Override
    public void deposita(double valor) { //sobreescribimos el metodo deposita de la clase padre
         this.saldo += valor; //saldo = saldo + valor
    } 

   
    
}
