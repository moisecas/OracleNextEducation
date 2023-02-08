package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class EjemploCondicionales2 {
    public static void main(String[] args) {
        
       int edad = 18;
       int cantidadPersonas = 3;
       if(edad >= 18 && cantidadPersonas >= 2){
           System.out.println("Puedes entrar");
         }else{
              System.out.println("No puedes entrar");
            }
            
        int edadDos = 17;
        int cantidadPersonasDos = 3;
        boolean esPareja = true;
        if(edadDos >= 18 && cantidadPersonasDos >= 2 || esPareja){
            System.out.println("Puedes entrar");
        }else{
            System.out.println("No puedes entrar");
        }


    }
}
