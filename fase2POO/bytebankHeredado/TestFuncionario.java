package fase2POO.bytebankHeredado;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario moises = new Funcionario("Moises", "12345678A", 1000,1); //se llama como la clase 
        System.out.println(moises.getNombre());
        System.out.println(moises.getDocumento());
        System.out.println(moises.getSalario());
        System.out.println(moises.getTipo());
        System.out.println(moises.getBonificacion()); //getBonificacion() es un metodo de la clase Funcionario
        

    }
}
