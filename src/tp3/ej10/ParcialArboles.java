package tp3.ej10;

import java.util.ArrayList;
import java.util.List;

import tp3.ej1.GeneralTree;

public class ParcialArboles {
	
	private static List<Integer> mejorCamino = new ArrayList<>();
	private static int maxValor = Integer.MIN_VALUE;
	
	public static List<Integer> resolver(GeneralTree<Integer> arbol){
		if(arbol == null || !arbol.isEmpty()) {
			return new ArrayList<Integer>();
		}
		List<Integer> mejorCamino = new ArrayList<>();
		
		List<Integer> caminoActual = new ArrayList<>();
		busco(arbol, 0, 0, caminoActual);
		return mejorCamino;
	}
	
	private static void busco(GeneralTree<Integer> nodo, int nivel, int suma, List<Integer> actual) {
		if(nodo.getData() == 1) {
			actual.add(1);
			suma += nivel;
		}
		
		if(nodo.isLeaf()) {
			if(suma > maxValor) {
				maxValor = suma;
				mejorCamino = new ArrayList<>(actual); 
			}
		} else {
			for (GeneralTree<Integer> hijo: nodo.getChildren()) {
				busco(hijo, nivel +1, suma, actual);
			}
		}
		if(nodo.getData() == 1) {
			actual.remove(actual.size()-1);
		}
	}
}
