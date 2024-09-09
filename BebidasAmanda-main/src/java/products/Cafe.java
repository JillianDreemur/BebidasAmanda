package products;

import interfaces.Bebida;

public class Cafe implements Bebida {

    @Override
    public void preparar() {
        System.out.println("Preparando o café.");
    }
}
