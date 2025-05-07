package tp3.ej11;

import tp1.ej8.Queue;
import tp3.ej1.GeneralTree;

public class ParcialArboles {
	
	public static boolean resolver(GeneralTree<Integer> arbol) {
		if(arbol == null || arbol.isEmpty()) return false;
		Queue<GeneralTree<Integer>> cola = new Queue<>();
		cola.enqueue(arbol);
		int nodosAnt = 0;
		int nodosAct = 1;
		while(!cola.isEmpty()) {
			if(nodosAct != nodosAnt) return false;
			for(int i = 0; i < nodosAct; i++) {
				GeneralTree<Integer> actual = cola.dequeue();
				for(GeneralTree<Integer> hijo: actual.getChildren()) {
					cola.enqueue(hijo);
				}
			}
			nodosAnt = nodosAct;
			nodosAct = cola.size();
		}
		return true;
	}
	
}
