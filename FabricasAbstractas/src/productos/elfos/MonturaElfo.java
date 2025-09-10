package FabricasAbstractas.src.productos.elfos;

import FabricasAbstractas.src.productos.IMontura;

public class MonturaElfo implements IMontura {
    @Override
    public void mostrar() {
        System.out.println("Montura de Elfo creada.");
    }
}
