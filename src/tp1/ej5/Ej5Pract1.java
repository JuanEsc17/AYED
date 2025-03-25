package tp1.ej5;

public class Ej5Pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglo1 = {5,9,3,10};
		int[] arreglo2 = {33,1,4,3};
		int[] arreglo3 = {1,99,1000,3};
		Datos d = new Datos();
		
		System.out.println(Calcular.incisoA(arreglo1).toString());
		Calcular.incisoB(arreglo2, d);
		System.out.println(d.toString());
		Calcular.incisoC(arreglo3);
		System.out.println(Calcular.getDatos().toString());
	}

}
