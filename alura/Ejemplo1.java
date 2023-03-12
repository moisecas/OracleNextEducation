package alura;

import java.util.ArrayList;

public class Ejemplo1 {
    public static void main(String[] args) {
        String variable1 = "ejemplo 1";
        String variable2 = "ejemplo 2";
        String variable3 = "ejemplo 3";
        String variable4 = "ejemplo 4";

        ArrayList<String> lista = new ArrayList<String>(); //crea un arraylist de tipo string
        lista.add(variable1); //agrega el valor de la variable1 al arraylist
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        System.out.println(lista.get(0)); //imprime el valor de la posicion 0 del arraylist
        System.out.println(lista); //imprime el arraylist
        lista.remove(lista.size() - 1); //elimina el ultimo elemento del arraylist 
        lista.set(2, variable4); //cambia el valor de la posicion 2 por el valor de la variable4 
        lista.set(0, "ejemplo 5"); //cambia el valor de la posicion 0 por el valor de "ejemplo 5" 
        System.out.println(lista); //imprime el arraylist
        System.out.println(lista.size()); //imprime el tamaño del arraylist
        
    }
}
