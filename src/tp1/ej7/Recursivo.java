package tp1.ej7;

import java.util.ArrayList;
import java.util.List;

public class Recursivo {
	
	public static ArrayList<Integer> recursivo(int n){
	ArrayList<Integer> l = new ArrayList<>();
	recursivoA(l,n);
	return l;
	}
	
	private static void recursivoA(ArrayList<Integer> l, int n) {
		l.add(n);
		if (n>1) {
			if (n%2 == 0) {
				recursivoA(l,n/2);
			}
			else recursivoA(l,3*n+1);
		}	
	}

	public static void main(String[] args){
		Recursivo r = new Recursivo();
		List<Integer> l = recursivo(6);
		
		for( int n : l) {
			System.out.println(n);
		}
	}	
}
