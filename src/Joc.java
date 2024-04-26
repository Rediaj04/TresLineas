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

    public void novaPartida() throws ExecutionControl.NotImplementedException {
        //throw new ExecutionControl.NotImplementedException("");
        this.taulell = new char[3][3];
        this.turn = 1;
    }
    public void jugar() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
    public void jugadaGuanyadora(short fila, String columna){
     boolean x;
    }
}
