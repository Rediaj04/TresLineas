import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Joc {

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

    private char[][] taulell;
    private short turn;
    int Tamany_tabla = 3;

    public void novaPartida(int tamanyTablero) {
        System.out.println("Buena Suerte!");

        if (tamanyTablero > 0) {
            Tamany_tabla = tamanyTablero;
        } else {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("config.txt"));
                Tamany_tabla = Integer.parseInt(reader.readLine());
                reader.close();
            } catch (IOException e) {
                System.out.println("Error al leer el archivo de configuración. Se utilizará el tamaño predeterminado de 3.");
                e.printStackTrace();
            }
        }
        taulell = new char[Tamany_tabla][Tamany_tabla];
        turn = 1;
    }

    public void carregarPartida (){
        System.out.println("Bievenido a cargar partida");
    }
    public void solicitarJugadaJugador1() {}
    public void mostrarTaulellActualitzat() {}

    public void solicitarJugadaJugador2() {}
    public boolean verificarGuanyador() {
        return false;
    }
    public boolean verificarEmpat() {
       return false;
    }


    public char[][] getTaulell() {
        return taulell;
    }

    public short getTurn() {
        return turn;
    }

    public void jugar(short fila, String columna) {
        turn = (short) ((turn == 1) ? 2 : 1);
        char ficha = (turn == 1) ? 'X' : 'O';
        taulell[fila][Integer.parseInt(columna)] = ficha;
    }

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