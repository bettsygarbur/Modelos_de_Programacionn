package FabricasAbstractas.src.productos.orcos;

import FabricasAbstractas.src.productos.ICuerpo;

public class CuerpoOrco implements ICuerpo {
    @Override
    public void mostrar() {
        System.out.println("Cuerpo de Orco creado.");
    }
}
