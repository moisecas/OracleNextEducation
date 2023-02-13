package fase2POO.ByteBank;

public class Cuenta {
    //atributos 
    String titular;
    int numero;
    int agencia;
    double saldo;
    
    //métodos
    public void deposita(double valor){ //valor es la cantidad que se deposita
        this.saldo += valor; //this hace referencia al objeto que llama al método, aumenta el saldo de la cuenta
    }

}
