package examen2;
/*
 * clase gestora de Partner
 * 
 * Por desgracia, no me ha dado tiempo a probar los métodos, lo siento.
 */

	/* Interfaz
	 * Cabecera:
	 * Proceso:
	 * Entradas:
	 * Precondiciones:
	 * Salidas:
	 * Entradas/Salidas:
	 * Postcondiciones:
	 */
public class Partners {
	
	/* Interfaz
	 * Cabecera:public double salarioMedioEntreEdades(Partner[] array,int edad1,int edad2)
	 * Proceso:Método que calcula el salario medio de un array de Partners comprendido entre dos edades
	 * Entradas:un array de Partner
	 * 			2 edades
	 * Precondiciones:edades mayores que 18
	 * Salidas:un real representando dicha media
	 * Entradas/Salidas:Nada
	 * Postcondiciones:media asociada al nombre
	 */
	/*public double salarioMedioEntreEdades(Partner[] array,int edad1,int edad2){
		System.out.println("En cosntrucción");
		return -1;
	}*/
	
	public double salarioMedioEntreEdades(Partner[] array,int edad1,int edad2){
		int i,contador=0;
		double salario=0;
		for(i=0;i<array.length;i++){
			if(array[i].getAge()>=edad1 && array[i].getAge()<=edad2){
				salario=salario+array[i].getSalary();
				contador=contador+1;
			}
		}
		if(contador!=0){
			salario=salario/contador;
		}
		return salario;
	}
	
	/* Interfaz
	 * Cabecera:public void muestraDatosGénero(char genero);
	 * Proceso:método que nos muestra los datos de mujeres/hombres dependiendo del caracter
	 * Entradas:1 caracter
	 * 			1array de Partner
	 * Precondiciones:M para hombres F para mujeres 
	 * Salidas:nada,pinta en pantalla
	 * Entradas/Salidas:Nada
	 * Postcondiciones:Pintará en pantalla todos los datos de dicho género
	 */
	public void muestraDatosGenero(Partner[] array,char genero){
		System.out.println("Encendiendo impresora...");
	}
	
	/* Interfaz
	 * Cabecera:public int partnersDeportes(Sports sport)
	 * Proceso:Muestra todos los partners que hacen un deporte
	 * Entradas:Un deporte tipo Sports
	 * 			1 array de APrtner
	 * Precondiciones:Ninguna
	 * Salidas:Un entero
	 * Entradas/Salidas:Ninguna
	 * Postcondiciones:Entero asociado al nombre
	 */
	
	/*public int partnersDeportes(Partner[] array,Sports sport){
		System.out.println("Somos de letras, lo sentimos");
		return -1;
	}*/
	
	public int partnersDeportes(Partner[] array,Sports sport){
		int i,contador=0;
		for(i=0;i<array.length;i++){
			if(array[i].getSport()==sport){
				contador=contador+1;
			}
		}
		return contador;
	}
	
	/* Interfaz
	 * Cabecera:public double porcentajePartnersDeportes(Sports sport)
	 * Proceso:Muestra el porcentaje de PArtner que juegan a dicho deporte
	 * Entradas:Un deporte tipo Sports
	 * 			1 array de Partner
	 * Precondiciones:ninguna
	 * Salidas:Un número
	 * Entradas/Salidas:Ninguna
	 * Postcondiciones:Salida asociada al nombre, será un número entre 0 y 100
	 */
	 
	 public double porcentajePartnersDeportes(Partner[] array,Sports sport){
		 System.out.println("Calculadora rota, vuelva en otro momento");
		 return -1;
	 }
	 
	 /* Interfaz
	 * Cabecera:public Partner buscaPartnerGeneroEdad(Partner[] array,char genero,int edadMenor,int edadMayor)
	 * Proceso:Método que nos devuelve el primer elemento del array de Partner que sea del género que pasamos por parámetro
	 * 		   y que esté comprendida entre ambas edades(inclusives)
	 * Entradas:un array de Partner
	 * 			un carácter para el género
	 * 			dos enteros para las dos edades
	 * Precondiciones:genero igual a M o F(male/Female) 
	 * 				  edad1 menor que edad2 (Para aligerar la codificación) 
	 * Salidas:1 Partner
	 * Entradas/Salidas:Ninguna
	 * Postcondiciones:Partner asociado al nombre,nos devolverá null si no ha encontrado al partner;
	 */
	 
	 /*public Partner buscaPartnerGeneroEdad(Partner[] array,char genero,int edadMenor,int edadMayor){
		 System.out.println("Wanted!!");
		 return null;
	 }*/
	 public Partner buscaPartnerGeneroEdad(Partner[] array,char genero,int edadMenor,int edadMayor){
		 Partner resultado=null;
		 int i;
		 boolean encontrado=false;
		 for(i=0;i<array.length && !encontrado;i++){
			 if(genero==array[i].getGender() && edadMenor<=array[i].getAge() && edadMayor>=array[i].getAge()){
				 encontrado=true;
				 resultado=array[i];
			 }
		 }
		 return resultado;
	 }
}

