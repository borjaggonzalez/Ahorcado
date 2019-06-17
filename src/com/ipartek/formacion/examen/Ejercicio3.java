package com.ipartek.formacion.examen;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Se introducen 10 numeros 
 * Se calcula cuantos son multiplos de 7
 * Su media aritmetica con 2 decimales
 * 
 * @author Borja
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int[] datos = new int[10];
		int multiplos = 0;
		float media = 0;
		DecimalFormat formato = new DecimalFormat("#.00");

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < datos.length; i++) {
			if (i == 0) {
				System.out.println("Introduce un numero");
			} else {
				System.out.println("Introduce otro numero");
			}

			datos[i] = sc.nextInt();
		}

		for (int i = 0; i < datos.length; i++) {
			if (datos[i] % 7 == 0) {
				multiplos++;
			}
		}

		System.out.printf("\n\n Hay " + multiplos + " multiplos de 7 y son:");
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] % 7 == 0) {
				if(i==0) {
					System.out.printf(" "+datos[i]);
				}else {
					System.out.printf(", "+datos[i]);
				}
			
			}
		}

		for (int i = 0; i < datos.length; i++) {
			media = media + datos[i];
		}

		media = media / datos.length;

		System.out.println("\n\n La media es: " + formato.format(media));

		sc.close();
	}

}
