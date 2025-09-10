package FabricasAbstractas.src.productos.humanos;

import FabricasAbstractas.src.productos.IArma;

public class ArmaHumano implements IArma {
    @Override
    public void mostrar() {
        System.out.println("Arma de Humano creada.");
    }
}
