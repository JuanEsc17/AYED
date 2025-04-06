package tp1.ej7;

import java.util.ArrayList;

public class SumarRecursivo {
	
	public static int sumarLista(ArrayList<Integer> l) {
		return sumarRecursivo(l,l.size()-1);
	}
	
	public static int sumarRecursivo(ArrayList<Integer> l, int indice) {
		if(indice<0) {
			return 0;
		}
		return l.get(indice)+sumarRecursivo(l,indice-1);
	}

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(100);
		l.add(150);
		l.add(50);
		System.out.println(sumarLista(l));
	}
}
