import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class JocTest {

    @org.junit.jupiter.api.Test
    void novaPartida_taulell() throws ExecutionControl.NotImplementedException {
        Joc joc = new Joc();
        joc.novaPartida();

        char[][] taulellEsperat = new char[3][3];
        char[][] taulellJoc = joc.getTaulell();
        Assertions.assertArrayEquals(taulellEsperat, taulellJoc);
    }

    @org.junit.jupiter.api.Test
    void novaPartida_jugador() throws ExecutionControl.NotImplementedException {
        Joc joc = new Joc();
        joc.novaPartida();

        Assertions.assertEquals(1, joc.getTurn());
    }

    @org.junit.jupiter.api.Test
    void jugar_partida() throws ExecutionControl.NotImplementedException {

        Joc joc = new Joc();

        joc.novaPartida();

        char turn = joc.jugar[0][0];

        char[][] taulellJoc = joc.getTaulell();

        Assertions.assertEquals('X', taulellJoc[0][0]);
    }
}