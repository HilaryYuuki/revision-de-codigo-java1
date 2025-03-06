
import java.util.Scanner; // Importación de la clase Scanner

public class Codigo4 {

	public static void main(String[] args) {
    	
        // Crear un objeto Scanner para el Jugador 1
        Scanner entradaJugador1 = new Scanner(System.in);
        
        // Solicitar la opción del Jugador 1
        System.out.print("Turno del Jugador 1 (introduzca piedra, papel o tijeras): ");
        String opcionJugador1 = entradaJugador1.nextLine();
        
        // Solicitar la opción del Jugador 2 utilizando un nuevo objeto Scanner
        System.out.print("Turno del Jugador 2 (introduzca piedra, papel o tijeras): ");
        Scanner entradaJugador2 = new Scanner(System.in);
        String opcionJugador2 = entradaJugador2.nextLine();
        
        // Comparar las opciones de los jugadores usando .equals()
        if (opcionJugador1.equals(opcionJugador2)) {
            System.out.println("Empate");
        } else {
            int ganador = 2; // Variable para determinar el ganador, por defecto el Jugador 2
            switch (opcionJugador1) {
                case "piedra":
                    if (opcionJugador2.equals("tijeras")) {
                        ganador = 1; // Si la opción del Jugador 1 es piedra y la del Jugador 2 es tijeras, gana el Jugador 1
                    }
                    break; // Añadi break 
                case "papel":
                    if (opcionJugador2.equals("piedra")) {
                        ganador = 1; // Si la opción del Jugador 1 es papel y la del Jugador 2 es piedra, gana el Jugador 1
                    }
                    break; // Añadi break 
                case "tijeras":
                    if (opcionJugador2.equals("papel")) {
                        ganador = 1; // Si la opción del Jugador 1 es tijeras y la del Jugador 2 es papel, gana el Jugador 1
                    }
                    break; // Añadi break 
                default:
                    // Caso para opciones inválidas
                    System.out.println("Entrada inválida");
                    return; // Salir del programa
            }
            // Mostrar el ganador
            System.out.println("Gana el Jugador " + ganador);
        }
    }
}
