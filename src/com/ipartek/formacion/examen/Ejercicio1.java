package com.ipartek.formacion.examen;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Mediante el peso indica la categoria de 30 boxeadores que son introducidos por teclado
 * @author Borja
 *
 */
public class Ejercicio1 {

	public static final int PESADO_MIN = 91;
	public static final int MEDIANO_MAX = 90;
	public static final int MEDIANO_MIN = 65;
	public static final int LIGERO_MAX = 64;
	public static final int LIGERO_MIN = 58;
	public static final int PLUMA_MAX = 57;
	public static final int PLUMA_MIN = 52;
	public static final int MOSCA_MAX = 51;
	public static final int N_BOXEADORES = 30;

	public static void main(String[] args) {
		int peso_boxeador;

		Scanner sc = new Scanner(System.in);

		try {

			for (int i = 1; i <= N_BOXEADORES; i++) {
				System.out.println("Introduce el peso del boxeador");
				peso_boxeador = sc.nextInt();

				if (peso_boxeador > 0) {

					System.out.println(peso_boxeador);

					if (peso_boxeador <= MOSCA_MAX) {
						System.out.println("Boxeador " + i + " Tu categoria es MOSCA");
					} else if (peso_boxeador >= PLUMA_MIN && peso_boxeador <= PLUMA_MAX) {
						System.out.println("Boxeador " + i + " Tu categoria es PLUMA");
					} else if (peso_boxeador <= LIGERO_MIN && peso_boxeador <= LIGERO_MAX) {
						System.out.println("Boxeador " + i + " Tu categoria es LIGERO");
					} else if (peso_boxeador >= MEDIANO_MIN && peso_boxeador <= MEDIANO_MAX) {
						System.out.println("Boxeador " + i + " Tu categoria es MEDIANO");
					} else if (peso_boxeador > PESADO_MIN) {
						System.out.println("Boxeador " + i + " Tu categoria es PESADO");
					}

				} else {
					System.out.println("Has introducido datos sin el formato indicado o fuera del rango");
					break;
				}

			} // FIN FOR
		} catch (InputMismatchException e) {
			System.out.println("Has introducido datos sin el formato indicado o fuera del rango");
		}

		sc.close();
	}

}
