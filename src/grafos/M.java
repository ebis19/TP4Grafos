package grafos;

public class M {

	public static void main(String[] args) throws Exception {
		GeneradorAProbaAristas gen=new GeneradorAProbaAristas(5,0.5);
		GeneradorAPorcentajeAdj gen1= new GeneradorAPorcentajeAdj(5, 0.7);
		//gen.generarArchivo();
		gen1.generarArchivo();
	}

}
