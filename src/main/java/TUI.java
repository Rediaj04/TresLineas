import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class TUI {
    private Scanner sc = new Scanner(System.in);

    public  void mostrarMenu(){
        System.out.println("Trieu un nombre de les opcions a escollir:");
        System.out.println("1. Nova partida");
        System.out.println("2. Carregar partida");
        System.out.println("3. Configuració");
        System.out.println("4. Sortir");
    }

    public void mostrarTaulell(int midaTaulell, char[][] taulell) {
        // Mostrar el tablero
        for (int i = 0; i < midaTaulell; i++) {
            for (int j = 0; j < midaTaulell; j++) {
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
            System.out.println("Opció incorrecta, si us plau escolleix una opció vàlida\n");
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
    public int[] recollirJugada (short turn) {
        System.out.println("Turno del jugador" + turn + ". Por favor, ingrese su jugada (fila columna)");
        //solicitar entrada del jugador
        int fila = sc.nextInt();
        int columna = sc.nextInt();
        //devolver coordenadas como array
        return new int[]{fila, columna};

    }

    }


