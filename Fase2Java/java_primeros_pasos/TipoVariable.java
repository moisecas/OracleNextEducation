package LogicaProgramación.Fase2Java.java_primeros_pasos;

public class TipoVariable {
    public static void main(String[] args) {
        // Declaración de variables
        int numero;
        String texto;
        boolean verdadero;
        char caracter;
        double decimal;
        float decimal2;
        
        // Asignación de valores
        numero = 10;
        texto = "Hola Mundo";
        verdadero = true;
        caracter = 'a';
        decimal = 10.5;
        decimal2 = 10.5f;
        
        // Mostrar valores
        System.out.println("Número: " + numero);
        System.out.println("Texto: " + texto);
        System.out.println("Verdadero: " + verdadero);
        System.out.println("Caracter: " + caracter);
        System.out.println("Decimal: " + decimal);
        System.out.println("Decimal2: " + decimal2);

        //operaciones
        System.out.println("Suma: " + (numero + numero));
        System.out.println("Resta: " + (numero - numero));
        System.out.println("Multiplicación: " + (numero * numero));
        System.out.println("División: " + (numero / numero));
        System.out.println("Módulo: " + (numero % numero));

        //operaciones con decimales
        System.out.println("Suma: " + (decimal + decimal));
        System.out.println("Resta: " + (decimal - decimal));
        System.out.println("Multiplicación: " + (decimal * decimal));
        System.out.println("División: " + (decimal / decimal));
        System.out.println("Módulo: " + (decimal % decimal));

        //operaciones con decimales y enteros
        System.out.println("operaciones con decimales y enteros");
        System.out.println("Suma: " + (decimal + numero));
        System.out.println("Resta: " + (decimal - numero));
        System.out.println("Multiplicación: " + (decimal * numero));
        System.out.println("División: " + (decimal / numero));
        System.out.println("Módulo: " + (decimal % numero));

        //concatenación
        System.out.println("Concatenación: " + texto + " " + texto);
        

    
    }
}
