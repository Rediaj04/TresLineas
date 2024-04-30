import jdk.jshell.spi.ExecutionControl;

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

/*

Metodos antiguos usados para mostrar menu

    public void novaPartida(String x) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");
    }

    public void carregarPartida(String x) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");

    }
    public void configuracions(String x) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");

    }
    public void sortir(String x) throws ExecutionControl.NotImplementedException {throw new ExecutionControl.NotImplementedException(" ");

    }

    public void menu(String x) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(" ");
    }
*/