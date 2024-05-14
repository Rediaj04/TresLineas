        public class Main {
            public static void main(String[] args) {
                TUI tui = new TUI();
                Joc joc = new Joc();
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
                                int[] coordenadas = tui.recollirJugada(joc.getTurn());
                                int fila = coordenadas[0];
                                int columna = coordenadas[1];

                                //Llamar al método jugar con las coordenadas ingresadas
                                joc.jugar((short)fila, columna);
                                //Mostrar tablero actualizado
                                // Verificar si hay un ganador o un empate después del movimiento del jugador actual
                                if (joc.verificarGuanyador()) {
                                    if (joc.getTurn() == 1) {
                                        System.out.println("¡Ha guanyat el jugador 1!");
                                    } else {
                                        System.out.println("¡Ha guanyat el jugador 2!");
                                    }
                                    break;
                                } else if (joc.verificarEmpat()) {
                                    System.out.println("¡La partida ha acabat en empat!");
                                    break;
                                }
                                joc.canviartTurn();
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
