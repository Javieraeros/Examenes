package TercerTrimestreTest;

import static org.junit.Assert.*;

import org.junit.Test;

import TercerTrimestre.Tiempo;

public class TiempoTest {
	Tiempo pruebaSets=new Tiempo(0,0,0);
	
	@Test
	public void testGetSemanas() {
		Tiempo prueba=new Tiempo(5,5,3);
		assertEquals(5,prueba.getSemanas(),0.00001);
	}

	@Test
	public void testSetSemanas() {
		pruebaSets.setSemanas(15.23);
		assertEquals(15.23,pruebaSets.getSemanas(),0.001);
	}

	@Test
	public void testGetDias() {
		Tiempo prueba=new Tiempo(5,-5,3);
		assertEquals(-5,prueba.getDias(),0.00001); //No se si nos dejar�a poner d�as negativos
		
	}

	@Test
	public void testSetDias() {
		pruebaSets.setDias(24);
		assertEquals(24,pruebaSets.getDias(),0.00001);
	}

	@Test
	public void testGetHoras() {
		Tiempo prueba=new Tiempo(5,5,3);
		assertEquals(3,prueba.getHoras(),0.00001);
	}

	@Test
	public void testSetHoras() {
		pruebaSets.setHoras(4.52);
		assertEquals(4.52,pruebaSets.getHoras(),0.001);
	}

	@Test
	public void testADias() {
		Tiempo prueba=new Tiempo(15,5,3);
		assertEquals(110.16,prueba.aDias(),0.1);
	}

	@Test
	public void testAHoras() {
		Tiempo prueba=new Tiempo(15,5,3);
		assertEquals(2643,prueba.aHoras(),0.1);
	}
	@Test
	public void testADiasArreglado() {
		Tiempo prueba=new Tiempo(15,5,3);
		assertEquals(110.16,prueba.aDiasArreglado(),0.1);
	}

	@Test
	public void testAHorasArreglado() {
		Tiempo prueba=new Tiempo(15,5,3);
		assertEquals(2643,prueba.aHorasArreglado(),0.1);
	}
	

}
