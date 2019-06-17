package com.ipartek.formacion.examen;


/**
 * Se introducen los datos de un tren por teclado
 * Luego se muestran todos sus datos identificativos
 * Si esta el aforo completo o no
 * Si es demasiado viejo para cicular o no.
 * @author Borja
 *
 */
public class Tren {
	
	private String tipo;
	private int referencia;
	private int asientosOcupados;
	private int aniosActivo;

	public static int CAPACIDAD_MAX = 400;
	public static int ANIOS_MAXIMOS = 40;

	public Tren(String tipo, int referencia, int asientosOcupados, int aniosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.aniosActivo = aniosActivo;
	}

	public static void main(String[] args) {

		String viejo;

		Tren tren = new Tren("TAV", 25607, 150, 28);

		System.out.println(tren.tipo);
		System.out.println(tren.referencia);
		if (tren.asientosOcupados > CAPACIDAD_MAX) {
			System.out.println("Tren completo");
		} else {
			System.out.println("Aun quedan plazas");
		}
		if (tren.aniosActivo > ANIOS_MAXIMOS) {
			System.out.println("El tren es demasiado viejo para circular");
		}else {
			System.out.println("El tren puede circular");
		}

	}

}
