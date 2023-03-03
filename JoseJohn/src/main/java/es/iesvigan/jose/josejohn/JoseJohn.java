/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package es.iesvigan.jose.josejohn;

import java.util.Random;

/**
 *
 * @author Jose Antonio
 */
public class JoseJohn {
    private static int jugadorActual = 0; // Se establece una variable para el jugador actual

    public static int Elegir_inicio() {
        Random random = new Random();
        int jugador_actual = random.nextInt(2) + 1;
        return jugador_actual;
    }

    // Función para alternar los turnos
    public static int cambiarJugador() {
        if (jugadorActual == 0) {
            jugadorActual = Elegir_inicio(); // Se genera un valor aleatorio para el primer turno
        } else {
            // Se alterna entre los dos jugadores
            if (jugadorActual == 1) {
                return jugadorActual = 2;
            } else {
                return jugadorActual = 1;
            }
        }
        return jugadorActual;

    }

    public static final int NumerosFila = 6;
    public static final int NumerosColumna = 7;

    public static boolean verificarGanador(char[][] mostrar_tablero, int fila, int columna) {
        char valor = mostrar_tablero[fila][columna];
        int contador = 0;
    
        // Verificar en vertical
        for (int i = 0; i < 6 && contador < 4; i++) {
            if (mostrar_tablero[i][columna] == valor) {
                contador += 1;
            } else {
                contador = 0;
            }
        }
        if (contador >= 4) {
            return true;
        }
    
        // Verificar en horizontal
        contador = 0;
        for (int j = 0; j < 7 && contador < 4; j++) {
            if (mostrar_tablero[fila][j] == valor) {
                contador += 1;
            } else {
                contador = 0;
            }
        }
        if (contador >= 4) {
            return true;
        }
    
        // Verificar en diagonal (desde la posición actual hacia arriba y hacia la izquierda)
        contador = 0;
        int i = fila, j = columna;
        while (i >= 0 && j >= 0 && mostrar_tablero[i][j] == valor) {
            contador += 1;
            i--;
            j--;
        }
        if (contador >= 4) {
            return true;
        }
    
        // Verificar en diagonal (desde la posición actual hacia abajo y hacia la derecha)
        contador = 0;
        i = fila + 1;
        j = columna + 1;
        while (i < 6 && j < 7 && mostrar_tablero[i][j] == valor) {
            contador += 1;
            i++;
            j++;
        }
        if (contador >= 4) {
            return true;
        }
    
        // Verificar en diagonal (desde la posición actual hacia arriba y hacia la derecha)
        contador = 0;
        i = fila;
        j = columna;
        while (i >= 0 && j < 7 && mostrar_tablero[i][j] == valor) {
            contador += 1;
            i--;
            j++;
        }
        if (contador >= 4) {
            return true;
        }
    
        // Verificar en diagonal (desde la posición actual hacia abajo y hacia la izquierda)
        contador = 0;
        i = fila + 1;
        j = columna - 1;
        while (i < 6 && j >= 0 && mostrar_tablero[i][j] == valor) {
            contador += 1;
            i++;
            j--;
        }
        if (contador >= 4) {
            return true;
        }
    
        // Si no hay ganador, retornar false
        return false;
    }

    public static void main(String[] args) {
        Tablero Tablero = new Tablero();
        System.out.println("Este es el tablero actualmente");
        // Con este for insertamos el valor "X" o "O" y se acabara cuando el tablero
        // este lleno, (creo que es mejor que hacer una funcion de tablero lleno para
        // que no sean tantas lineas)
        for (int i = 0; i < 36; i++) {
            Tablero.insertarValor(System.in);
            Tablero.imprimir();
            
           
        }

    }
}
