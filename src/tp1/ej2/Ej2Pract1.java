package tp1.ej2;
import java.util.Scanner;

public class Ej2Pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		int[] arreglo = Metodos.devolverArreglo(num);
		for (int i = 0; i<num; i++) {
			System.out.println(arreglo[i]);
		}
	}

}
