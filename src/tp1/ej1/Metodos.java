package tp1.ej1;

public class Metodos {
	
	public static void contarFor(int a, int b) {
		for(int i=a; i<=b;i++)
			System.out.println(i);
	}
	
	public static void contarWhile(int a, int b) {
		while(a<=b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void contarRecursivo(int a, int b) {
		if (a<=b) {
			System.out.println(a);
			contarRecursivo(a+1,b);
		}
	}
}
