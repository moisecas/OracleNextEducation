package fase2POO.bytebankHeredado;

public class SaldoInsuficienteException extends RuntimeException { 
    //extiende de runtimeexception para que no sea obligatorio capturar la excepcion
    public SaldoInsuficienteException(String msg) {
        super(msg);  //super es para llamar al constructor de la clase padre
        //msg es el mensaje que se le pasa al constructor de la clase padre
    }
    
}
