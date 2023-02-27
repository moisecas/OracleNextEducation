package fase2POO.bytebankHeredado;

public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(123, 321); //creamos un objeto de tipo CuentaCorriente
       
        try { //try es para capturar la excepcion en caso de que el saldo sea menor al valor a retirar
            cc.deposita(5); //llamamos al metodo deposita del objeto cc
            cc.retirar(200); //llamamos al metodo retirar del objeto cc

            //catch SaldoInsuficienteException 
        } catch (SaldoInsuficienteException e   ) { //catch es para capturar la excepcion
            System.out.println("Excepcion: " + e.getMessage()); 
            //getMessage es un metodo de la clase Exception, que devuelve el mensaje de la excepcion
        }catch (DepositoInsuficienteException e) {
            System.out.println("Excepcion: " + e.getMessage());
        } finally {
            System.out.println("Se ha ejecutado el finally"); //finally se ejecuta siempre, haya o no excepcion
        }
      

    }
    
}
