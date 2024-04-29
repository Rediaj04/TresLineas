import jdk.jshell.spi.ExecutionControl;

public class Joc {
    private char[][] taulell;
    private short turn;

    public char[][] getTaulell() {
        return taulell;
    }

    public short getTurn() {
        return turn;
    }

    public void novaPartida()  {
        this.taulell = new char[3][3];
        this.turn = 1;
    }
    public void jugar(short fila, String columna) {
        char ficha = (turn == 1) ? 'X' : 'O';
        taulell[fila][Integer.parseInt(columna)] = ficha;
        turn = (short) ((turn == 1) ? 2 : 1);
    }
    public void jugadaGuanyadora(short fila, Short columna){
     boolean x;
    }
}
