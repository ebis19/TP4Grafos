package grafos;


public class GeneradorAProbaAristas extends Generador {

	public GeneradorAProbaAristas(int n,double d) throws Exception {
		super(n);
		int i,j;
		for (i=0; i < n; i++) {
			for (j = 0; j < i; j++) {
				if(Math.random()<d)
					m.set(i, j,true);
			}
		}
		// TODO Auto-generated constructor stub
	}


	
	

}
