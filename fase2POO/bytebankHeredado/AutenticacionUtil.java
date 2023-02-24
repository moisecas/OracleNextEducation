package fase2POO.bytebankHeredado;

public class AutenticacionUtil {
    private String clave; 

    public boolean iniciarSesion(String clave){
        return this.clave.equals(clave);
    }

    public void setClave(String clave) { //recibe la clave que se ingresa en el main
        this.clave = clave;
    }

    

}
