package fase2POO.ByteBank;

public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setDocumento("12345678A"); //accedo al método setDocumento de la clase Cliente
        cliente.setTelefono("6677899");  //accedo al método setTelefono de la clase Cliente 
        cuenta.setTitular(cliente); //accedo al método setTitular de la clase Cuenta
        cuenta.setNumero(123); //accedo al método setNumero de la clase Cuenta

        System.out.println(cuenta.getTitular().getDocumento()); //accedo al método getDocumento de la clase Cliente 
        System.out.println(cuenta.getTitular().getTelefono()); //accedo al método getTelefono de la clase Cliente 
    }
}
