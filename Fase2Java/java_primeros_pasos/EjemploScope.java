package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class EjemploScope {
    public static void main(String[] args) {

        boolean fuePromovido = true;

        if (fuePromovido) {
            double salario = 4200.0;
        } else {
            double salario = 3800.0;
        }

        //System.out.println(salario); //no compila porque no existe la variable salario

        int numero1 = 10;
        int numero2 = 20;
        int resultado = 0;
        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);
        System.out.println("resultado: " + resultado);

        resultado = numero1 + numero2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 - numero2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 * numero2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 / numero2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 % numero2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 + numero2 * 2;
        System.out.println("resultado: " + resultado);

        resultado = (numero1 + numero2) * 2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 + numero2 / 2;
        System.out.println("resultado: " + resultado);

        resultado = (numero1 + numero2) / 2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 + numero2 % 2;
        System.out.println("resultado: " + resultado);

        resultado = (numero1 + numero2) % 2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 + numero2 * 2 / 2;
        System.out.println("resultado: " + resultado);

        resultado = (numero1 + numero2 * 2) / 2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 + numero2 * 2 % 2;
        System.out.println("resultado: " + resultado);

        resultado = (numero1 + numero2 * 2) % 2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 + numero2 / 2 * 2;
        System.out.println("resultado: " + resultado);

        resultado = (numero1 + numero2) / 2 * 2;
        System.out.println("resultado: " + resultado);

        resultado = numero1 + numero2 / 2 % 2;
        System.out.println("resultado: " + resultado);

        
    }
}
