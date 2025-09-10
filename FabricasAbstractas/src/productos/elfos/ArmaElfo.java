package FabricasAbstractas.src.productos.elfos;

import FabricasAbstractas.src.productos.IArma;

public class ArmaElfo implements IArma {
    @Override
    public void mostrar() {
        System.out.println("Arma de Elfo creada.");
    }
}
