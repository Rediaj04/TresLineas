        public class Main {
            public static void main(String[] args) {
                TUI tui = new TUI();
                Joc joc = new Joc();
                int tamañotablero = joc.tomartamaño();
                tui.tamanytui(joc.tomartamaño());
                int x;
                do {
                    //cambiar el turno al jugador 1
                    joc.setTurn((short)1);

                    //mostrar el menú y procesar la opcion seleccionada
                    tui.mostrarMenu();
                    x = tui.opcioEscollida();

                    switch (x) {
                        case 1: //ESte es el menú de nueva partida
                            tui.mostrar_mensaje_nova_partida();
                            joc.novaPartida();
                            char[][] tablero = joc.getTaulell();
                            tui.mostrarTaulell(tablero);

                            while (true) {
                                int[] coordenadas = tui.recollirJugada(joc.getTurn());
                                int fila = coordenadas[0];
                                int columna = coordenadas[1];
                                joc.jugar((short)fila, columna); //Llamar al método jugar con las coordenadas ingresadas
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
                            tui.mostrar_mensaje_carregar_partida();
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
                            tui.mostrar_mensaje_sortir();
                            break;
                        default: tui.mostra_mensaje_default();
                    }
                }
                while (x < 1 || x > 4);
            }
        }
