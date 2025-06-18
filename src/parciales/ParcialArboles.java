 package parciales;

import java.util.LinkedList;

import tp1.ej8.Queue;
import tp3.ej1.GeneralTree;

public class ParcialArboles {

	private GeneralTree<Integer> arbol;
	
	public ParcialArboles(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public LinkedList<Integer> nivel(int num){
		Queue<GeneralTree<Integer>> cola = new Queue<>();
		cola.enqueue(arbol);
		LinkedList<Integer> lista = new LinkedList<>();
		boolean cond = true;
		while(!cola.isEmpty()) {
			int nodos = cola.size();
			
			for(int i = 0; i < nodos; i++) {
				GeneralTree<Integer> act = cola.dequeue();
				if (act.getChildren().size() < num) {
	                cond = false; // si uno falla, ya no sirve el nivel
	            }
				lista.add(act.getData());
				
				for(GeneralTree<Integer> hijo: act.getChildren()) {
					cola.enqueue(hijo);
				}
			}
			if(cond) return lista;
			lista.clear();
		}
		return lista;
	}
}
