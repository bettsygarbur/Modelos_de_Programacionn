package FabricasAbstractas.src.productos.humanos;

import FabricasAbstractas.src.productos.ICuerpo;

public class CuerpoHumano implements ICuerpo {
    @Override
    public void mostrar() {
        System.out.println("Cuerpo de Humano creado.");
    }
}
