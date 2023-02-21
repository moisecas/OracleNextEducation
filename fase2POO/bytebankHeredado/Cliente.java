package fase2POO.bytebankHeredado;

public class Cliente {
    
    private String documento;
    private String telefono;
    private String sexo;
    private String titular;

    //getters y setters
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
