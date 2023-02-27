package PilaEjecucion;

public class TestCuentaException {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(); //creamos un objeto de tipo Cuenta
        try { //try es para capturar la excepcion
            c.deposita(-100); //llamamos al metodo deposita del objeto c, en caso de que la cantidad sea negativa, se lanza una excepcion
        } catch (MiException e) { //catch es para capturar la excepcion
            System.out.println(e.getMessage()); //getMessage es un metodo de la clase Exception, que devuelve el mensaje de la excepcion
        } finally {
            System.out.println("Se ha ejecutado el finally"); //finally se ejecuta siempre, haya o no excepcion
        } 

    }
}
