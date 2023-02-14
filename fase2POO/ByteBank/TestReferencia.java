package fase2POO.ByteBank;

public class TestReferencia {
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

        Cuenta segundCuenta = primeraCuenta; //segundCuenta es una referencia a la misma cuenta que primeraCuenta, apunta a la misma dirección de memoria 
        System.out.println(segundCuenta.titular); //imprime Juan

        segundCuenta.saldo += 100; //segundCuenta.saldo = segundCuenta.saldo + 100;
        System.out.println("El saldo de la cuenta de " + primeraCuenta.titular + " es de " + primeraCuenta.saldo + " euros");

        //mostrar espacio en memoria 
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta); //muestra la misma dirección de memoria que primeraCuenta
        
        if(primeraCuenta == segundaCuenta){
            System.out.println("Son la misma cuenta");
        }else{
            System.out.println("Son cuentas diferentes");
        }

    }
    
}
