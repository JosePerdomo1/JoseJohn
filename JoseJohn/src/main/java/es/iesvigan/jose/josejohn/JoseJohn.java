/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package es.iesvigan.jose.josejohn;

/**
 *
 * @author Jose Antonio
 */
public class JoseJohn {

    public static void main(String[] args) {
        Tablero Tablero= new Tablero();
        System.out.println("Este es el tablero actualmente");
        Tablero.imprimir();
        Tablero.insertarValor();
        Tablero.imprimir();
    }
}
