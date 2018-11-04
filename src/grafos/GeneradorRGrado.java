package grafos;

public class GeneradorRGrado extends Generador {

	public GeneradorRGrado(int n,int grado) throws Exception {
		super(n);
		int i,j;
		if(n%2!=0 && grado%2!=0)
			throw new Exception("No puede ser N impar y Grado impar");
		if(grado > n-1)
			throw new Exception("El grado no puede ser Mayor a N-1 ");
		for (i=0; i < n-grado; i++) {
			j=1;
			while(super.contarAristas(i)<grado){
				m.set(i,j+i,true);
				System.out.println(m.get(i,j+i));
				j++;
			}
		}
	}

}
