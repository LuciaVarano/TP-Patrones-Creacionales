package Abstractfactory;

public interface AbstractFactory {
    InterfazUI crearTipoUI();
    MetodoEnvio CrearTipoEnvio();
}
//con esta interfaz controlo las otras 2 para crear un tipo de UI y Envio