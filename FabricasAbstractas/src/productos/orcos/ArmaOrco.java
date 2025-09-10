package FabricasAbstractas.src.productos.orcos;

import FabricasAbstractas.src.productos.IArma;

public class ArmaOrco implements IArma {
    @Override
    public void mostrar() {
        System.out.println("Arma de Orco creada.");
    }
}
