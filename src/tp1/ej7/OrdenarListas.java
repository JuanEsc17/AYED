package tp1.ej7;

import java.util.ArrayList;

public class OrdenarListas {

	public static ArrayList<Integer> ordenarListas (ArrayList<Integer> l1, ArrayList<Integer> l2){
		ArrayList<Integer> l = new ArrayList<>();
		
		int indice1 = 0;
		int indice2 = 0;
		
		while (indice1 < l1.size() && indice2 < l2.size()) {
			if(l1.get(indice1)<l2.get(indice2)) {
				l.add(l1.get(indice1));
				indice1++;
			}
			else {
				l.add(l2.get(indice2));
				indice2++;
			}
		}
		
		while(indice1 < l1.size()) {
			l.add(l1.get(indice1));
			indice1++;
		}
		
		while(indice2 < l2.size()) {
			l.add(l2.get(indice2));
			indice2++;
		}
		
		return l;
	}

	public static void main (String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(7);
		l1.add(16);
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(4);
		l2.add(15);
		
		for (int e : ordenarListas(l1,l2)) {
			System.out.println(e);
		}
	}
	
}
