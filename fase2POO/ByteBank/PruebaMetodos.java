package fase2POO.ByteBank;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta  primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 300;
        primeraCuenta.deposita(50); //llamo al método deposita de la clase Cuenta
        System.out.println(primeraCuenta.saldo); //imprime 350
    }
}
