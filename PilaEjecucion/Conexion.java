package PilaEjecucion;

public class Conexion  implements AutoCloseable{
    //simulando conexion a base de datos con un constructor

    public Conexion() { 
        System.out.println("Abriendo conexion");
    }
 
    public void leerDatos() {
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }
 
    public void cerrar() {
        System.out.println("Cerrando conexion");
    }

    @Override
    public void close() throws Exception {
        cerrar();
        System.out.println("Cerrando conexion");
    } //se usa para cerrar la conexion automaticamente

 }
