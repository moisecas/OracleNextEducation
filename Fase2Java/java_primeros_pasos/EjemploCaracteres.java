package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class EjemploCaracteres {
    public static void main(String[] args) {
        //ejemplos de cadenas de texto char
        char caracter = 'a';
        System.out.println("caracter: " + caracter);

        caracter = 65+1;
        char segundoCaracter = (char)(caracter + 1); //fuerzo el tipo de dato
        System.out.println(segundoCaracter); 

        //ejemplos de cadenas de texto String
        String texto = "Hola Mundo";
        System.out.println("texto: " + texto);
        


    }
}
