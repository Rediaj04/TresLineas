import java.util.Scanner;

public class TUI {
    private final Scanner sc;

    public TUI() {
        sc = new Scanner(System.in);
    }

    public void Salir(String x) {
        System.out.println(x);
    }

    public void Configuraciones(String x) {
        System.out.println(x);
    }

    public void CargarPartida(String x) {
        System.out.println(x);
    }

    public void NuevaPartida(String x) {
        System.out.println(x);
    }

    public void Menu(String x) {
        System.out.println(x);
    }

    public int OpcionElegida() {
        return sc.nextInt();
    }
}
