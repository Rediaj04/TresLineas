    public class Main {
        public static void main(String[] args) {
            TUI tui = new TUI();
            Joc joc = new Joc();
            int x;
    
            do {
                tui.mostrarMenu();
                x = tui.opcionEscollida();
    
                switch (x) {
                    case 1:
                        System.out.println("Nueva partida");
                        joc.novaPartida();
                        joc.mostrarTaulell();
                        joc.solilicitarJugadaJugador1();
                        joc.mostrarTaulellActualitzat();
                        joc.solilicitarJugadaJugador2();
                        if (joc.verificarGuanyador()) {
                            System.out.println("¡Ha ganado un jugador!");
                        } else if (joc.verificarEmpat()) {
                            System.out.println("¡La partida ha terminado en empate!");
                        }


                        break;
                    case 2:
                        System.out.println("Cargar partida");
                        joc.cargarPartida();
                        break;
                    case 3:
                        System.out.println(); //Case 3 = Menu de configuracion
                        tui.manejarConfiguracion();
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
