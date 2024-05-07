import jdk.jshell.spi.ExecutionControl;

import java.io.FileWriter;
import java.util.Scanner;

public class TUI {
    private Scanner sc = new Scanner(System.in);

    public  void mostrarTaulell(char taulell, short torn) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");
    }

    public  void mostrarMenu(){
        System.out.println("Elige un número de las opciones a escoger:");
        System.out.println("1. Nueva partida");
        System.out.println("2. Cargar partida");
        System.out.println("3. Configuración");
        System.out.println("4. Salir");
    }

    public void manejarConfiguracion() {
        System.out.println("Hola te encuentras en configuracion.");
        System.out.println("Que deseas realizar? Elige tu opcion\n");
        System.out.println("1. Definir el tamaño de la tabla (ten en cuenta que por preterminado es 3. con valores entre 3 y 10. ");
        System.out.println("2. Volver atras");
        int opcionConfig = opcionEscollidaConfig();

        if (opcionConfig == 1) {
            System.out.println("Por favor, introduce el nuevo valor para el tamaño de la tabla:");
            int nuevoValor = leerTamaño();
            Joc joc = new Joc();
            joc.guardarConfiguracionTabla(nuevoValor);
        } else if (opcionConfig == 2) {
            mostrarMenu();
        } else {
            System.out.println("Opción incorrecta, por favor elige una opción válida.\n");
            manejarConfiguracion();
        }
    }
    public int leerTamaño() {
        return sc.nextInt();
    }
    public int opcionEscollidaConfig() {
        return sc.nextInt();
    }
    public int opcionEscollida() {
        return sc.nextInt();
    }

    public void fiDePartida(short guanyador) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");
    }
    public void recollirJugada () throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");

    }
}

