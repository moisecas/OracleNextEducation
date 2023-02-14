package fase2POO.ByteBank;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta  primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 300;
        primeraCuenta.deposita(50); //llamo al método deposita de la clase Cuenta
        System.out.println(primeraCuenta.saldo); //imprime 350
        primeraCuenta.retiar(100); 
        
        System.out.println(primeraCuenta.saldo); //imprime 250  
        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 1000;
        segundaCuenta.deposita(5000); //llamo al método deposita de la clase Cuenta
        System.out.println(segundaCuenta.saldo); //imprime 6000
        segundaCuenta.transferir(200, primeraCuenta); //llamo al método transferir de la clase Cuenta
        System.out.println(primeraCuenta.saldo); //imprime 450 de la cuenta 1

    }
}
