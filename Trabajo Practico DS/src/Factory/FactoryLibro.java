package Factory;

public class FactoryLibro {

    public static Libro MostrarLibro(String tipo){
        switch(tipo){
            case "LibroDigital": return new LibroDigital("Caperusita roja","jorge");
            case "LibroFisico" : return new LibroFisico("los 3 chanchitos","manunel");
            default: throw new IllegalArgumentException("tipo desconocido");
        }
    }
}
