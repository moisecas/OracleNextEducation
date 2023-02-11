package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class EjercicioTabla {
    public static void main(String[] args) {
        for(int i = 1; i <= 12; i++){ //i = 1, i <= 10, i++, la tabla del 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 y 12
            System.out.println("Tabla del " + i); //tabla del 1, tabla del 2, tabla del 3
            for(int j = 1; j <= 12; j++){ //control sobre el incremento de la tabla del 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 y 12
                System.out.println(i + " x " + j + " = " + (i * j));//el resultado de la multiplicación de i * j
            }
        }
    }
}
