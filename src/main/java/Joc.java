public class Joc {
    private char[][] taulell;
    private short turn;

    public char[][] getTaulell() {
        return taulell;
    }

    public short getTurn() {
        return turn;
    }

    public void novaPartida() {
        taulell = new char[3][3];
        turn = 1;
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