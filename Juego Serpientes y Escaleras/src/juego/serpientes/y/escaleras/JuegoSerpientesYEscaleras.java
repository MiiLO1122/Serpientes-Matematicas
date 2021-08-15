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
public class JuegoSerpientesYEscaleras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        System.out.println("=======MENU PRINCIPAL=======");
        System.out.println("1. Iniciar Juego");
        System.out.println("2. Retomar Juego");
        System.out.println("3. Generar Reportes");
        System.out.println("4. Salir");
        System.out.print("ELIGA UNA OPCION:");
        Scanner opcion = new Scanner(System.in);
        opc = Integer.parseInt(opcion.next());
        if (opc > 4) {
            System.out.println("Por favor ejecuta el juego nuevamente y elige una opcion valida");
        } else if (opc < 0) {
            System.out.println("Por favor ejecuta el juego nuevamente y elige una opcion valida");

        } else {
            switch (opc) {
                case 1:
                    Jugar tablero = new Jugar();
                    tablero.ejecutar();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("ADIOS");
                    break;
            }
            while (opc != 4);
        }

    }

}
