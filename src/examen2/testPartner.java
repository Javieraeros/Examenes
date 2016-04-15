package examen2;
/*
 * Clase de Testeo de Partner
 * 
 */


public class testPartner {
	
	public static void main (String args[]) {
		//Prueba de Constructores y Consultores
		System.out.println("\n\nPrueba de Constructores y Modificadores\n\n");
		Partner javi=new Partner();
		Partner Silvia=new Partner();
		System.out.println(javi.getNumPartner());
		System.out.println(javi.getSurnameName());
		System.out.println(javi.getSalary());
		System.out.println(javi.getAge());
		System.out.println(javi.getGender());
		System.out.println(javi.getSport());
		System.out.println(javi.getRelevance());
		System.out.println(javi.getRelevanceValue());
		try{
		Partner PepeGrillo=new Partner("Pepe Grillo",5000.25,22,'M',Sports.CRICKET);
		System.out.println(PepeGrillo.getNumPartner()+"\nNos da 3 porque hemos creado a otro Partner: Silvia");
		System.out.println(PepeGrillo.getSurnameName());
		System.out.println(PepeGrillo.getSalary());
		System.out.println(PepeGrillo.getAge());
		System.out.println(PepeGrillo.getGender());
		System.out.println(PepeGrillo.getSport());
		System.out.println(PepeGrillo.getRelevance());
		System.out.println(PepeGrillo.getRelevanceValue());
		}catch(PartnerNotValidException e){
			System.out.println(e);
		}
		
		
		//Prueba de Modificadores
		System.out.println("\n\nPrueba de Modificadores\n\n");
		try{
			javi.setSalary(150000.89);
			System.out.println(javi.getSalary());
		}catch(PartnerNotValidException e){
			System.out.println(e);
		}
		
		try{
			javi.setSalary(-1);
			System.out.println(javi.getSalary());
		}catch(PartnerNotValidException e){
			System.out.println(e);
		}
		
		javi.setSport(Sports.TENNIS);
		System.out.println(javi.getSport());
		
		try{
			javi.setAge(15);
			System.out.println(javi.getSalary());
		}catch(PartnerNotValidException e){
			System.out.println(e);
		}
		
		try{
			javi.setAge(21);
			System.out.println(javi.getSalary());
		}catch(PartnerNotValidException e){
			System.out.println(e);
		}
		
		javi.setRelevanceValue(1);
		System.out.println(javi.getRelevanceValue());
		System.out.println("Al cambiar el valor de Relevance en javi, se cambia para todos los objetos de la clase");
		System.out.println("por ser una variable global de la clase, por eso cuando llamamos al valor de Silvia, está cambiado");
		System.out.println(Silvia.getRelevanceValue());
		
		//Métodos Heredados
		System.out.println("\n\nMétodo Equals\n\n");
		System.out.println("Comparamos a javi con Silvia\n"+javi.equals(Silvia)+"\nComparamos a javi consigo mismo\n"+javi.equals(javi));
		System.out.println("\nPrueba clone");
		Partner cloneJavi=javi.clone();
		System.out.println("Javi:"+javi+"\nClone de Javi:"+cloneJavi);
		System.out.println("Prueba de compareTo:\n"+javi.compareTo(Silvia));
		System.out.println("Misma prueba compareTo con elementos cambiado:\n"+Silvia.compareTo(javi));
		System.out.println("Prueba toString\n"+javi);
		System.out.println("Prueba de hashcCode:\n"+javi.hashCode());
		
	}
}

