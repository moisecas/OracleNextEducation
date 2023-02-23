package fase2POO.bytebankHeredado;

public class TestGerente {
    public static void main(String[] args) {
        // Gerente gerente = new Gerente("Moises", "12345678A", 10000); //se llama como la clase 
        // System.out.println(gerente.getNombre());
        // System.out.println(gerente.getDocumento());
        // System.out.println(gerente.getSalario());
        // System.out.println(gerente.getTipo());
        
        // System.out.println(gerente.getBonificacion()); //getBonificacion() es un metodo de la clase Funcionario
        
        Gerente gerente = new Gerente("Moises", "12345678A", 10000); //se llama como la clase
        gerente.setClave("1234");
        System.out.println(gerente.getClave());
        System.out.println(gerente.getBonificacion()); //getBonificacion() es un metodo de la clase Funcionario
        
        
        

    }
}
