import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TUI tui = new TUI();
        int x;

        do {
            tui.Menu("Elige un número de las opciones a escoger:");
            tui.NuevaPartida("1. Nueva partida");
            tui.CargarPartida("2. Cargar partida");
            tui.Configuraciones("3. Configuración");
            tui.Salir("4. Salir");

            x = tui.OpcionElegida();

            switch (x) {
                case 1:
                    System.out.println("Nueva partida");
                    break;
                case 2:
                    System.out.println("Cargar partida");
                    break;
                case 3:
                    System.out.println("Configuración");
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (x < 1 || x > 4);
    }
}
