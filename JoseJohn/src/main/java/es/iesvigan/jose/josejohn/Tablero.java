package es.iesvigan.jose.josejohn;
import java.util.Arrays;
import java.util.Scanner;
import java.io.InputStream;

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
    public void insertarValor(InputStream entradaDatos) {
        final Scanner scanner = new Scanner(entradaDatos);
        System.out.print("Introduce el número de columna (1-6): ");
        int columna = scanner.nextInt() - 1;
        
        // Buscar la primera posición libre en la columna
        int fila = 5;
        while (fila >= 0 && mostrar_tablero[fila][columna] != '0') {
            fila--;
        }
        
        // Si se encontró una posición libre, asignar el valor
        if (fila >= 0) {
            System.out.print("Introduce el valor para colocar en esa celda (1 o 2): ");
            char valor = scanner.next().charAt(0);
            if (valor != '1' && valor != '2') {
                System.out.println("Valor inválido. Introduce 1 o 2.");
                scanner.close();
                return;
            }
            mostrar_tablero[fila][columna] = valor;
        } else {
            System.out.println("La columna está llena. Introduce una columna diferente.");
            insertarValor(entradaDatos); // Llamar recursivamente a la función con los mismos datos de entrada
        }
        
        scanner.close();
    }

    public Tablero() {
        this.mostrar_tablero = new char[6][6];
        for (int i = 0; i < mostrar_tablero.length; i++) {
            Arrays.fill(mostrar_tablero[i], '-');
        }
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
