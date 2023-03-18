package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejemplo5 {
    public static void main(String[] args) {
    Curso curso1 = new Curso("math", 10);
    Curso curso2 = new Curso("english", 20);
    Curso curso3 = new Curso("spanish", 30);
    Curso curso4 = new Curso("science", 40); 

    ArrayList<Curso> cursos = new ArrayList<Curso>(); //crea un arraylist de tipo string
    cursos.add(curso1); //agrega el valor de la variable1 al arraylist
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);
    
    System.out.println(cursos); //imprime el arraylist

    Collections.sort(cursos); //ordena el arraylist de menor a mayor

    System.out.println(cursos); //imprime el arraylist

    List<Curso> subList = cursos.subList(0, 2); //crea una sublista de los primeros 2 elementos del arraylist

    System.out.println(subList); //imprime la sublista

    //que no contenga spanish
    cursos.removeIf(curso -> curso.getNombre().equals("spanish")); //remueve el elemento que cumpla la condicion

    System.out.println(cursos); //imprime el arraylist
    
    

}

}
