package fase2POO.ByteBank;

public class Tets2 {
    public static void main(String[] args) {
        Cliente moises = new Cliente();
        moises.documento = "12345678A";
        moises.telefono = "6677899";
        moises.sexo = "M";
        moises.titular = "Moises";

        Cuenta cuentaMoises = new Cuenta();
        
        cuentaMoises.numero = 123;
        cuentaMoises.agencia = 456;
        cuentaMoises.saldo = 50.0;
        cuentaMoises.titular = moises; //asigno el objeto moises a la variable titular de la clase Cuenta
        System.out.println("El saldo de la cuenta de " + cuentaMoises.titular.titular + " es de " + cuentaMoises.saldo + " euros" + " " + cuentaMoises.titular.sexo);

    }
}
