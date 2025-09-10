package FabricasAbstractas.src.productos.orcos;

import FabricasAbstractas.src.productos.IMontura;

public class MonturaOrco implements IMontura {
    @Override
    public void mostrar() {
        System.out.println("Montura de Orco creada.");
    }
}
