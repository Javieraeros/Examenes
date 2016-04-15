package examen2;
/* ********
 * Interfaz
 * ********
 * Consultores:
 * public int getNumPartner();
 * public String getSurnameName();
 * public double getSalary();
 * public int getAge();
 * public char getGender();
 * public Sports getSport();
 * public double getRelevance();
 * public double getRelevanceValue();
 * 
 * Modificadores:
 * public void setSalary(double salary)throws PartnerNotValidException;
 * public void setAge(int age)throws PartnerNotValidException;
 * public void setSport(Sports sport);
 * public void setRelevanceValue(double Value);
 * 
 * Métodos añadidos:
 * 
 * 
 * Métodos Heredados:
 * public boolean equals(object o);
 * public Partner clone();
 * public int compareTo(patner p);
 * public String toString();
 * public int hashCode();
 * 
 *  
 */

import java.lang.annotation.*;
public class Partner implements Cloneable,Comparable<Partner> {
	//Atributos
	private int numPartner=0;
	private static int incremento=1;
	private String surnameName;
	private double salary;
	private int age;
	private char gender;
	private Sports sport;
	private static double relevanceValue=0.25;
	
	//Constructores
	public Partner(){
		this.numPartner+=incremento;
		this.incremento++;
		this.surnameName="surnameName"+this.numPartner;
		this.salary=100.00;
		this.age=18;
		this.gender='F';
		this.sport=Sports.RUGBY;
	}
	
	public Partner(String surnameName,double salary,int age,char gender,Sports sport)throws PartnerNotValidException{
		if(gender!='M' && gender!='F'){
			throw new PartnerNotValidException("Error, introduzca M o F");
		}else{
			if(salary<0){
				throw new PartnerNotValidException("Error, el salario debe ser mayor que 0");
			}else{
				if(age<18){
					throw new PartnerNotValidException("Error, la edad debe ser mayor que 18");
				}else{
					this.numPartner+=incremento;
					this.incremento++;
					this.surnameName=surnameName;
					this.salary=salary;
					this.age=age;
					this.gender=gender;
					this.sport=sport;
				}
			}
		}
	}
	
	public Partner(Partner aCopiar){
		this.numPartner+=incremento;
		this.incremento++;
		this.surnameName=aCopiar.getSurnameName();
		this.salary=aCopiar.getSalary();
		this.age=aCopiar.getAge();
		this.gender=aCopiar.getGender();
		this.sport=aCopiar.getSport();
	}
	
	//Consultores
	public int getNumPartner(){
		return this.numPartner;
	}
	
	public String getSurnameName(){
		return this.surnameName;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public char getGender(){
		return this.gender;
	}
	
	public Sports getSport(){
		return this.sport;
	}
	
	
	public double getRelevance(){
		return salary*relevanceValue;
	}
	
	public double getRelevanceValue(){
		return this.relevanceValue;
	}
	
	
	
	//Modificadores
	public void setSalary(double salary)throws PartnerNotValidException{
		if(salary<0){
			throw new PartnerNotValidException("Error, el salario debe ser mayor que 0");
		}else{
			this.salary=salary;
		}
	}
	public void setAge(int age)throws PartnerNotValidException{
		if(age<18){
			throw new PartnerNotValidException("Error,la edad debe ser mayor o igual que 18");
		}else{
			this.age=age;
		}
	}
	public void setSport(Sports sport){
		this.sport=sport;
	}
	public void setRelevanceValue(double value){
		//Puesto que desconocemos las posibles restricciones de dicho valor, no le añado ningún tipo de excepción
		this.relevanceValue=value;
	}
	
	//Métodos Heredados
	
	/* Interfaz
	 * Cabecera: public boolean equals(object o)
	 * Proceso:Método que compara si dos objetos tipo Partners son iguales
	 * Entradas:1 Objeto
	 * Precondiciones:Ninguna
	 * Salidas:1 boolean
	 * Entradas/Salidas:Nada
	 * Postcondiciones:Devolverá true si el numPartner del Partner que llama al método y el numPartner del objeto por parámetro 
	 * 					es igual.False en caso contrario.
	 * 					Añadido=Unicamente devolverá true si pasamos por parámetro el mismo objeto que llama al método
	 */
	
	@Override  //sobreescrito realmente
	public boolean equals(Object o){
		boolean resultado=false; //Necesaria esta inicialización por si el objeto que pasamos es nulo o no es de tipo Partner
		if(o!=null && o instanceof Partner){
			Partner p=(Partner) o;
			resultado=this.numPartner==p.getNumPartner();
		}
		return resultado;
	}
	
	
	@Override
	public Partner clone(){
		Partner clonado=new Partner();
		try{
			clonado=(Partner) super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println("Error, objeto no clonado");
		}
		return clonado;
	}
	
	/* Interfaz
	 * Cabecera:public int compareTo(Partner comparar)
	 * Proceso:Compara dos objetos de tipo Partner
	 * Entradas:1 Partner
	 * Precondiciones:Ninguna
	 * Salidas:un entero
	 * Entradas/Salidas:Nada
	 * Postcondiciones:0 si ambos tienen el mismo numPartner, -1 si el partner que llama al método tiene menor numPartner que 
	 * el que pasamos por parámentro, 1 en caso contrario
	 */
	
	@Override
	public int compareTo(Partner comparar){
		int resultado=1;
		if(this.numPartner==comparar.getNumPartner()){
			resultado=0;
		}else{
			if(this.numPartner<comparar.getNumPartner()){
				resultado=-1;
			}
		}
		return resultado;
	}
	
	@Override
	public String toString(){
		return (numPartner+","+surnameName+","+getRelevance());
	}
	
	@Override
	public int hashCode(){
		return numPartner+surnameName.length();
	}
}

