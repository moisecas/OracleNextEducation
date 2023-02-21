package fase2POO.bytebankHeredado;

public class Cuenta {
    //atributos 
    Cliente titular; //creo un objeto de la clase Cliente
    int numero;
    int agencia;
    double saldo; //public para poder acceder desde otra clase 

    private static int total; //variable de clase
    
    //constructor
    public Cuenta (int agencia, int numero){
        Cuenta.total++; //incremento el total de cuentas
        System.out.println("Se está creando una cuenta con el número " + numero);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    } 
    
    
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

    public double getSaldo(){
        return this.saldo;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0){
            System.out.println("No se puede asignar un valor menor o igual a 0");
            return;
        }
        this.agencia = agencia;
    }
    public int getAgencia() {
        return agencia;
    }

    //set titular
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    //get titular
    public Cliente getTitular(){
        return titular;
    }

    //set numero
    public void setNumero(int numero){
        this.numero = numero;
    }

    //get numero
    public int getNumero(){
        return numero;
    }

    //método de clase
    public static int getTotal(){
        return Cuenta.total;
    }
    //set total
    public static void setTotal(int total){
        Cuenta.total = total;
    }
    //constructor



}
