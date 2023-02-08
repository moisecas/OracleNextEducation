package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class EjemploCiclos {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;
        while(contador < 3){ //mientras contador sea menor a 3
            total = total + contador;
            
            contador++; //contador = contador + 1; el mismo incrementado en 1 
        }
        System.out.println(total);
    }
}
