/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Ejemplo071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        Scanner entrada = new Scanner(System.in);
        int dato;
        int suma = 0;
        String mensaje = "";
        // arreglo de tipo entero
        int[] arreglo1 = new int[5];

        // Se asigna valores al arreglo, pidiendo valores por teclado
        // se usa un ciclo repetitivo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese un valor para el arreglo");
            dato = entrada.nextInt();
            // se asigna la variable dato a la posición del arreglo
            // de acuerdo al valor de i
            arreglo1[i] = dato;

        }

        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            // agrego el valor de la posición del arreglo a la variable
            // acumuladora  suma
            mensaje = String.format("%s%d\n", mensaje, arreglo1[i]);
            suma = suma + arreglo1[i];

        }

        System.out.printf("La suma de los valores del arreglo %ses %d\n", mensaje, suma);

        // Santiago Chavez
    }

}
