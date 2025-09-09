package Factory;

    public class LibroDigital extends Libro{
        private String nombre;
        private String autor;


        public LibroDigital(String nombre, String autor) {
            this.nombre = nombre;
            this.autor = autor;
        }


        @Override
        public String LogisticaLibro() {
            return "Libro Digital - " +nombre + " de " +autor;
        }
    }
