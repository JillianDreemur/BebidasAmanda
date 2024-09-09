package creators;

import interfaces.Bebida;
import products.Cafe;

public class FabricaCafe extends BebidaFactory{

    @Override
    public Bebida criarBebida() {
        return new Cafe();
    }
}
