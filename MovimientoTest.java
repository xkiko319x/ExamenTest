package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	private static Movimiento m;
	
	@BeforeAll
	static void init () {
		m=new Movimiento();
	}

	@AfterAll
	static void finish () {
		m=null;
	}
	
	@Test
	void testGetImporte() {
		m.setImporte(300);
		assertEquals(300,m.getImporte());
	}

	@Test
	void testGetConcepto() {
		m.setConcepto("Ingreso");
		assertEquals("Ingreso",m.getConcepto());
	}

	@Test
	void testSetConcepto() {
		m.setConcepto("Retirada");
		assertEquals("Retirada",m.getConcepto());
	}

	@Test
	void testSetImporte() {
		m.setImporte(500);
		assertEquals(500,m.getImporte());
	}

}
