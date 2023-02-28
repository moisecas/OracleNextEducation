package PilaEjecucion;

public class TestConexionDos {

   public static void main(String[] args) throws Exception {
    try(Conexion con=new Conexion()){
        con.leerDatos(); //lee datos de la base de datos metodo que lanza una excepcion que viene de la clase conexion
    }catch (IllegalStateException ex) { 
        //illegalstateexception es una excepcion de java que sirve para manejar errores de tipo runtime 
        //para que el programa no se caiga, se usa para la base de datos 
        
        System.out.println("Error de conexion");
        ex.printStackTrace(); //imprime la pila de ejecucion
    }
   }
}
    

