package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class Ejercicio {
    public static void main(String args[]) {

        for(int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                if ( columna > fila ) {
                    break;
                }
                System.out.print( columna + 1 );
            }
            System.out.println();
        }

    }
}
