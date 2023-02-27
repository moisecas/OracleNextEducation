package fase2POO.bytebankHeredado;



public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(123, 12345678);
        CuentaAhorros cuentaAhorros = new CuentaAhorros(123, 12345678);
        //cuentaCorriente.deposita(100);
        cuentaAhorros.deposita(1200); //se llama al metodo deposita de la clase CuentaAhorros y se le pasa el valor 100
        System.out.println(cuentaCorriente.getSaldo()); //se llama al metodo getSaldo de la clase CuentaCorriente
        System.out.println(cuentaAhorros.getSaldo()); //se llama al metodo getSaldo de la clase CuentaAhorros
    }
}
