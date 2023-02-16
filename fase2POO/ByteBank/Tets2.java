package fase2POO.ByteBank;

public class Tets2 {
    public static void main(String[] args) {
        Cliente moises = new Cliente();
        moises.setDocumento("12345678A");

        Cuenta cuentaMoises = new Cuenta();
        cuentaMoises.setTitular(moises);
        cuentaMoises.setNumero(123);
        cuentaMoises.setAgencia(456); 
        cuentaMoises.getTotal();

        
        
        

    }

}
