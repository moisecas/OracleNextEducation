package PilaEjecucion;

public class MiException  extends RuntimeException{ //RuntimeException es una clase que hereda de Exception, es una clase que no es obligatorio capturarla
  public MiException(String msg){
    super(msg); 
    //super es la clase padre, en este caso Exception, msg es el mensaje que se le pasa al constructor de Exception
  }
    
}
