package fase2POO.bytebankHeredado;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario moises = new Contador(); //se llama como la clase
        moises.setSalario(1000);
        moises.setDocumento("12345678A");
        moises.setNombre("Moises");
        System.out.println(moises.getNombre());
        System.out.println(moises.getDocumento());
        System.out.println(moises.getSalario());
        System.out.println(moises.getBonificacion()); //getBonificacion() es un metodo de la clase Funcionario
        

    }
}
