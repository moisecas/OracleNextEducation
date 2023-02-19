package fase2POO.bytebankHeredado;

public class TestGerente {
    public static void main(String[] args) {
        // Gerente gerente = new Gerente("Moises", "12345678A", 10000); //se llama como la clase 
        // System.out.println(gerente.getNombre());
        // System.out.println(gerente.getDocumento());
        // System.out.println(gerente.getSalario());
        // System.out.println(gerente.getTipo());
        
        // System.out.println(gerente.getBonificacion()); //getBonificacion() es un metodo de la clase Funcionario
        
        Gerente moises = new Gerente("Moises", "12345678A", 10000,1, "clave123"); //se llama como la clase
        System.out.println(moises.getNombre());
        System.out.println(moises.getDocumento());
        System.out.println(moises.getSalario());
        System.out.println(moises.getTipo());
        System.out.println(moises.getClave());
        System.out.println(moises.getBonificacion()); //getBonificacion() es un metodo de la clase Funcionario


    }
}
