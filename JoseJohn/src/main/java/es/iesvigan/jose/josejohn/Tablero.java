package es.iesvigan.jose.josejohn;
import java.util.Arrays;
import java.util.Scanner;

public class Tablero {
    private boolean decision_tablero;
    private char[][] mostrar_tablero;

    public void imprimir() {
        for (int i = 0; i < mostrar_tablero.length; i++) {
            for (int j = 0; j < mostrar_tablero[i].length; j++) {
                System.out.print(mostrar_tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Tablero() {
        this.mostrar_tablero = new char[6][6];
        for (int i = 0; i < mostrar_tablero.length; i++) {
            Arrays.fill(mostrar_tablero[i], '-');
        }
    }

    public void insertarValor() {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de fila (1-6): ");
        int fila = scanner.nextInt() - 1;
        System.out.print("Introduce el número de columna (1-6): ");
        int columna = scanner.nextInt() - 1;
        System.out.print("Introduce el valor para colocar en esa celda (1 o 2): ");
        char valor = scanner.next().charAt(0);
        if (valor != '1' && valor != '2') {
            System.out.println("Valor inválido. Introduce 1 o 2.");
            return;
        }
        mostrar_tablero[fila][columna] = valor;
    }

    public boolean isDecision_tablero() {
        return decision_tablero;
    }

    public void setDecision_tablero(boolean decision_tablero) {
        this.decision_tablero = decision_tablero;
    }

    public char[][] getMostrar_tablero() {
        return mostrar_tablero;
    }

    public void setMostrar_tablero(char[][] mostrar_tablero) {
        this.mostrar_tablero = mostrar_tablero;
    }
    
    
}
