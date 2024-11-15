interface Bebida {
    void preparar();
}

class Cafe implements Bebida {
    public void preparar() {
        System.out.println("Preparando o café.");
    }
}

class Cha implements Bebida {
    public void preparar() {
        System.out.println("Preparando o chá.");
    }
}

abstract class BebidaFactory {
    public abstract Bebida criarBebida();
}

class FabricaCafe extends BebidaFactory {
    public Bebida criarBebida() {
        return new Cafe();
    }
}

class FabricaCha extends BebidaFactory {
    public Bebida criarBebida() {
        return new Cha();
    }
}

public class Main {
    public static void main(String[] args) {
        BebidaFactory fabricaCafe = new FabricaCafe();
        Bebida cafe = fabricaCafe.criarBebida();
        cafe.preparar();

        BebidaFactory fabricaCha = new FabricaCha();
        Bebida cha = fabricaCha.criarBebida();
        cha.preparar();
    }
}