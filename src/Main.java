import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        do {
            System.out.println("Elige un número de las opciones a escoger:");
            System.out.println("1. Nueva partida");
            System.out.println("2. Cargar partida");
            System.out.println("3. Configuración");
            System.out.println("4. Salir");

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
