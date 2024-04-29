import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Assertions;

class JocTest {

    @org.junit.jupiter.api.Test
    void novaPartida_taulell()  {
        Joc joc = new Joc();
        joc.novaPartida();

        char[][] taulellEsperat = new char[3][3];
        char[][] taulellJoc = joc.getTaulell();
        Assertions.assertArrayEquals(taulellEsperat, taulellJoc);
    }

    @org.junit.jupiter.api.Test
    void novaPartida_jugador()  {
        Joc joc = new Joc();
        joc.novaPartida();

        Assertions.assertEquals(1, joc.getTurn());
    }

    @org.junit.jupiter.api.Test
    void jugar_partida()  {

        Joc joc = new Joc();
        joc.novaPartida();

        joc.jugar((short) 0, String.valueOf(0));

        char[][] taulellDespresJugada = joc.getTaulell();
        char fichaEsperada = joc.getTurn() == 1 ? 'O' : 'X';
        Assertions.assertEquals(fichaEsperada, taulellDespresJugada[0][0]);
    }
}