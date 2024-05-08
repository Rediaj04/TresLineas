import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Nested
class JocTest {

    @org.junit.jupiter.api.Test
    void novaPartida_taulell() {
        Joc joc = new Joc();
        joc.novaPartida();

        int tamanyEsperat = 3;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("config.txt"));
            tamanyEsperat = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            tamanyEsperat = 3;
            e.printStackTrace();
        }

        char[][] taulellEsperat = new char[tamanyEsperat][tamanyEsperat];
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
        char fichaEsperada = joc.getTurn() == 1 ? 'X' : 'O';
        Assertions.assertEquals(fichaEsperada, taulellDespresJugada[0][0]);
    }
    @ParameterizedTest
    @CsvSource({"0,0" , "0,1" , "0,2" , "1.0", "1.1" , "1.2" , "2.0" , "2.1" , "2.2"})
    void testJugadaGuanyadora_TaulellEnBlanc() {
        Joc joc = new Joc();
        joc.novaPartida();

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                Assertions.assertFalse(joc.jugadaGuanyadora((short) fila, (short) columna));
            }
        }
    }
    @ParameterizedTest
    @CsvSource({"0,0" , "0,1" , "0,2" , "1.0", "1.1" , "1.2" , "2.0" , "2.1" , "2.2"})
    void testJugadaGuanyadora_UnaCasellaOcupada() {
        Joc joc = new Joc();
        joc.novaPartida();
        joc.jugar((short) 0, "0");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                Assertions.assertFalse(joc.jugadaGuanyadora((short) fila, (short) columna));
            }
        }
    }
    @ParameterizedTest
    @CsvSource({"0,0" , "0,1" , "0,2" , "1.0", "1.1" , "1.2" , "2.0" , "2.1" , "2.2"})
    void testJugadaGuanyadora_Jugador1Ganador() {
        Joc joc = new Joc();
        joc.novaPartida();
        joc.jugar((short) 0, "0");
        joc.jugar((short) 1, "1");
        joc.jugar((short) 0, "1");
        joc.jugar((short) 1, "2");
        joc.jugar((short) 0, "2");

        Assertions.assertTrue(joc.jugadaGuanyadora((short) 0, (short) 2));
    }
    @ParameterizedTest
    @CsvSource({"0,0" , "0,1" , "0,2" , "1.0", "1.1" , "1.2" , "2.0" , "2.1" , "2.2"})
    void testJugadaGuanyadora_Jugador2Ganador() {
        Joc joc = new Joc();
        joc.novaPartida();
        joc.jugar((short) 1, "0");
        joc.jugar((short) 0, "1");
        joc.jugar((short) 1, "1");
        joc.jugar((short) 0, "2");
        joc.jugar((short) 1, "2");

        Assertions.assertTrue(joc.jugadaGuanyadora((short) 1, (short) 2));
    }
}
