package PilaEjecucion;

public class TestConexion {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        try {
            con.leerDatos(); //lee datos de la base de datos
            con.cerrar(); //cierra la conexion
        } catch (IllegalStateException ex) { 
            //illegalstateexception es una excepcion de java que sirve para manejar errores de tipo runtime 
            //para que el programa no se caiga, se usa para la base de datos 
            
            System.out.println("Error de conexion");
            ex.printStackTrace(); //imprime la pila de ejecucion
        } finally { //finally se ejecuta siempre, si hay error o no
            con.cerrar(); //cierra la conexion
        }
    }
}
