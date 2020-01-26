import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Suma.Suma;

public class SumaTest {

	@Test
	public void primaC1() {
		Suma p1 = new Suma(10,10);
		int valor_esperado  = 20;
		int resultado = p1.calcular();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	@Test
	public void primaC2() {
		Suma p1 = new Suma(10,-10);
		int valor_esperado  = 0;
		int resultado = p1.calcular();
		assertEquals(0, resultado,0) ;

			
	}
	@Test
	public void primaC3() {
		Suma p1 = new Suma(-5,-5);
		int valorEsperado  = -10;
		int resultado = p1.calcular();
		assertEquals(valorEsperado, resultado,0) ;

			
	}
	@Test
	public void primaC4() {
		Suma p1 = new Suma(-5,10);
		int valorEsperado  = 5;
		int resultado = p1.calcular();
		assertEquals(valorEsperado, resultado,0) ;

			
	}
}
