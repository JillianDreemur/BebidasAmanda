package products;

import interfaces.Bebida;

public class Cha implements Bebida {

    @Override
    public void preparar() {
        System.out.println("Preparando o chá.");
    }
}
