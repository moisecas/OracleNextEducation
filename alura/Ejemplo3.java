package alura;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Ejemplo3 {
    public static void main(String[] args) {
        String curso1 = "math";
        String curso2 = "english";
        String curso3 = "spanish";
        String curso4 = "science";

        ArrayList<String> lista = new ArrayList<String>(); //crea un arraylist de tipo string
        lista.add(curso1); //agrega el valor de la variable1 al arraylist
        lista.add(curso2);
        lista.add(curso3);
        lista.add(curso4);

        
        System.out.println(lista); //imprime el arraylist

        Collections.sort(lista); //ordena el arraylist 
        System.out.println("usando sort: "+lista); //imprime el arraylist
        Collections.reverse(lista); //ordena el arraylist al reves
        System.out.println("usando reverse: " + lista); //imprime el arraylist
        Collections.shuffle(lista); //ordena el arraylist de forma aleatoria
        System.out.println("usando shufle, ordena aleatorio: " + lista); //imprime el arraylist
        Collections.swap(lista, 0, 3); //ordena el arraylist de forma aleatoria i y j son las posiciones que se van a intercambiar
        System.out.println("usando swap: " + lista); //imprime el arraylist

        System.out.println("usando metodos del arraylist: ");
        lista.sort(Comparator.reverseOrder()); //devuelve true si el arraylist contiene el elemento math
        System.out.println("usando sort: " + lista); //imprime el arraylist
        lista.sort(Comparator.naturalOrder()); //ordena el arraylist de forma natural
        System.out.println("usando sort naturalOrder: " + lista); //imprime el arraylist
        
    }
}
