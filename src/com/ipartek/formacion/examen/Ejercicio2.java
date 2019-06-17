package com.ipartek.formacion.examen;

import java.util.Scanner;


/**
 * Le indica al piloto de un campeonato si aun puede ganar el titulo o no dependiendo de los puntos que lleve,
 * los puntos son introducidos por teclado
 * @author Borja
 *
 */
public class Ejercicio2 {

	public static int PUNTOS_CAMPEONATO = 70;

	public static void main(String[] args) {
		int puntosPiloto;
		boolean campeonato;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los puntos que llevas en el campeonato:");
		puntosPiloto = sc.nextInt();

		campeonato = Ganar(puntosPiloto);

		if (campeonato == true) {
			System.out.println("Puedes ganar el campeonato");
		} else {
			System.out.println("Ponte las pilas si quieres ganar");
		}
sc.close();
	}
/**
 * Comprueba si el piloto puede o no ganar el titulo
 * @param puntosPiloto --> Lo puntos que lleva el piloto en el campeonato
 * @return
 */
	public static boolean Ganar(int puntosPiloto) {
		boolean campeonato = false;
		if (puntosPiloto >= PUNTOS_CAMPEONATO) {
			campeonato = true;
		}

		return campeonato;
	}

}
