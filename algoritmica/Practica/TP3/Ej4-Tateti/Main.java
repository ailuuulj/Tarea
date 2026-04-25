//4. Desarrollar un juego similar al Tatetí, cuando comienza el juego se solicita el tamaño del tablero y luego se pide a 
// cada usuario que ingrese alternativamente su jugada, si la posición no es válida se la solicita nuevamente. 
// El juego termina cuando todas las fichas de un jugador están en línea (el jugador gana) o cuando no hay más posiciones libres en el tablero.

import Player.*;
import Board.*;
import Game.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int width;
        int height;

        System.out.println("Ingrese el ancho del tablero: ");
        width = i.nextInt();

        System.out.println("Ingrese el alto del tablero: ");
        height = i.nextInt();

        Board board = new Board(height, width);

        Player p1 = new Player();
        System.out.println("Ingrese el Simbolo a utilizar ( X | O )");
        char op1 = i.next().charAt(0);

        Player p2 = new Player();
        System.out.println("Ingrese el Simbolo a utilizar ( X | O )");
        char op2 = i.next().charAt(0);
        while (op1 == op2){
            System.out.println("Los simbolos deben ser distintos\nIngrese el Simbolo a utilizar ( X | O )");
            op2 = i.next().charAt(0);
        }

        p1.setSymbol(op1);
        p2.setSymbol(op2);

        Game game = new Game();
        

        
        
    }

    
}
