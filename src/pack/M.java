package pack;

public class M {

	public static void main(String[] args) throws Exception {
		GeneradorAProbaAristas gen=new GeneradorAProbaAristas(5,0.5);
		
		gen.generarArchivo();
	}

}
