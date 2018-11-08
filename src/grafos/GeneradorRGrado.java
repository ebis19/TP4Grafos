package grafos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeneradorRGrado {

	public static void GeneradorRGrado1(int n,int grado) throws Exception {
		
		int nodo1;
		int nodo2;
		int cAristas = 0;
		int cAristasMax = (n*(n-1))/2;
		int gAct = 2;
		ArrayList<Arista> array = new ArrayList<Arista>();
		
		int i,j;
		if(n%2!=0 && grado%2!=0)
			throw new Exception("No puede ser N impar y Grado impar");
		if(n <= grado) {
			System.out.println("El grado no puede ser mayor o igual a la cantidad de nodos");
			return;
		}
		
		if(grado%2 != 0) {
		for(i = 0 ; i< n/2; i++) {
			nodo1 = i;
			nodo2 = i + n/2;
		if(nodo1 < nodo2) 
			array.add(new Arista(nodo1,nodo2));
		else
			array.add(new Arista(nodo2,nodo1));
		
		cAristas++;
			
		}
		
		if(grado > 1) {
			while(gAct <= grado) {
			int	salto = gAct /2;
			j = 0;
			for(i = 0; i<n; i++) {
			if(i+salto <n) {
				nodo1 = i;
				nodo2 = i+salto;
			if(nodo1 < nodo2) 
				array.add(new Arista(nodo1,nodo2));
			
			else
				array.add(new Arista(nodo2,nodo1));
			
			}else {
				if(i < j)
					array.add(new Arista(i,j ));
				else
					array.add(new Arista(j,i));
				j++;
			}
			cAristas ++;
			}
			grado+=2;
		}
			double adyacencia = (double) cAristas / cAristasMax;
			System.out.println("entre");
//			generarArchivo(array, grado, n, adyacencia);
			
//		if(grado > n-1)
//			throw new Exception("El grado no puede ser Mayor a N-1 ");
//		for (i=0; i < n-grado; i++) {
//			j=1;
//			while(super.contarAristas(i)<grado){
//				m.set(i,j+i,true);
//				System.out.println(m.get(i,j+i));
//				j++;
//			}
		}
	}

}
	public static void generarArchivo(ArrayList<Arista> s1, int grado, int cantNodos, double adyacencia) throws Exception {
	PrintWriter arch = new PrintWriter(new File("grafo.in"));
	System.out.println("entre");
	arch.print(cantNodos);
	arch.print(" %"+adyacencia*100);
	arch.print(" "+grado);
	arch.println(" "+grado);
	for (int i = 0; i < cantNodos; i++) {
		arch.println(""+s1.get(i).getNodo1()+" "+s1.get(i).getNodo2());
		}
	System.out.println("entre");
	arch.close();
	}
	public static void main(String[] args) throws Exception {
		GeneradorRGrado1(4,3);
	}
}
