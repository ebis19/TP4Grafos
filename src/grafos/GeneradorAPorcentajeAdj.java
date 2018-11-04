package grafos;

import grafos.MatrizSimetrica.MatrizSimetricaException;

public class GeneradorAPorcentajeAdj extends Generador {

	public GeneradorAPorcentajeAdj(int n,double pa) throws MatrizSimetricaException {
		super(n);
		int canta=(int) (super.AristaMax()*pa);
		int f=0,c=0;
		for (int i = 0; i < canta; i++) {
			while(f==c || super.m.get(f, c)) {
				f=  (int) ((Math.random() * super.n)) ;
				c=  (int) ((Math.random() * super.n)) ;
			}
			super.m.set(f, c, true);
		}
	}

}
