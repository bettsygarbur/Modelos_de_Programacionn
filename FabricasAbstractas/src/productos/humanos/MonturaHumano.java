package FabricasAbstractas.src.productos.humanos;

import FabricasAbstractas.src.productos.IMontura;

public class MonturaHumano implements IMontura {
    @Override
    public void mostrar() {
        System.out.println("Montura de Humano creada.");
    }
}
