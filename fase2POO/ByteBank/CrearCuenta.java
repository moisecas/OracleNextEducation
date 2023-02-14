package fase2POO.ByteBank;

public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(); //Cuenta es una clase, new es una palabra reservada, debo asignarla a una variable
        primeraCuenta.numero = 123;
        primeraCuenta.agencia = 456;
        primeraCuenta.saldo = 50.0;
        System.out.println("El saldo de la cuenta de " + primeraCuenta.titular + " es de " + primeraCuenta.saldo + " euros");

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.numero = 789;
        segundaCuenta.agencia = 101;
        segundaCuenta.saldo = 100.0;
        System.out.println("El saldo de la cuenta de " + segundaCuenta.titular + " es de " + segundaCuenta.saldo + " euros");

        
    }
}
