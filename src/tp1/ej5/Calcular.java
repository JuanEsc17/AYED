package tp1.ej5;

public class Calcular {
	
	private static Datos d;
	
	public static Datos incisoA(int[] arreglo) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double suma = 0;
		for(int i=0; i<arreglo.length; i++) {
			if (arreglo[i]>max)
				max = arreglo[i];
			if (arreglo[i]<min)
				min = arreglo[i];
			suma+=arreglo[i];
		}
		Datos d = new Datos(min,max,suma/arreglo.length);
		return d;
	}
	
	public static void incisoB(int[] arreglo, Datos d) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double suma = 0;
		for(int i=0; i<arreglo.length; i++) {
			if (arreglo[i]>max)
				max = arreglo[i];
			if (arreglo[i]<min)
				min = arreglo[i];
			suma+=arreglo[i];
		}
		d.setMin(min);
		d.setMax(max);
		d.setPromedio(suma/arreglo.length);
	}
	
	public static void incisoC(int[] arreglo) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double suma = 0;
		for(int i=0; i<arreglo.length; i++) {
			if (arreglo[i]>max)
				max = arreglo[i];
			if (arreglo[i]<min)
				min = arreglo[i];
			suma+=arreglo[i];
		}
		d = new Datos(min,max,suma/arreglo.length);
	}
	
	public static Datos getDatos() {
		return d;
	}
}
