package FabricasAbstractas.src.productos.humanos;

import FabricasAbstractas.src.productos.IArmadura;

public class ArmaduraHumano implements IArmadura {
    @Override
    public void mostrar() {
        System.out.println("Armadura de Humano creada.");
    }
}
