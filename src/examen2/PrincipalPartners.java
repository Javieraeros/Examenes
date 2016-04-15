package examen2;
/* ***************************
 * Estudio Programa Principal:
 * ***************************
 * Programa creado para gestionar y obtener diferente información de los socios de un club.
 * Podremos ver:
 * 				-El salario medio de los partners entre 18 y 30 años.
 * 				-Datos de todas las muejeres u hombres del club.
 * 				-Número de Partners que realizan un deporte.
 * 				-Porcentaje de Partners que realizan un deporte.
 * 				-El primer socio de un género dado y esté comprendido entre dos edades
 * Entradas:
 * 				-Un número para tomar la opción del menú
 * 				-Un número para decidir el género
 * 				-Un número para elegir el deporte del cual queremos saber sus datos
 *  			-dos números indicando las edades entre las cuales se tiene que encontrar el rango del socio
 * Salidas:
 * 				-Nada, pintará en pantalla los diferentes menús y los resultados
 * 
 * 
 * comentario=Por tratarse de un examen, crearé un array de Partners y lo inicializaré yo,para evitar estar leyendo de teclado.
 * 
 * Pseudocódigo generalizado
 * Inicio
 * mostrarMenuPrincipalLeeryValidarOpción
 * mientras opcion!=0
 * 	según opcion
 * 		caso 1:
 * 			calcularSalarioMedio
 * 			mostrarSalarioMedio
 * 		caso 2:
 * 			mostrarMenuGeneroLeeryValidarOpcion
 * 			segun opcionGenero
 * 				caso 1:
 * 					mostrarDatosmujeres*
 * 				caso 2:
 * 					mostrarDatosHombres*
 * 			fin_segun opciongenero
 * 		caso 3:
 * 			mostarMenudeportesLeeryValidarOpcion
 * 			segun opcionDeportes
 * 				caso 1:
 * 					calcularPartnersRUGBY*
 * 				caso 2:
 * 					calcularPartnersCRICKET*
 * 				caso 3:
 * 					calcularPartnersGOLF*
 * 				caso 4:
 * 					calcularPartnersTENNIS*
 * 			fin_segun opcionDeportes
 * 			mostrarResultadoDeportes
 * 		caso 4:
 * 			mostarMenuDeportesLeeryValidarOpcion					//mismo menú
 * 			segun opcionDeportes
 * 				caso 1:
 * 					calcularPorcentajePartnersRUGBY*
 * 				caso 2:
 * 					calcularPorcentajePartnersCRICKET*
 * 				caso 3:
 * 					calcularPorcentajePartnersGOLF*
 * 				caso 4:
 * 					calcularPorcentajePartnersTENNIS*
 * 			fin_segun opcionDeportes
 * 			mostrarResultadosPorcentajesDeportes
 * 		caso 5:
 * 			leeryValidarDatos
 * 			buscarSocio*
 * 			mostrarSocio
 * 	fin_segun
 * 	mostrarMenuPrincipalLeeryValidarOpción
 * fin_mientras
 * Fin
 * 
 */

import java.util.*;
public class PrincipalPartners {
	
	public static void menuPrincipal(){
		System.out.println("Selecciona una opción: ");
		System.out.println("1.Salario medio de los Partners entre 18 y 30 años");
		System.out.println("2.Datos según género");
		System.out.println("3.Partners que hacen un deporte");
		System.out.println("4.Porcentaje de Partners que hacen un deporte");
		System.out.println("5.Primer socio de un género y con una edad comprendida en un rango");
		System.out.println("0.Salir");
	}
	
	public static void menuGenero(){
		System.out.println("Selecciona el género:");
		System.out.println("1.Mujeres");
		System.out.println("2.Hombres");
	}
	
	
	public static void menuDeportes(){
		System.out.println("Selecciona un deporte:");
		System.out.println("1.Rugby");
		System.out.println("2.Cricket");
		System.out.println("3.Golf");
		System.out.println("4.Tenis");
		
	}
	
	public static void main (String args[]) {
	try{
		Partner Paulo=new Partner("Paulo soares",1000,20,'M',Sports.RUGBY);
		Partner Javi=new Partner("Javi ruiz",1500,40,'M',Sports.GOLF);
		Partner David=new Partner("David Rodriguez",300,18,'M',Sports.TENNIS);
		Partner Dani=new Partner("Daniel Leal",952.32,21,'M',Sports.CRICKET);
		Partner Luis=new Partner("Luis Gutierrez",56456.21,50,'M',Sports.RUGBY);
		Partner Josema=new Partner("Jose Maria sabariego",5465.0,31,'M',Sports.TENNIS);
		Partner Sandra=new Partner("sandra Yero",78945.10,40,'F',Sports.TENNIS);
		Partner Alejandro=new Partner("Alejnadro Ortiz",87961.84,24,'M',Sports.GOLF);
		Partner Alberto=new Partner("Alberto Rivera",800.23,26,'M',Sports.CRICKET);
		Partner Mercedes=new Partner("Mercedes Blanco",1245.98,27,'F',Sports.TENNIS);
		Partner Diego=new Partner("Diego Maradona",999.99,22,'M',Sports.RUGBY);
		Partner[] arrayPartners=new Partner[11];
		arrayPartners[0]=Paulo;
		arrayPartners[1]=Javi;
		arrayPartners[2]=David;
		arrayPartners[3]=Dani;
		arrayPartners[4]=Luis;
		arrayPartners[5]=Josema;
		arrayPartners[6]=Sandra;
		arrayPartners[7]=Alejandro;
		arrayPartners[8]=Alberto;
		arrayPartners[9]=Mercedes;
		arrayPartners[10]=Diego;
		int opcion=-1;
		int opcionGenero;
		int opcionDeportes;
		char genero;
		int edad1,edad2;
		double resultado=0;
		Scanner teclado=new Scanner(System.in);
		Partners calculadora=new Partners();
		//mostrarMenuPrincipalLeeryValidarOpción
		do{
			menuPrincipal();
			opcion=teclado.nextInt();
		}while(opcion<0 || opcion>5);
		while(opcion!=0){
			switch (opcion){
				case 1:
					//Calcular salario medio
					resultado=calculadora.salarioMedioEntreEdades(arrayPartners,18,30);
					//Mostrar salario medio
					System.out.println("El salario medio es: "+resultado);
				break;
				case 2:
					//mostrarMenuGeneroLeeryValidarOpcion
					do{
						menuGenero();
						opcionGenero=teclado.nextInt();
					}while(opcionGenero<1 || opcionGenero>2);
					switch (opcionGenero){
						case 1:
							//mostrarDatosmujeres*
							calculadora.muestraDatosGenero(arrayPartners,'F');
						break;
						case 2:
							//mostrarDatosHombres*
							calculadora.muestraDatosGenero(arrayPartners,'M');
						break;
					}
				break;
				case 3:
					//mostarMenudeportesLeeryValidarOpcion
					do{
						menuDeportes();
						opcionDeportes=teclado.nextInt();
					}while(opcionDeportes<1 || opcionDeportes>4);
					switch (opcionDeportes){
						case 1:
							//calcularPartnersRUGBY*
							resultado=calculadora.partnersDeportes(arrayPartners,Sports.RUGBY);
						break;
						case 2:
							//calcularPartnersCRICKET*ç
							resultado=calculadora.partnersDeportes(arrayPartners,Sports.CRICKET);
						break;
						case 3:
							//calcularPartnersGOLF*
							resultado=calculadora.partnersDeportes(arrayPartners,Sports.GOLF);
						break;
						case 4:
							//calcularPartnersTENNIS*
							resultado=calculadora.partnersDeportes(arrayPartners,Sports.TENNIS);
						break;
					}
					//mostrarResultadoDeportes
					System.out.println("El número de personas que juegan es: "+resultado);
				break;
				case 4:
 					//mostarMenuDeportesLeeryValidarOpcion
					do{
						menuDeportes();
						opcionDeportes=teclado.nextInt();
					}while(opcionDeportes<1 || opcionDeportes>4);
										
 					switch (opcionDeportes){
						case 1:
 							//calcularPorcentajePartnersRUGBY*
 							resultado=calculadora.porcentajePartnersDeportes(arrayPartners,Sports.RUGBY);
 						break;
 						case 2:
 							//calcularPorcentajePartnersCRICKET*
 							resultado=calculadora.porcentajePartnersDeportes(arrayPartners,Sports.CRICKET);
 						break;
 						case 3:
 							//calcularPorcentajePartnersGOLF*
 							resultado=calculadora.porcentajePartnersDeportes(arrayPartners,Sports.GOLF);
 						break;
 						case 4:
 							//calcularPorcentajePartnersTENNIS*
 							resultado=calculadora.porcentajePartnersDeportes(arrayPartners,Sports.TENNIS);
 						break;
					}
 					//mostrarResultadosPorcentajesDeportes
 					System.out.println("El PORCENTAJE de personas que juegan es: "+resultado);
				break;
				case 5:
					//leeryValidarDatos
					do{
						System.out.println("Introduce el genero");
						genero=teclado.next().charAt(0);
						System.out.println("Introduce la edad menor");
						edad1=teclado.nextInt();
						System.out.println("Introduce la edad mayor");
						edad2=teclado.nextInt();
						
					}while(genero!='M' && genero!='F' || edad1>=edad2 || edad1<18 || edad2<18);
					//buscarSocio*
					Partner socio=calculadora.buscaPartnerGeneroEdad(arrayPartners,genero,edad1,edad2);
					//mostrarSocio
					if(socio==null){
						System.out.println("No existe un socio que cumpla las especificaciones");
					}else{
						System.out.println("El primer socio es: "+socio);
					}
				break;
				
			}
			do{
				menuPrincipal();
				opcion=teclado.nextInt();
			}while(opcion<0 || opcion>5);
		}
	}catch(PartnerNotValidException e){
		System.out.println(e);
	}		
	}
}

