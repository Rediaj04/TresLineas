    public class Main {
        public static void main(String[] args) {
            TUI tui = new TUI();
            Joc joc = new Joc();
            int x;
            // getter en joc de tablero, para que tui lo muestre pedido desde main
            //
            //lo mismo con los demas.
            do {
                tui.mostrarMenu();
                x = tui.opcioEscollida();
    
                switch (x) {
                    case 1:
                        System.out.println("Nova partida");
                        int tamanyTablero = 3;
                        joc.novaPartida(tamanyTablero);
                        char[][] tablero = joc.getTaulell();
                        tui.mostrarTaulell(tamanyTablero,tablero);
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
                        System.out.println();
                        joc.carregarPartida();
                        break;
                    case 3:
                        System.out.println(); //Case 3 = Menu de configuracion
                        int nuevoTamany = tui.manejarConfiguracio();
                        if (nuevoTamany != -1) {
                            joc.guardarConfiguracioTabla(nuevoTamany);
                        }
                        break;

                    case 4:
                        System.out.println(); //Un printl en el metodo que se use "SALIR"
                        break;
                    default:
                        System.out.println(); //Un printl en el metodo que se use "OPCION INCORRECTA"
                }
            } while (x < 1 || x > 4);
        }
    }
