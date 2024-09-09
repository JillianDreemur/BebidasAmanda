import creators.BebidaFactory;
import creators.FabricaCafe;
import creators.FabricaCha;
import interfaces.Bebida;

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
