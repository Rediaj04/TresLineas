import java.util.Scanner;

public class TUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        do {
            metodos.Menu("Elige un número de las opciones a escoger:");
            metodos.NP("1. Nueva partida");
            metodos.CONF("3. Configuración");
            metodos.MostrarMSG_CG("2. Cargar partida");
            metodos.Salida("4. Salir");

            x = sc.nextInt();

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
