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

        //convertir datos 
        System.out.println("Convertir datos");
        System.out.println("Convertir entero a decimal: " + (double)numero);
        System.out.println("Convertir decimal a entero: " + (int)decimal);
        System.out.println("Convertir entero a texto: " + String.valueOf(numero));
        System.out.println("Convertir texto a entero: " + Integer.parseInt(texto));
        System.out.println("Convertir texto a decimal: " + Double.parseDouble(texto));
        System.out.println("Convertir texto a boolean: " + Boolean.parseBoolean(texto));
        System.out.println("Convertir texto a caracter: " + texto.charAt(0));
        System.out.println("Convertir caracter a texto: " + String.valueOf(caracter));
        System.out.println("Convertir boolean a texto: " + String.valueOf(verdadero));
        System.out.println("Convertir decimal a texto: " + String.valueOf(decimal));
        System.out.println("Convertir decimal a texto: " + String.valueOf(decimal2));

        //otros tipos de datos 
        System.out.println("Otros tipos de datos");
        long numeroLargo = 1000000000000000000L; //long
        short numeroCorto = 100; //short 
        byte numeroByte = 100; //byte
        float numeroFloat = 100.5f; //float
        System.out.println("Número largo: " + numeroLargo);
        System.out.println("Número corto: " + numeroCorto);
        System.out.println("Número byte: " + numeroByte); 
        System.out.println("Número float: " + numeroFloat);


    
    }
}
