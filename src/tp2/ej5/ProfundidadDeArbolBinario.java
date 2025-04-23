package tp2.ej5;

import tp2.ej1.BinaryTree;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> arbol;
	
	public ProfundidadDeArbolBinario(BinaryTree<Integer> arbol){
		this.arbol = arbol;
	}

	public int sumaElementosProfundidad(int p) {
		return (!arbol.isEmpty()) ? sumaElementosProfundidad(p,arbol,0):0;
	}
	
	private int sumaElementosProfundidad(int p, BinaryTree<Integer> a, int na) {
		if(p == na) {
			return a.getData();
		} else {
			int suma = 0;
			if (a.hasLeftChild()) suma+= sumaElementosProfundidad(p,a.getLeftChild(), na+1);
			if(a.hasRightChild()) suma+= sumaElementosProfundidad(p,a.getRightChild(),na+1);
			return suma;
		}
	}

}
