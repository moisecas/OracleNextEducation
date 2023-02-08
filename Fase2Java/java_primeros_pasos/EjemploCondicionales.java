package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class EjemploCondicionales {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;

        if (numero1 > numero2) { //si numero1 es mayor que numero2
            System.out.println("numero1 es mayor que numero2");
        } else if (numero1 < numero2) {
            System.out.println("numero1 es menor que numero2");
        } else {
            System.out.println("numero1 es igual que numero2");
        }

        if (numero1 > numero2 && numero1 > numero3) { //si numero1 es mayor que numero2 y numero1 es mayor que numero3
            System.out.println("numero1 es el mayor");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("numero2 es el mayor");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("numero3 es el mayor");
        } else {
            System.out.println("Los numeros son iguales");
        }

        if (numero1 > numero2 || numero1 > numero3) { //si numero1 es mayor que numero2 o numero1 es mayor que numero3
            System.out.println("numero1 es el mayor");
        } else if (numero2 > numero1 || numero2 > numero3) {
            System.out.println("numero2 es el mayor");
        } else if (numero3 > numero1 || numero3 > numero2) {
            System.out.println("numero3 es el mayor");
        } else {
            System.out.println("Los numeros son iguales");
        }

        if (numero1 > numero2 ^ numero1 > numero3) { //si numero1 es mayor que numero2 o numero1 es mayor que numero3 pero no ambos
            System.out.println("numero1 es el mayor");
        } else if (numero2 > numero1 ^ numero2 > numero3) {
            System.out.println("numero2 es el mayor");
        } else if (numero3 > numero1 ^ numero3 > numero2) {
            System.out.println("numero3 es el mayor");
        } else {
            System.out.println("Los numeros son iguales");
        }

        if (numero1 > numero2) { //si numero1 es mayor que numero2
            System.out.println("numero1 es mayor que numero2");
        } else if (numero1 < numero2) {
            System.out.println("numero1 es menor que numero2");
        } else {
            System.out.println("numero1 es igual que numero2");
        }

        if (numero1 > numero2) { //si numero1 es mayor que numero2
            System.out.println("numero1 es mayor que numero2");
        } else if (numero1 < numero2) {
            System.out.println("numero1 es menor que numero2");
        } else {
            System.out.println("numero1 es igual que numero2");
        }

        //con edad 
        int edad = 18;
        if (edad >= 18) { //si edad es mayor o igual que 18
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        //con edad y sexo
        int edad2 = 18;
        char sexo = 'M';
        if (edad2 >= 18 && sexo == 'M') { //si edad es mayor o igual que 18 y sexo es igual a M
            System.out.println("Eres mayor de edad y eres hombre");
        } else if (edad2 >= 18 && sexo == 'F') {
            System.out.println("Eres mayor de edad y eres mujer");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
