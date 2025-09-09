package Builder;

public class Usuario {
    private String Nombre;
    private String Mail;
    private String Direccion;
    private Double Telefono;
    private String Nacimiento;

    private Usuario (Builder builder){
        this.Nombre=builder.Nombre;
        this.Mail=builder.Mail;
        this.Direccion=builder.Direccion;
        this.Telefono=builder.Telefono;
        this.Nacimiento=builder.Nacimiento;
    }

    public void mostrar(){
        System.out.println("\nnombre: "+Nombre + "\nmail: "+Mail + "\ndireccion: "+Direccion + "\ntelefono: "+Telefono+ "\nfecha de nacimiento: "+Nacimiento);
    }


    public static class Builder{
        public String nombre;
        private String Nombre;
        private String Mail;
        private String Direccion;
        private Double Telefono;
        private String Nacimiento;

        public Builder setNombre(String Nombre){this.Nombre=Nombre; return this;}
        public Builder setMail(String Mail){this.Mail=Mail; return this;}
        public Builder setDireccion(String Direccion){this.Direccion=Direccion; return this;}
        public Builder setTelefono(Double Telefono){this.Telefono=Telefono; return this;}
        public Builder setNacimiento(String Nacimiento){this.Nacimiento=Nacimiento; return this;}


        public Usuario build(){
            return new Usuario(this);
        }
    }
}
