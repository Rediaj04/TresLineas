import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Joc {
    private char[][] taulell;
    private short turn;
    private int Tamany_tabla = 3;

    public Joc() {
        ;
    }


    public void guardarConfiguracioTabla(int valor) {
        try {
            FileWriter writer = new FileWriter("config.txt");
            writer.write(Integer.toString(valor));
            writer.close();
            System.out.println("Valor desat correctament al fitxer de configuració.");
        } catch (IOException e) {
            System.out.println("Error al guardar la configuració en el arxiu.");
            e.printStackTrace();
        }
    }

    public void novaPartida() {
        System.out.println("Buena Suerte!");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("config.txt"));
            Tamany_tabla = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            Tamany_tabla = 3;
        }
        taulell = new char[Tamany_tabla][Tamany_tabla];
        turn = 1;
    }


    public void carregarPartida() {
        System.out.println("Bievenido a cargar partida");
    }

    /*  public void solicitarJugadaJugador1() {
          tui.recollirJugada(turn);
          int fila = tui.llegirTamany();
          int columna = tui.llegirTamany();
          jugar((short) fila, columna);
          turn = 2;
      } */
    public void mostrarTaulellActualitzat() {
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell[i].length; j++) {
                System.out.print(taulell[i][j] + " ");
            }
            System.out.println();
        }
    }

   /* public void solicitarJugadaJugador2() {
        tui.recollirJugada(turn);
        int fila = tui.llegirTamany();
        int columna = tui.llegirTamany();
        jugar((short) fila, columna);
    } */


    public boolean verificarGuanyador() {
        return false;
    }

    public boolean verificarEmpat() {
        return false;
    }

    public void canviartTurn() {
        turn = (short) ((turn == 1) ? 2 : 1);
    }

    public char[][] getTaulell() {
        return taulell;
    }

    public short getTurn() {
        return turn;
    }

    public void setTurn(short turn) {
        this.turn = turn;
    }

    public void jugar(short fila, int columna) {
        char ficha = (turn == 1) ? 'X' : 'O';
        taulell[fila][columna] = ficha;
        mostrarTaulellActualitzat();
    } //Llama el método para mostrar el tablero actualizado

    public boolean jugadaGuanyadora(short fila, short columna) {

        if (taulell[fila][columna] == '\u0000') {
            return false;
        }

        char ficha = taulell[fila][columna];


        if (taulell[fila][0] == ficha && taulell[fila][1] == ficha && taulell[fila][2] == ficha) {
            return true;
        }
        if (taulell[0][columna] == ficha && taulell[1][columna] == ficha && taulell[2][columna] == ficha) {
            return true;
        }
        if ((fila == columna) && (taulell[0][0] == ficha && taulell[1][1] == ficha && taulell[2][2] == ficha)) {
            return true;
        }
        if ((fila + columna == 2) && (taulell[0][2] == ficha && taulell[1][1] == ficha && taulell[2][0] == ficha)) {
            return true;
        }

        return false;
    }


}