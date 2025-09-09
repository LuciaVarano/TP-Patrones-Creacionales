package Singleton;

public class Libro {

    private String autor;
    private String nombre;

    public Libro(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public String toString(){
        return "\nAutor: "+autor +"    Nombre: " +nombre;
    }
}
