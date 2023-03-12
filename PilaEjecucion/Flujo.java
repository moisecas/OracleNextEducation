package PilaEjecucion;

public class Flujo {

    public static void main(String[] args) {
      System.out.println("Ini do main");
      //arithmeticException();
      
      metodo4();
      metodo3(); //no se ejecuta porque el programa se cae

      metodo1();
      metodo2();
     
      System.out.println("Fim do main");
    }
    public static void metodo1(){
      System.out.println("Ini do metodo1");
      metodo2();
      System.out.println("Fim do metodo1");
    }
    public static void metodo2(){
      System.out.println("Ini do metodo2");
      for(int i =1; i<= 5; i++){
        System.out.println("i");
      }
      try { //try catch para que el programa no se caiga, captura la excepcion
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace(); //imprime la pila de ejecucion
        e.getMessage(); //imprime el mensaje de error que se produjo
      } 

      System.out.println("Fim do metodo2");

      
    }
    public static void metodo3(){
        int numero = 0;
        numero = numero / 0;  
        
      try {
          
        
        Thread.sleep(2000);
      } catch (Exception e) {
        // TODO: handle exception
        e.getMessage();
      }
      System.out.println("Fim do metodo3" + numero);
    }
    public static void metodo4(){
        ArithmeticException ae = new ArithmeticException("Dividido por zero");
        throw ae; 

    }

    //suma de dos numeros
    public static void arithmeticException(){
      int a = 1;
      int b = 0;
      int c = a/b;
      System.out.println(c);
    } 


    
  }
