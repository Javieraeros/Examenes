package TercerTrimestre;

public class Tiempo {
	double semanas;
	double dias;
	double horas;
	
	public Tiempo(double s, double d, double h) {	
		semanas = s;
		dias = d;
		horas = h;
	}
	
	public double getSemanas() {
		return semanas;
	}

	public void setSemanas(double s) {
		semanas = s;
	}

	public double getDias() {
		return dias;
	}

	public void setDias(double d) {
		dias = d;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double h) {
		horas = h;
	}

	public double aDias (){
		double i,j;
		double dias=0;
		for (i=semanas;i>0;i--)
			for (j=7;j>0;j--)
				dias=dias+1;
		for (i=dias;i>0;i--)
			dias=dias+1;
		for (i=horas;i>0;i--)
			dias=dias+(double)1/(double)24;
		return dias;
	}
	
	public double aHoras (){
		double i,j,k;
		double horas=0;
		for (i=semanas;i>0;i--)
			for (j=7;j>0;j--)
				for (k=24;k>0;k--)
					horas=horas+1;
		for (i=dias;i>0;i--)
			for (j=24;j>0;j--)
				horas=horas+1;
		for (i=horas;i>0;i--)
			horas=horas+1;
		return horas;
	}
	
	public double aDiasArreglado (){
		double i,j;
		double aux=0;
		for (i=semanas;i>0;i--)
			for (j=7;j>0;j--)
				aux=aux+1;
		for (i=dias;i>0;i--)
			aux=aux+1;
		for (i=horas;i>0;i--)
			aux=aux+(double)1/(double)24;
		return aux;
	}
	
	public double aHorasArreglado (){
		double i,j,k;
		double aux=0;
		for (i=semanas;i>0;i--)
			for (j=7;j>0;j--)
				for (k=24;k>0;k--)
					aux=aux+1;
		for (i=dias;i>0;i--)
			for (j=24;j>0;j--)
				aux=aux+1;
		for (i=horas;i>0;i--)
			aux=aux+1;
		return aux;
	}
	
}
