package alura;

import java.util.ArrayList;
import java.util.List;  
import java.util.Collections; //importa la libreria para ordenar 


public class Curso implements Comparable<Curso>  {
    private String nombre;
    private int tiempo;
    private List<Clase> claseList = new ArrayList<>(); //crea un arraylist de tipo clase 

    public Curso(String nombre, int tiempo, List<Clase> claseList ) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseList = claseList; 
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public ArrayList<Clase> getClaseList() {
        return (ArrayList<Clase>) claseList;
    }

    public void setClaseList(ArrayList<Clase> claseList) {
        this.claseList = claseList;
    }

    public void addClase(Clase clase) {
        // TODO Auto-generated method stub
        this.claseList.add(clase); 
    } 

    @Override //metodo para imprimir el nombre del curso
    public String toString() {
        return this.nombre; 
    }

    @Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.nombre);
        //este metodo es para comparar el nombre de los cursos
    } 

    




}
