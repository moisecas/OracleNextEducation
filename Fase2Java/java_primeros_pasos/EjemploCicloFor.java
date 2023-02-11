package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class EjemploCicloFor {
    public static void main(String[] args) {
        int total = 0;
        for(int contador = 0; contador <= 10; contador++){ //mientras contador sea menor a 3
        //  variagble de control, condición, incremento, estructura de control for
            total = total + contador;
            System.out.println("contador: " + contador);
            //contador solo existe dentro del ciclo for, scope de la variable
        }
        System.out.println(total);
    }
}
