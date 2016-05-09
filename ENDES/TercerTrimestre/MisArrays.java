//package es.iesnervion.entornos;
package TercerTrimestre;
public class MisArrays {
    private int[] a;
 
     
    public MisArrays(int a,int b,int c,int d,int e,int f,int g,int h) {
        this.a = new int[]{a,b,c,d,e,f,g,h};    
    }
     
         
     
        public int[] getA() {
        return a;
    }
 
 
 
    public void setA(int[] a) {
        this.a = a;
    }
 
 
 
    public int getIndiceDeDistanciaMinima() {
        int i=0,aux=0;
           
        for (i = 1; i < a.length - 1; i++) {
            if ( a[aux] - a[aux + 1] < a[i] - a[i + 1] &&
                 a[aux+1] - a[aux] > a[i+1] - a[i]) {
                aux = i;
            }
        }        
        return i;
    }
    
    
    public int[] restarInverso (int[] f){
    	int n,m;
    	int[] aux = new int[8];
    	m=f.length-2;
    	n=0;
    	for (;m>0 && n<=this.a.length;n++,m--){
    		aux[n]=a[n]-f[m+1];
    	}
    	
    	return aux;
    		
    }
    
    public int getIndiceDeDistanciaMinimaArreglado() {
        int i=0,aux=0;
           
        for (i = 1; i < a.length-1; i++) {
            if ( Math.abs(a[aux] - a[aux + 1]) > Math.abs(a[i] - a[i + 1])) {
                aux = i;
            }
        }        
        return aux;
    }
    
    public int[] restarInversoArreglado (int[] f){
    	int n,m;
    	int[] aux = new int[8];
    	m=f.length-1;
    	n=0;
    	for (;m>=0 && n<=this.a.length;n++,m--){
    		aux[n]=a[n]-f[m];
    	}
    	return aux;
    		
    }
}
