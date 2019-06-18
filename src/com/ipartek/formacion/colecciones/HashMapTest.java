package com.ipartek.formacion.colecciones;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test() {
		HashMap<String, String> paises = new HashMap<String, String>();
		paises.put("BK", "Barakaldo");
		paises.put("EU","EEUU" );
		paises.put("KO","Korea la buena");
		
		assertEquals(3,paises.size());
		
		assertEquals("Barakaldo",paises.get("BK"));
		assertNull(paises.get("NO-EXISTE-KEY"));
		
		paises.put("BK","Barakaldo");
		
		int cont=0;
		Iterator<String> it = paises.values().iterator();//@see keySet()
		
		while (it.hasNext()) {
			String pais = it.next();
			// Forma correcta de usar el .equals()
			if ("Barakaldo".equals(pais)) {
				cont++;
			}

		}
		
		assertEquals(1, cont);
		
	}

}
