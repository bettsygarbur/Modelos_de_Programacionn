package FabricasAbstractas.src.productos.orcos;

import FabricasAbstractas.src.productos.IArmadura;

public class ArmaduraOrco implements IArmadura {
    @Override
    public void mostrar() {
        System.out.println("Armadura de Orco creada.");
    }
}
