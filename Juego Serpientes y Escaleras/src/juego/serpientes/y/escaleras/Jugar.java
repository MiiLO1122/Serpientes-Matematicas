/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.serpientes.y.escaleras;

import java.util.Scanner;

/**
 *
 * @author miilo
 */
public class Jugar {

    int[][] tablero = new int[8][8];
    String entrada = "";
    int carne = 0;

    public Jugar() {

    }

    public void ejecutar() {
        System.out.println("Por favor ingrese su numero de carne");
        Scanner entradaEscaner = new Scanner(System.in);
        entrada = entradaEscaner.nextLine();
        carne = Integer.parseInt(entrada);
        if (carne % 2 == 0) {
            System.out.println("Su carne " + carne + " es par");
            for (int i = 7; i >=0; i--) {
                if (i%2==0) {
                    for (int j = 0; j < 8; j++) {
                    int posi = i + 1;
                    int posj = j + 1;

                    System.out.println(posi + "i" + posj + "j");
                }
                }else{
                    for (int j = 7; j >=0; j--) {
                    int posi = i + 1;
                    int posj = j + 1;

                    System.out.println(posi + "i" + posj + "j");
                }
                }
            }

        } else if (carne % 2 !=0) {
            System.out.println("su carne " + carne + " es impar");
            for (int i = 7; i >=0; i--) {
                if (i%2==1) {
                    for (int j = 0; j < 8; j++) {
                    int posi = i + 1;
                    int posj = j + 1;

                    System.out.println(posi + "i" + posj + "j");
                }
                }else{
                    for (int j = 7; j >=0; j--) {
                    int posi = i + 1;
                    int posj = j + 1;

                    System.out.println(posi + "i" + posj + "j");
                }
                }
            }
        }
    }
}
