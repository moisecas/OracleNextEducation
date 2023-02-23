package fase2POO.bytebankHeredado;

public class FuncionarioAutenticable {
    private String clave="1234";

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) { //recibe la clave que se ingresa en el main
        if (this.clave == clave) {
            System.out.println("Sesion iniciada");
            return true;
        } else {
            System.out.println("Sesion no iniciada");
            return false;
        }
    }

    public double getSalario() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void setSalario(double salario) {
        // TODO Auto-generated method stub
        
    }
     
}
