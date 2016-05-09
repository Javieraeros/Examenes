package TercerTrimestreTest;

import static org.junit.Assert.*;

import org.junit.Test;

import TercerTrimestre.MisArrays;

public class MisArraysTest {

	@Test
	public void testMisArrays() {
		MisArrays prueba=new MisArrays(0,1,2,3,4,5,6,7);
		
	}

	
	@Test
	public void testGetA() {
		MisArrays prueba=new MisArrays(0,1,2,3,4,5,6,7);
		int[] esperado={0,1,2,3,4,5,6,7};
		assertArrayEquals(esperado, prueba.getA());
	}

	@Test
	public void testSetA() {
		MisArrays cambia=new MisArrays(0,1,2,3,4,5,6,7);
		int[] esperado={0,1,4,-5,14,5,-21,4852};
		cambia.setA(esperado);
		assertArrayEquals(esperado,cambia.getA());
	}

	@Test
	public void testGetIndiceDeDistanciaMinima() {
		MisArrays distancia=new MisArrays(3,7,12,6,1,4,9,10);
		MisArrays distancia2=new MisArrays(-20,40,12,120,-89,-8,23,2015);
		assertEquals(6,distancia.getIndiceDeDistanciaMinima());
		assertEquals(1,distancia2.getIndiceDeDistanciaMinima());
	}
	
	@Test
	public void testGetIndiceDeDistanciaMinimaArreglado(){
		MisArrays distancia=new MisArrays(0,4,8,12,16,20,24,25);
		MisArrays distancia2=new MisArrays(-20,40,12,120,-189,-8,23,2015);
		MisArrays distancia3=new MisArrays(3,7,12,6,1,4,9,10);
		MisArrays distancia4=new MisArrays(-89,-90,100,875,-952,69,154,89);
		assertEquals(6,distancia.getIndiceDeDistanciaMinimaArreglado());
		assertEquals(1,distancia2.getIndiceDeDistanciaMinimaArreglado());
		assertEquals(6,distancia3.getIndiceDeDistanciaMinimaArreglado());
		assertEquals(0,distancia4.getIndiceDeDistanciaMinimaArreglado());
	}
	
	@Test
	public void testRestarInverso() {
		MisArrays restar=new MisArrays(0,4,8,12,16,20,24,25);
		int[] restado={-20,40,12,120,-189,-8,23,2015};
		int[] esperado={-2015,-19,16,201,-104,8,-16,45};
		assertArrayEquals(esperado,restar.restarInverso(restado));
	}
	
	@Test
	public void testRestarInversoArreglado() {
		MisArrays restar=new MisArrays(0,4,8,12,16,20,24,25);
		int[] restado={-20,40,12,120,-189,-8,23,2015};
		int[] esperado={-2015,-19,16,201,-104,8,-16,45};
		assertArrayEquals(esperado,restar.restarInversoArreglado(restado));
	}

}
