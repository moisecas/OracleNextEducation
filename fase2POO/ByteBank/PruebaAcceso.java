package fase2POO.ByteBank;


public class PruebaAcceso {
    Cuenta cuenta = new Cuenta(); //creo un objeto de la clase Cuenta
    Cuenta cuenta2 = new Cuenta();

    public void asignarNumero() {
        cuenta2.numero = 123; //asigno un valor a la variable "numero"
        cuenta2.agencia = 456; //asigno un valor a la variable "agencia"
        cuenta2.saldo = 50.0; //asigno un valor a la variable "saldo"
        System.out.println("El saldo de la cuenta de " + cuenta2.titular + " es de " + cuenta2.saldo + " euros");
        cuenta2.getSaldo(); //llamo al método getSaldo de la clase Cuenta 
    }
}

