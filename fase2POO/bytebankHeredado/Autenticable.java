package fase2POO.bytebankHeredado;

public abstract interface  Autenticable   {
    

    //todos los metodos son publicos y abstractos
    public void setClave(String clave);

    public boolean iniciarSesion(String clave);

}
