package Abstractfactory;

class EnvioExpress implements MetodoEnvio {

    @Override
    public void Metodoenvio() {
        System.out.println("El envio sera dentro de 24 horas");
    }
}
