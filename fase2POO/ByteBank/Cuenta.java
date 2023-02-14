package fase2POO.ByteBank;

public class Cuenta {
    //atributos 
    Cliente titular; //creo un objeto de la clase Cliente
    int numero;
    int agencia;
    double saldo;
    
    
    //métodos
    public void deposita(double valor){ //valor es la cantidad que se deposita
        this.saldo += valor; //this hace referencia al objeto que llama al método, aumenta el saldo de la cuenta
    }

    public boolean retiar (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Se ha retirado " + valor + " euros");
            return true;  
            
        }else{
            
            System.out.println("No hay suficiente saldo");
            return false; 
        }
         //no se ejecuta porque el método termina en el return
    }

    public boolean transferir(double valor, Cuenta destino){ //recibe el valor a transferir y la cuenta destino
        //validamos si es factible la transferencia
        if(this.saldo >= valor){ //si el saldo es mayor o igual al valor a transferir
            this.saldo -= valor; //restamos el valor a la cuenta origen
            destino.saldo += valor; //sumamos el valor a la cuenta destino
            System.out.println("Se ha transferido " + valor + " euros");
            return true; //devolvemos true porque la transferencia se ha realizado
        }else{
            System.out.println("No hay suficiente saldo");
            return false; 
        }
        
    }

}
