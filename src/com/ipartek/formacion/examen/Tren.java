package com.ipartek.formacion.examen;

/**
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
		this.setTipo(tipo);
		this.setReferencia(referencia);
		this.setAsientosOcupados(asientosOcupados);
		this.setAniosActivo(aniosActivo);
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
