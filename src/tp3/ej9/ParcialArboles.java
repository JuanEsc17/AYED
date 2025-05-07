package tp3.ej9;

import tp1.ej8.Queue;
import tp3.ej1.GeneralTree;

public class ParcialArboles {
	
	public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
		if(arbol.isEmpty() || arbol == null) return false;
		Queue<GeneralTree<Integer>> cola = new Queue<>();
		cola.enqueue(arbol);
		boolean seleccion = false;
		while(!cola.isEmpty()) {
			int nodos = cola.size();
			for(int i = 0; i < nodos; i++) {
				GeneralTree<Integer> act = cola.dequeue();
				int min = Integer.MAX_VALUE;
				for(GeneralTree<Integer> hijo: act.getChildren()) {
					cola.enqueue(hijo);
					min = Math.min(min, hijo.getData());
					
				}
				if(act.getData() != min) return false;
			}
		}
		return true;
	}
}
