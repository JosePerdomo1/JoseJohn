/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package es.iesvigan.jose.josejohn;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Jose Antonio
 */
public class JoseJohn {
    
    public static void main(String[] args) {
        int numeroCasilla,eleccion;
        char letraCasilla;
        Scanner teclado = new Scanner(System.in);


        eleccion = Elegir_inicio();
        System.out.println("El jugador " + eleccion + " comienza");
        System.out.println("Escribe el numero");

        numeroCasilla = teclado.nextInt();

        letraCasilla = Mostrar_castilla_usuario(numeroCasilla);
    }

    public static int Elegir_inicio(){
        Random random = new Random();		
        return random.nextInt(2) + 1;
    }

    public static char Mostrar_castilla_usuario(int numeroCasilla){
        if (numeroCasilla == 0){
            return '-';
        }else if (numeroCasilla == 1){
            return 'X';
        }else if (numeroCasilla == 2){
            return 'O';
        }
        return 0;
    }
}
