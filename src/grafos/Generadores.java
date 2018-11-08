package grafos;

import java.util.ArrayList;

public class Generadores {
	
public static void GeneradorRGrado(int n,int grado) throws Exception {
		
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
					array.add(new Arista(j,i ));
				j++;
			}
			cAristas ++;
			}
			gAct+=2;
			
		}

		
		}
		double adyacencia = (double) cAristas / cAristasMax;
		System.out.println("CANTIDAD DE NODOS"+" "+n+" "+"GRADO"+" "+grado+" "+ "ADYACENCIA"+" "+String.format("%.2f", adyacencia*100));

	}


public static void main(String[] args) throws Exception {
	GeneradorRGrado(10,8);
}
}
