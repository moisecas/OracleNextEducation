package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class EjercicioMatrix {
    public static void main(String[] args) {
        for(int fila=0; fila<=10; fila++){ //control sobre las filas de la matriz
            for(int columna=0; columna<=3; columna++){ //control sobre las columnas de la matriz
                System.out.print("[" + fila + "," + columna + "]"); //fila 0, columna 0, fila 0, columna 1, fila 0, columna 2, fila 0, columna 3
            }
            System.out.println(); //salto de línea
        }
        //matriz de 10 filas y 4 columnas *
        for (int fila = 0; fila < 10; fila++) {
            for (int j = 0; j < 4; j++) {
                if(fila>j){
                    break;

                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
