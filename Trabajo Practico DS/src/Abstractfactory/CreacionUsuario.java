package Abstractfactory;

public class CreacionUsuario implements AbstractFactory {
    @Override
    public InterfazUI crearTipoUI() {
        return new UsuarioUI();
    }

    @Override
    public MetodoEnvio CrearTipoEnvio() {
        return new EnvioNormal();
    }
}
