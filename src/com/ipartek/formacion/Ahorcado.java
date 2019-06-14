package com.ipartek.formacion;

import java.util.Scanner;

public class Ahorcado {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vidas = 7;
		int aciertos = 0;
		int tamano;
		String palabra = "murcielago";
		String opcion; // aqui metemos la letra que el usuario indica.
		char[] respuesta;
		tamano = palabra.length();
		respuesta = new char[tamano];
		boolean[] lExistente= new boolean[tamano];

		for (int i = 0; i < tamano; i++) {
			respuesta[i] = '_';
		}

		System.out.println("******************AHORCADO****************** ");
		System.out.printf("La palabra es: ");
		for (int i = 0; i < tamano; i++) {
			System.out.printf(respuesta[i] + " ");
		}
		Scanner sc = new Scanner(System.in);
		while (vidas > 0 && aciertos < tamano) {
			// pedimos la letra a comprobar si esta

			do {
				System.out.println("\n\n Introduce una letra: ");
				opcion = sc.nextLine().trim().toUpperCase();// trim = elimina espacios delante y detras
			} while (opcion.isEmpty());

			int lacertada = 0;

			/*
			 * Comprobamos si son iguales la letra introducida y alguna de las letras de la
			 * palabra.
			 */
			
			
			for (int i = 0; i < tamano; i++) {
				if (opcion.charAt(0) == palabra.toUpperCase().charAt(i) && lExistente[i]!=true) {
					respuesta[i] = opcion.charAt(0);
					lExistente[i]=true;
					lacertada++;
					aciertos++;

				}
			}

			// Restamos 1 vida si no esta la letra
			if (lacertada == 0) {
				vidas--;
				System.out.println("Te quedan: " + vidas + " vidas.");
			}

			// Pintamos la palabra con las letras acertadas.
			System.out.printf("La palabra es: ");
			for (int i = 0; i < tamano; i++) {
				System.out.printf(respuesta[i] + " ");
			}

		} // fin del while

		if (aciertos == tamano) {
			System.out.println("\n\n");
			System.out.println("***********************************");
			System.out.println("***** HAS ACERTADO LA PALABRA *****");
			System.out.println("***********************************");
		}

		if (vidas == 0) {
			System.out.println("\n\n");
			System.out.println("***********************************");
			System.out.println("************ GAME OVER ************");
			System.out.println("***********************************");
			System.out.println("La palabra era: " + palabra);
		}

		sc.close();
	}

}
