package PilaEjecucion;

public class Cuenta {
    void deposita (double cantidad) throws MiException{ 
        //throws MiException es para indicar que se lanza una excepcion de tipo MiException
        //MiException es una clase que hereda de Exception
        //MiException permite que se pueda capturar la excepcion en el main para que el programa no se caiga
        if (cantidad < 0) {
            throw new MiException("No se puede depositar una cantidad negativa");
            //throw es para lanzar una excepcion, new MiException es para crear una excepcion de tipo MiException
            //en caso de que la cantidad sea negativa, se lanza una excepcion de tipo MiException
        }
    }
}
