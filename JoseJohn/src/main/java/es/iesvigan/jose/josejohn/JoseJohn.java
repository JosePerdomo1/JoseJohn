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
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int Elegir_inicio(){
        Random random = new Random();		
        return random.nextInt(2) + 1;
    }

    public Character Mostrar_castilla_usuario(){
        return null;
    }
}
