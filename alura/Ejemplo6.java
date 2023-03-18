package alura;

import java.util.ArrayList;


public class Ejemplo6 {
    //agregando clases a un arraylist
    public static void main(String[] args) {
        Curso curso1 = new Curso("math", 10, new ArrayList<>());
        curso1.addClase(new Clase("array")); 
    }
   
    

}
