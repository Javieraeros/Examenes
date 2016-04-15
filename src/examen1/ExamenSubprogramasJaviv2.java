//Nombre de mi programa: ExamenSubprogramasJavi

/**Analisis en documentación externa
 */

/*Pseudocódigo generalizado
 * Inicio
 * repetir
 * 	mostrarMenú
 * 	leerOpción
 * mientras opción<0 o opción>2
 * mientras opción!=0
 * 	segun opción
 * 		caso 1:
 * 			repetir
 * 				mostrarSubmenú
 * 			mientras
 * 		caso 2:
 * 
 * 	fin_según
 * 	repetir
 * 		mostrarMenú
 * 		leerOpción
 * 	mientras opción<0 ó opción>2
 * Fin_Mientras opción
 * Fin
 */
package examen1;
import java.util.Scanner;
public class ExamenSubprogramasJaviv2{
	public static void mostrarMenu(){
		System.out.println("Elija una de las siguientes opciones, por favor: ");
		System.out.println("1.Operaciones con Fechas");
		System.out.println("2.Pintar figuras geométricas");
		System.out.println("0.Salir del programa");
	}
	public static void mostrarSubmenuFechas(){
		System.out.println("Elija una de las siguientes subopciones, por favor: ");
		System.out.println("1.Comparar fechas");
		System.out.println("2.Siguiente Fecha");
		System.out.println("0.Salir del Submenú");
	}
	public static void mostrarSubmenuPintar(){
		System.out.println("Elija una de las siguientes subopciones, por favor: ");
		System.out.println("1.Pintar Piramide");
		System.out.println("2.Pintar Cuadrado");
		System.out.println("0.Salir del Submenú");
	}
	public static void main (String[] args){
		int opcion,opcionsub;
		int diax,mesx,anyox,diay,mesy,anyoy;
		int tamaniopiramide;
		int resultado;
		char imprimible;
		char repetir;
		Scanner teclado=new Scanner(System.in);
		
		do{
			//mostrarMenú
			mostrarMenu();
			//leerOpción
			opcion=teclado.nextInt();
		}
		while(opcion<0 || opcion>2);
		
		while (opcion!=0){
			switch (opcion){
				case 1:
/*************************************SUBMENÚ FECHA******************************************/
				do{
					//mostrarSubmenúFecha
					mostrarSubmenuFechas();
					//leerOpción
					opcionsub=teclado.nextInt();
				}
				while(opcionsub<0 || opcionsub>2);

				if(opcionsub!=0){
					switch (opcionsub){
						case 1:
						do{
							//CompararFechas
								//LeerValidarDatosFechas
								do{
									System.out.println("El anio tiene que ser mayor que 1582,el mes entre 1 y 12 y el día correspondiente al mes");
									System.out.println("Introduce el primer dia :");
									diax=teclado.nextInt();
									System.out.println("Introduce el primer mes :");
									mesx=teclado.nextInt();
									System.out.println("Introduce el primer anio :");
									anyox=teclado.nextInt();
									System.out.println("Introduce el segundo dia :");
									diay=teclado.nextInt();
									System.out.println("Introduce el segundo mes :");
									mesy=teclado.nextInt();
									System.out.println("Introduce el segundo anio :");
									anyoy=teclado.nextInt();
								}
								while(anyox<1582 || mesx<1 || mesx>12 || diax<1 || diax>31 ||
								(diax>30 && (mesx==4 || mesx== 6 || mesx==9 || mesx==11)) ||
								(diax>28 && mesx==2 && (anyox%4!=0 || (anyox%100==0 && anyox%400!=0))) || (diax>29 && mesx==2) ||
								anyoy<1582 || mesy<1 || mesy>12 || diay<1 || diay>31 ||
								(diay>30 && (mesy==4 || mesy== 6 || mesy==9 || mesy==11)) ||
								(diay>28 && mesy==2 && (anyoy%4!=0 || (anyoy%100==0 && anyoy%400!=0))) || (diay>29 && mesy==2)
								);
								//Comparaciónfechas
								resultado=SubprogramasJaviv2.comparacionFechas(diax,mesx,anyox,diay,mesy,anyoy);
								//MostrarResultados
								if (resultado==1){
									System.out.println("La primera fecha es anterior");
								}else{
									if (resultado==-1)
									System.out.println("La primera fecha es posterior");
									else
									System.out.println("Las fechas son iguales");
								}
							//PreguntarRepetir
							System.out.println("Quieres volver a ejecutar?(S/N)");
							repetir=Character.toUpperCase(teclado.next().charAt(0));
						}
						while (repetir=='S');
						break;
						case 2:
						do{
							//SiguienteFecha
								//LeerValidarFecha
								do{
									System.out.println("El anio tiene que ser mayor que 1582,el mes entre 1 y 12 y el día correspondiente al mes");
									System.out.println("Introduce el dia :");
									diax=teclado.nextInt();
									System.out.println("Introduce el mes :");
									mesx=teclado.nextInt();
									System.out.println("Introduce el anio :");
									anyox=teclado.nextInt();
								}
								while(anyox<1582 || mesx<1 || mesx>12 || diax<1 || diax>31 ||
								(diax>30 && (mesx==4 || mesx== 6 || mesx==9 || mesx==11)) ||
								(diax>28 && mesx==2 && (anyox%4!=0 || (anyox%100==0 && anyox%400!=0)))
								 || (diax>29 && mesx==2));
								 //CalcularSiguienteFecha
								 SubprogramasJaviv2.calcularSiguienteFecha(diax,mesx,anyox);
							//PreguntarRepetir
							System.out.println("Quieres volver a ejecutar?(S/N)");
							repetir=Character.toUpperCase(teclado.next().charAt(0));
						}
						while (repetir=='S');
						break;
					}
				}
				break;
				
/*************************************SUBMENÚ PINTAR******************************************/
				case 2:
				do{
					//mostrarSubmenúPintar
					mostrarSubmenuPintar();
					//leerOpciónsub
					opcionsub=teclado.nextInt();
				}
				while(opcionsub<0 || opcionsub>2);
				
				if (opcionsub!=0){
					switch (opcionsub){
						case 1:
						do{
							//PintarPiramide
								//LeerValidarDatosPirámide
								do{
								System.out.println("Introduce el número de la pirámide (2-9):");
								tamaniopiramide=teclado.nextInt();
								System.out.println("Introduce el caraácter de la pirámide(imprimible:");
								imprimible=teclado.next().charAt(0); // no se como hacer que detecte que sea imprimible
								}
								while (tamaniopiramide<2 || tamaniopiramide>9);
								//DibujarPirámide
								SubprogramasJaviv2.dibujarPiramide(tamaniopiramide,imprimible);
							//PreguntarRepetir
							System.out.println("Quieres volver a ejecutar?(S/N)");
							repetir=Character.toUpperCase(teclado.next().charAt(0));
						}
						while (repetir=='S');
						break;
						case 2:
						do{
							//PintarCuadrado
							SubprogramasJaviv2.dibujarCuadrado();
							//PreguntarRepetir
							System.out.println("Quieres volver a ejecutar?(S/N)");
							repetir=Character.toUpperCase(teclado.next().charAt(0));
						}
						while (repetir=='S');
						break;
					}
				}
				break;
			}
			do{
				//mostrarMenú
				mostrarMenu();
				//leerOpciónsub
				opcion=teclado.nextInt();
			}
			while(opcion<0 || opcion>2);
		}
	}	
}
