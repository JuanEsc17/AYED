package tp1.ej7;

import java.util.ArrayList;

public class ListaInvertida {
	public static void invertirLista(ArrayList<Integer> l) {
		invertirRecursivo(l,0,l.size()-1);
	}
	
	public static void invertirRecursivo(ArrayList<Integer> l, int inicio, int fin) {
		if (inicio<fin) {
			int aux = l.get(inicio);
			l.set(inicio, l.get(fin));
			l.set(fin, aux);
			invertirRecursivo(l,inicio+1,fin-1);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println("Lista original");
		for (int e : l) {
			System.out.println(e);
		}
		System.out.println("--------------------");
		System.out.println("Lista invertida");
		invertirLista(l);
		for (int e : l) {
			System.out.println(e);
		}
	}
}
