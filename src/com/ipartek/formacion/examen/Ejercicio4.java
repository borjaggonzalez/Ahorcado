package com.ipartek.formacion.examen;
/**
 * Se introducen los datos de un tren por teclado Luego se muestran todos sus
 * datos identificativos Si esta el aforo completo o no Si es demasiado viejo
 * para cicular o no.
 * 
 * @author Borja
 *
 */
public class Ejercicio4 {

	public static int CAPACIDAD_MAX = 400;
	public static int ANIOS_MAXIMOS = 40;

	public static void main(String[] args) {

		Tren tren = new Tren("TAV", 25607, 150, 28);

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
