package tp1.ej2;

public class Metodos {
	
	public static int[] devolverArreglo(int n) {
		int[] arreglo = new int[n];
		for(int i=0;i<=5;i++) {
			arreglo[i] = (i+1)*5;
		}
		return arreglo;
	}

}
