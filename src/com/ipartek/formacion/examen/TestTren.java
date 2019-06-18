/**
 * 
 */
package com.ipartek.formacion.examen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Curso
 *
 */
public class TestTren {

	Tren tren;
	static final String TIPO = "TAV";
	static final int REFENCIA = 2056;
	static final int ASIENTOS_OCUPADOS = 5;
	static final int ANIOS = 3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tren = new Tren(TIPO, REFENCIA, ASIENTOS_OCUPADOS, ANIOS);
	}

	@After
	public void tearDown() throws Exception {
		tren = null;
	}

	@Test
	public void testTren() {
		assertEquals(TIPO, tren.getTipo());
		assertEquals(REFENCIA, tren.getReferencia());
		assertEquals(ASIENTOS_OCUPADOS, tren.getAsientosOcupados());
		assertEquals(ANIOS, tren.getAniosActivo());

		Tren tNull = new Tren(null, 0, 0, 0);
		assertEquals(null, tNull.getTipo());
		assertEquals(0, tNull.getReferencia());
		assertEquals(0, tNull.getAsientosOcupados());
		assertEquals(0, tNull.getAniosActivo());
	}

	@Test
	public void testGetTipo() {
		assertEquals(TIPO, tren.getTipo());
	}

	@Test
	public void testSetTipo() {
		tren.setTipo("Tren");
		assertEquals("Tren", tren.getTipo());
	}

	@Test
	public void testGetReferencia() {
		assertEquals(REFENCIA, tren.getReferencia());
	}

	@Test
	public void testSetReferencia() {
		tren.setReferencia(30252);
		assertEquals(30252, tren.getReferencia());
	}

	@Test
	public void testGetAsientosOcupados() {
		assertEquals(ASIENTOS_OCUPADOS, tren.getAsientosOcupados());
	}

	@Test
	public void testSetAsientosOcupados() {
		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA + 1);
		assertEquals(Tren.CAPACIDAD_MAXIMA + 1, tren.getAsientosOcupados());

		tren.setAsientosOcupados(-1);
		assertEquals(-1, tren.getAsientosOcupados());
	}

	@Test
	public void testGetAniosActivo() {
		assertEquals(ANIOS, tren.getAniosActivo());
	}

	@Test
	public void testSetAniosActivo() {
		tren.setAniosActivo(-1);
		assertEquals(-1, tren.getAniosActivo());

		tren.setAniosActivo(Tren.EDAD_MAXIMA + 1);
		assertEquals(Tren.EDAD_MAXIMA + 1, tren.getAniosActivo());

	}

	@Ignore
	public void testMostrar() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaLleno() {
		tren.estaLleno();
		assertFalse(tren.estaLleno());
		
		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA);
		assertTrue(tren.estaLleno());
	
		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA+1);
		assertTrue(tren.estaLleno());
	}
	
	

	@Test
	public void testEsViejo() {
		assertFalse(tren.esViejo());

		tren.setAniosActivo(40);
		assertTrue(tren.esViejo());

		tren.setAniosActivo(41);
		assertTrue(tren.esViejo());
	}

}
