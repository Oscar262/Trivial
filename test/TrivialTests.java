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

    @Test
    public void esJugableFalseTest(){
        Game trivial= new Game();
        trivial.agregar("Maria");
        boolean esJugableTest= trivial.esJugable();
        Assertions.assertFalse(esJugableTest);
    }

    @Test
    public void esJugableTrueTest(){
        Game trivial= new Game();
        trivial.agregar("Maria");
        trivial.agregar("Juan");
        boolean esJugableTest= trivial.esJugable();
        Assertions.assertTrue(esJugableTest);
    }

    @Test
    public void esJugableMasDe6JugadoresFalseTest() throws ArrayIndexOutOfBoundsException{
        Game trivial= new Game();
        try {
            trivial.agregar("Maria");
            trivial.agregar("Maria");
            trivial.agregar("Maria");
            trivial.agregar("Maria");
            trivial.agregar("Maria");
            trivial.agregar("Maria");
            trivial.agregar("Maria");
        }catch (ArrayIndexOutOfBoundsException e){
            boolean esJugableTest= trivial.esJugable();
            Assertions.assertFalse(esJugableTest);
        }
    }

    @Test
    public void esJugable6JugadoresTrueTest(){
        Game trivial= new Game();
        trivial.agregar("Maria");
        trivial.agregar("Juan");
        trivial.agregar("Maria");
        trivial.agregar("Juan");
        trivial.agregar("Maria");
        trivial.agregar("Juan");
        boolean esJugableTest= trivial.esJugable();
        Assertions.assertTrue(esJugableTest);
    }

}
