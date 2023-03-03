package es.iesvigan.jose.josejohn;

import java.util.Arrays;
import java.util.Scanner;
import java.io.InputStream;

public class Tablero {
    public char[][] mostrar_tablero;
    public int fila = 5;
    public int columna;


    public void imprimir() {
        for (int i = 0; i < mostrar_tablero.length; i++) {
            for (int j = 0; j < mostrar_tablero[i].length; j++) {
                System.out.print(mostrar_tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // public static int[][] obtenerTablero() {
    // int[][] tablero = new int[6][6];
    // for (int i = 0; i < tablero.length; i++) {
    // for (int j = 0; j < tablero[i].length; j++) {
    // tablero[i][j] = mostrar_tablero[i][j];
    // }
    // }
    // return tablero;
    // }

    public static char Mostrar_castilla_usuario(int Elegir_inicio) {
        if (Elegir_inicio == 0) {
            return '-';
        } else if (Elegir_inicio == 1) {
            return 'X';
        } else if (Elegir_inicio == 2) {
            return 'O';
        } else {
            return 0;
        }

    }

    public void insertarValor(InputStream entradaDatos) {
        Scanner scanner = new Scanner(entradaDatos);
        System.out.print("Introduce el número de columna (1-6): ");
        columna = scanner.nextInt() -1;

        // Buscar la primera posición libre en la columna
        while (fila >= 0 && mostrar_tablero[fila][columna] != '-') {
            fila--;
        }

        // Si se encontró una posición libre, se agina el valor
        if (fila >= 0) {
            int inicio = JoseJohn.cambiarJugador();
            char valor = Mostrar_castilla_usuario(inicio);
            mostrar_tablero[fila][columna] = valor;
        } else {
            System.out.println("La columna está llena. Introduce una columna diferente.");
            insertarValor(entradaDatos); // Llamar recursivamente a la función con los mismos datos de entrada
        }

    }

    public Tablero() {
        this.mostrar_tablero = new char[6][6];
        for (int i = 0; i < mostrar_tablero.length; i++) {
            Arrays.fill(mostrar_tablero[i], '-');
        }
    }

    public char[][] getMostrar_tablero() {
        return mostrar_tablero;
    }

    public void setMostrar_tablero(char[][] mostrar_tablero) {
        this.mostrar_tablero = mostrar_tablero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

}
