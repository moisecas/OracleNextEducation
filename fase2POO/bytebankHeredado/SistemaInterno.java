package fase2POO.bytebankHeredado;

public class SistemaInterno {

    private String clave = "1234";

    public boolean autentica(FuncionarioAutenticable gerente) {
        boolean iniciarSesion = gerente.iniciarSesion(clave); //recibe la clave que se ingresa en el main
        if (iniciarSesion) {
            System.out.println("Sesion iniciada");
            return true;
        } else {
            System.out.println("Sesion no iniciada");
            return false;
        }
        
    }
}
