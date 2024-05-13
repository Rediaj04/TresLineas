        public class Main {
            public static void main(String[] args) {
                TUI tui = new TUI();
                Joc joc = new Joc(tui);
                int x;

                do {
                    //cambiar el turno al jugador 1
                    joc.setTurn((short)1);

                    //mostrar el menú y procesar la opcion seleccionada
                    tui.mostrarMenu();
                    x = tui.opcioEscollida();

                    switch (x) {
                        case 1: //ESte es el menú de nueva partida

                            int tamanyTablero = 3;
                            joc.novaPartida(tamanyTablero);
                            char[][] tablero = joc.getTaulell();
                            tui.mostrarTaulell(tamanyTablero,tablero);

                            while (true) {
                                tui.recollirJugada(joc.getTurn());
                                joc.solicitarJugadaJugador1();
                                tui.mostrarTaulell(tamanyTablero, joc.getTaulell());
                                if (joc.verificarGuanyador()) {
                                    System.out.println("¡Ha guanyat el jugador 1!");
                                    break;
                                } else if (joc.verificarEmpat()) {
                                    System.out.println("¡La partida ha acabat en empat!");
                                    break;
                                }

                                tui.recollirJugada(joc.getTurn());
                                joc.solicitarJugadaJugador2();
                                tui.mostrarTaulell(tamanyTablero, joc.getTaulell());
                                if (joc.verificarGuanyador()){
                                    System.out.println("¡Ha guanyat el Jugador 2!");
                                    break;
                                }  else if (joc.verificarEmpat()){
                                    System.out.println("¡La partida ha acabat en empat!");
                                    break;
                                }
                            }
                            break;
                        case 2: //Este es el menú de cargar partida
                            joc.carregarPartida();
                            break;
                        case 3: //Este es el menú de configuración
                            int nuevoTamany = tui.manejarConfiguracio();
                            if (nuevoTamany != -1) {
                                joc.guardarConfiguracioTabla(nuevoTamany);
                            } else{
                                x = -1;
                            }
                            break;

                        case 4: //Menú de salir
                            System.out.println(); //Un printl en el metodo que se use "SALIR"
                            break;
                        default:
                            System.out.println(); //Un printl en el metodo que se use "OPCION INCORRECTA"
                    }

                }
                while (x < 1 || x > 4);
            }
        }
