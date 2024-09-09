package creators;

import interfaces.Bebida;
import products.Cha;

public class FabricaCha extends BebidaFactory{

    @Override
    public Bebida criarBebida() {
        return new Cha();
    }
}
