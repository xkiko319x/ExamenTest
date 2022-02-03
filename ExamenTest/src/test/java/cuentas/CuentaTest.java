package cuentas;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	private static Cuenta c;
	
	
	@BeforeAll
	static void init () {
		c=new Cuenta("23","KIKO");
	}

	@AfterAll
	static void finish(){
		c=null;
	}

	@Test
	void testCuenta() {
		assertEquals(0, c.mMovimientos);
		
	}

	@Test
	void testIngresar() throws IngresoNegativoException {
		c.ingresar("Ingreso", 300);
		assertEquals(300, c.getSaldo());
	}

	@Test
	void testRetirar() throws IngresoNegativoException, SaldoInsuficienteException {
		c.ingresar("Ingreso", 300);
		c.retirar("Retirada", 200);
		assertEquals(200, c.getSaldo());
	}

	@Test
	void testGetSaldo() {
		
	}

	@Test
	void testAddMovimiento() {
		
	}

}
