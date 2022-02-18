import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(true);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void moverCasilla(){
        Game trivial= new Game();
        trivial.agregar("Maria");
        trivial.agregar("Juan");
        trivial.tirarDado(1);
        String expected = "La nueva posición de Maria es 1";
        String actual= trivial.nuevaPosicionJugador();
        Assertions.assertEquals(expected,actual);
    }
}
