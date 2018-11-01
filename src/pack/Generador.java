package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Generador {

	private int n;// cant nodos
	private int grado;
	private int gradomaximo;
	private int gradominimo;
	protected MatrizSimetrica m;

	public Generador(int n) {
		super();
		this.n = n;
		this.m = new MatrizSimetrica(n);
	}

	public int contarAristasTotal() throws Exception {
		int c = 0;
		for (int i = 0; i < this.n; i++) {
			c = contarAristas(i);
		}
		return c;
	}

	public int contarAristas(int n) throws Exception {
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (m.get(n, i)) {
				c++;
			}	
		}
		return c;
	}
	
	public int buscarGradoMaximo() throws Exception {
		int c = 0, maximo=0; 
		for (int i = 0; i < this.n; i++) {
			c = contarAristas(i);
			if(maximo<c){
				maximo=c;
			}
		}
		return maximo;

	}
	
	public int buscarGradoMinimo() throws Exception {
		int c = contarAristas(0), minimo=0; 
		for (int i = 1; i < this.n; i++) {
			c = contarAristas(i);
			if(minimo>c){
				minimo=c;
			}
		}
		
		return minimo;
	}
	
	
	
	public int AristaMax(){
		
		return (this.n*(this.n-1))/2;
	}
	public int getAd() throws Exception {
		
		return (int) contarAristasTotal()/AristaMax();
	}
	
	public void generarArchivo() throws Exception{
		PrintWriter arch = new PrintWriter(new File("grafo.in"));
		arch.print(this.n);
		arch.print("%"+getAd());
		arch.print(buscarGradoMaximo());
		arch.print(buscarGradoMinimo());
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if(m.get(i, j))
					arch.println(""+i+" "+j);
			}
		}
		arch.close();
	}
	
	/*public void generadorAProbArista(){
		
	}
	public void generarConProb(double p){
		
	}
	public void generarConPorcAdy(double p){
		
	}//generar con regulares,con regulares con grado, etc.
	//contar cantidad de aristas (para escribir el archivo)
	public int cant_aristas(MatrizSimetrica m){
		int cant=0,i=0,j=0;
		for(i=0; i<m.size();i++){
			for(j=0;j<m.
		}
	}
	//cant aristas/n porcentaje ady
	//imprimir en archivo
	//todos los metodos manejan la misma matriz y difieren en la forma en la que la generan
	 * */
	 
}
