package com.ipartek.formacion.examen;

import java.util.Scanner;

/**
 * Se introducen los datos de un tren por teclado Luego se muestran todos sus
 * datos identificativos Si esta el aforo completo o no Si es demasiado viejo
 * para cicular o no.
 * @author Borja
 *
 */
public class Ejercicio4 {

	public static int CAPACIDAD_MAX = 400;
	public static int ANIOS_MAXIMOS = 40;

	public static void main(String[] args) {

		String tipo;
		int referencia;
		int asientosOcupados;
		int aniosActivo;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tipo de tren:");
		tipo = sc.nextLine();
		
		System.out.println("Introduce la refencia del tren:");
		referencia = sc.nextInt();
		
		System.out.println("Introduce los asientos ocupados de tren:");
		asientosOcupados = sc.nextInt();
		
		System.out.println("Introduce los años activos de tren:");
		aniosActivo = sc.nextInt();
		
		
		Tren tren = new Tren(tipo, referencia, asientosOcupados, aniosActivo);

		System.out.println(tren.getTipo());
		System.out.println(tren.getReferencia());
		if (tren.getAsientosOcupados() > CAPACIDAD_MAX) {
			System.out.println("Tren completo");
		} else {
			System.out.println("Aun quedan plazas");
		}
		if (tren.getAniosActivo() > ANIOS_MAXIMOS) {
			System.out.println("El tren es demasiado viejo para circular");
		} else {
			System.out.println("El tren puede circular");
		}
		
		
		
	}
}
