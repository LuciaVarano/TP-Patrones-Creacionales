package Abstractfactory;

public class CreacionAdmin implements AbstractFactory {
    @Override
    public InterfazUI crearTipoUI() {
        return new AdminUI();
    }

    @Override
    public MetodoEnvio CrearTipoEnvio() {
        return new EnvioExpress();
    }
}
