package fase2POO.bytebankHeredado;

public class Administrador extends FuncionarioAutenticable  {
     
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    } 
    
    public Administrador() {
        // TODO Auto-generated constructor stub
    }

    
    public double getBonificacion() {
        // TODO Auto-generated method stub
        return 0;
    }
}
