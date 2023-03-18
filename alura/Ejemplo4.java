package alura;

import java.util.ArrayList;

public class Ejemplo4 {
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

    

    

}

}
