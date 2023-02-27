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
    
   
    public static void main(String[] args) {
        Tablero Tablero= new Tablero();
        System.out.println("Este es el tablero actualmente");
        
        Tablero.insertarValor(System.in);
        Tablero.imprimir();
    }
}
