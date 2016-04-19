package ar.edu.unlam.basica2.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void CalcularPerimetroDeUnCirculoDeRadio2() {
		
		Circulo miCirculo = new Circulo(2);
		assertEquals(2,miCirculo.getRadio(),0.01);
	}
	@Test
	public void CalcularPerimetroDeUnCirculoDeRadio3Punto7() {
		
		Circulo miCirculo = new Circulo(3.7);
		assertEquals(3.7,miCirculo.getRadio(),0.01);
	}
	@Test
	public void CalcularPerimetroDeUnCirculoDeRadio5() {
		
		Circulo miCirculo = new Circulo(5);
		assertEquals(5,miCirculo.getRadio(),0.01);
	}
	@Test
	public void CalcularPerimetroDeUnCirculoDeRadio10Punto9() {
		
		Circulo miCirculo = new Circulo(10.9);
		assertEquals(10.9,miCirculo.getRadio(),0.01);
	}
	
	@Test
	public void CalcularPerimetroDeUnCirculoDeRadio9Punto8() {
		
		Circulo miCirculo = new Circulo (9.8);
		assertNotEquals (615.73,miCirculo.getRadio(),0.01);
	}
	
	@Test
	public void CalcularPerimetroDeUnCirculoDeRadio16Punto6() {
		
		Circulo miCirculo = new Circulo (16.6);
		assertNotEquals (865.67,miCirculo.getRadio(),0.01);
	}

}
