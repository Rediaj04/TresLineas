    public class Main {
        public static void main(String[] args) {
            TUI tui = new TUI();
            Joc joc = new Joc();
            int x;
    
            do {
                tui.mostrarMenu();
                x = tui.opcioEscollida();
    
                switch (x) {
                    case 1:
                        System.out.println("Nova partida");
                        joc.novaPartida();
                        joc.mostrarTaulell();
                        joc.solicitarJugadaJugador1();
                        joc.mostrarTaulellActualitzat();
                        joc.solicitarJugadaJugador2();
                        if (joc.verificarGuanyador()) {
                            System.out.println("¡Ha guanyat un jugador!");
                        } else if (joc.verificarEmpat()) {
                            System.out.println("¡La partida ha acabat en empat!");
                        }


                        break;
                    case 2:
                        System.out.println("Carregar partida");
                        joc.carregarPartida();
                        break;
                    case 3:
                        System.out.println(); //Case 3 = Menu de configuracion
                        tui.manejarConfiguracio();
                        break;

                    case 4:
                        System.out.println("Sortir");
                        break;
                    default:
                        System.out.println("Opció incorrecta");
                }
            } while (x < 1 || x > 4);
        }
    }
