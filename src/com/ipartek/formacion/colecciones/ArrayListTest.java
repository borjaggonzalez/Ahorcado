package com.ipartek.formacion.colecciones;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListTest {

	@Test
	public void test() {
		// String[] paises = new String[3];
		ArrayList<String> paises = new ArrayList<String>();

		assertTrue(paises.isEmpty());

		paises.add("Barakaldo");
		paises.add("EEUU");
		paises.add("Korea la buena");

		assertFalse(paises.isEmpty());

		// la longitud de los paises sea 3

		assertEquals(3, paises.size());
		// insertar "Kuala Lumpur" entre "Barakaldo" y "EEUU"

		paises.add(1, "Kuala Lumpur");

		assertEquals("Barakaldo", paises.get(0));
		assertEquals("Kuala Lumpur", paises.get(1));
		assertEquals("EEUU", paises.get(2));

		// insertar "Barakaldo" de nuevo, para comprobar que se pueden repetir
		paises.add("Barakaldo");
		assertEquals(5, paises.size());

		int cont = 0;
		Iterator<String> it = paises.iterator();

		while (it.hasNext()) {
			String pais = it.next();
			// Forma correcta de usar el .equals()
			if ("Barakaldo".equals(pais)) {
				cont++;
			}

		}

		assertEquals(2, cont);

		// eliminar "Korea la buena"
		assertTrue(paises.remove("Korea la buena"));
		assertFalse(paises.remove("Korea la buena"));

		// usar contains para saber si existe "Barakaldo" y "Korea la buena"
		assertTrue(paises.contains("Barakaldo"));
		assertFalse(paises.contains("Korea la buena"));

		// probar a eliminar todo
		paises.clear();
		assertTrue(paises.isEmpty());

		// TODO mirar como ordenar alfabeticamente
		paises.add("Korea la buena");
		paises.add("EEUU");
		paises.add("Barakaldo");
		
		
		
		//TODO sort
		Collections.sort(paises);
		
		assertEquals("Barakaldo", paises.get(0));
		assertEquals("EEUU", paises.get(1));
		assertEquals("Korea la buena", paises.get(2));
		
		
		
		
	}

}
