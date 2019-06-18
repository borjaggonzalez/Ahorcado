package com.ipartek.formacion.examen;

/**
 * 
 * @author Borja
 *
 */
public class Tren {
	final static int CAPACIDAD_MAXIMA = 400;
	final static int EDAD_MAXIMA = 40;

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

	public String mostrar() {
		return "tipo=" + tipo + ", referencia=" + referencia;
	}

	/**
	 * Comprueba la capacidad maxima del tren
	 * 
	 * @see CAPACIDAD_MAXIMA
	 * @return true si es mayor o igual a la CAPACIDAD_MAXIMA, false en el caso contrario.
	 */
	public boolean estaLleno() {

		boolean resul = false;

		if (this.asientosOcupados >= CAPACIDAD_MAXIMA) {
			resul = true;
		}
		return resul;
	}

	public boolean esViejo() {

		boolean resul = false;

		if (this.aniosActivo >= EDAD_MAXIMA) {
			resul = true;
		}
		return resul;
	}

}
