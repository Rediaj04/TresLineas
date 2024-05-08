import jdk.jshell.spi.ExecutionControl;
import java.util.Scanner;

public class TUI {
    private Scanner sc = new Scanner(System.in);

   /* public void mostrarTaulell() { (char taulell, short torn) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");
    } */

    public  void mostrarMenu(){
        System.out.println("Trieu un nombre de les opcions a escollir:");
        System.out.println("1. Nova partida");
        System.out.println("2. Carregar partida");
        System.out.println("3. Configuració");
        System.out.println("4. Sortir");
    }

    public void manejarConfiguracio() {
        System.out.println("Hola et trobes en configuració.");
        System.out.println("Què vols fer? Tria la teva opció\n");
        System.out.println("1. Definir el tamany de la tabla (tingues en compte que per preterminat és 3. amb valors entre 3 i 10.)");
        System.out.println("2. Tornar enrere");
        int opcionConfig = opcioEscollidaConfig();

        if (opcionConfig == 1) {
            System.out.println("Si us plau, introduïu el nou valor per a la mida de la taula:");
            int nuevoValor = llegirTamany();
            Joc joc = new Joc();
            joc.guardarConfiguracioTabla(nuevoValor);
        } else if (opcionConfig == 2) {
            mostrarMenu();
        } else {
            System.out.println("Opció incorrecta, si us plau escolleix una opció vàlida\n");
            manejarConfiguracio();
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
    public void recollirJugada () throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");

    }

    }


