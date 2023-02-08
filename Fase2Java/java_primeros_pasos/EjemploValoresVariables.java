package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class EjemploValoresVariables {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);

        numero2 = numero1;
        System.out.println("numero2: " + numero2);

        numero1 = 30;
        System.out.println("numero2: " + numero2); //numero2 sigue valiendo 10
        }
}
