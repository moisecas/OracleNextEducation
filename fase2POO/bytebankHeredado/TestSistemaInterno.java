package fase2POO.bytebankHeredado;

public class TestSistemaInterno {
    public static void main(String[] args) {
           SistemaInterno sistema = new SistemaInterno(); //creo el objeto de la clase SistemaInterno para poder llamar al metodo autentica
              Gerente gerente = new Gerente(); //creo el objeto de la clase Gerente para poder llamar al metodo setClave
                gerente.setClave("1234"); //se llama al metodo setClave de la clase Gerente y se le pasa el valor 1234
            Administrador administrador = new Administrador(); //creo el objeto de la clase Administrador para poder llamar al metodo setClave
                administrador.setClave("1234");  //se llama al metodo setClave de la clase Administrador y se le pasa el valor 1234

                
                sistema.autentica(gerente);
                sistema.autentica(administrador); //esto viene de la clase FuncionarioAutenticable
                

    }
}
