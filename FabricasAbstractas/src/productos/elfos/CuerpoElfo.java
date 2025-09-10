package FabricasAbstractas.src.productos.elfos;

import FabricasAbstractas.src.productos.ICuerpo;

public class CuerpoElfo implements ICuerpo {
    @Override
    public void mostrar() {
        System.out.println("Cuerpo de Elfo creado.");
    }
}
