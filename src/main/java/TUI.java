import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class TUI {
    private Scanner sc = new Scanner(System.in);
    private int tamanyTablero;

    public  void mostrarMenu(){
        System.out.println("Trieu un nombre de les opcions a escollir:");
        System.out.println("1. Nova partida");
        System.out.println("2. Carregar partida");
        System.out.println("3. Configuració");
        System.out.println("4. Sortir");
    }
    public  void mostrar_mensaje_nova_partida(){
        System.out.println("Bona sort chanval/a!");
    }
    public  void mostrar_mensaje_carregar_partida(){
        System.out.println("Carrega la teva partida aquí");
    }
    public  void mostrar_mensaje_sortir(){
        System.out.println("Torna aviat");
    }
    public void mostra_mensaje_default(){
        System.out.println("Opción no válida. Por favor, elige una opción válida.");
    }

    public void tamanytui(int tamany) {
        this.tamanyTablero = tamany;
    }
    public int[] recollirJugada(short turn) {
        int fila, columna;
        do {
            System.out.println("Turno del jugador " + turn);
            System.out.println("Hola bones, que vols fer? \n 1. Desa la partida actual \n 2. Jugar el teu torn");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Eligió 1");
                    break;

                case 2:
                    System.out.println("Ingresa tu jugada (Fila Columna)");
                    fila = sc.nextInt();
                    columna = sc.nextInt();
                    // Verificar que las coordenadas estén dentro de los límites del tablero
                    if (fila < 0 || fila >= tamanyTablero || columna < 0 || columna >= tamanyTablero) {
                        System.out.println("Coordenadas fuera de los límites del tablero. Inténtalo de nuevo.");
                    } else {
                        return new int[]{fila, columna};
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        } while (true);
    }


    public void mostrarTaulell(char[][] taulell) {
        // Mostrar el tablero
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell[i].length; j++) {
                System.out.print(taulell[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int manejarConfiguracio() {
        System.out.println("Hola et trobes en configuració.");
        System.out.println("Què vols fer? Tria la teva opció\n");
        System.out.println("1. Definir el tamany de la tabla (tingues en compte que per preterminat és 3. amb valors entre 3 i 10.)");
        System.out.println("2. Tornar enrere");
        int opcionConfig = opcioEscollidaConfig();

        if (opcionConfig == 1) {
            System.out.println("Si us plau, introduïu el nou valor per a la mida de la taula:");
            return llegirTamany();
        } else if (opcionConfig == 2) {
            return -1;
        } else {
            System.out.println("Opció incorrecta, si us plau escolleix una opció vàlida");
            return manejarConfiguracio();
        }
    }
    public int llegirTamany() {
        return sc.nextInt();
    }
    public int opcioEscollidaConfig() {
        return sc.nextInt();
    }
    public int opcioEscollida() {
        return sc.nextInt();
    }


    public void fiDePartida(short guanyador) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");
    }

    public void actualizarTamanyTaulell(int nouTamany) {
        System.out.println("Actualizando tamaño del tablero a " + nouTamany + "x" + nouTamany);
        // Puedes agregar aquí cualquier lógica necesaria para actualizar la interfaz de usuario con el nuevo tamaño del tablero
    }
    }


