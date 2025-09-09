package Factory;

public class LibroFisico extends Libro {
    private String nombre;
    private String autor;

    public LibroFisico(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    @Override
    public String LogisticaLibro() {
        return "Libro Físico - " +nombre + " de " +autor;
    }
}
