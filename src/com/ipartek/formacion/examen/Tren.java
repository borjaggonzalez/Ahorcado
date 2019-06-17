package com.ipartek.formacion.examen;

/**
 * Se introducen los datos de un tren por teclado Luego se muestran todos sus
 * datos identificativos Si esta el aforo completo o no Si es demasiado viejo
 * para cicular o no.
 * 
 * @author Borja
 *
 */
public class Tren {

	private String tipo;
	private int referencia;
	private int asientosOcupados;
	private int aniosActivo;

	

	public Tren(String tipo, int referencia, int asientosOcupados, int aniosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.aniosActivo = aniosActivo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public int getAniosActivo() {
		return aniosActivo;
	}

	public void setAniosActivo(int aniosActivo) {
		this.aniosActivo = aniosActivo;
	}
	
	

}
