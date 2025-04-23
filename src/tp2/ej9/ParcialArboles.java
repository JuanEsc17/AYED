package tp2.ej9;

import tp2.ej1.BinaryTree;

public class ParcialArboles {
	
	public BinaryTree<Nodo> sumAndDif(BinaryTree<Integer> arbol){
		BinaryTree<Nodo> arb = new BinaryTree<>();
		if(!arbol.isEmpty())
			sumAndDif(arbol,arb,0,0);
		return arb;
	}
	
	public void sumAndDif(BinaryTree<Integer> arbol, BinaryTree<Nodo> arb, int suma, int datoPadre){
		int datoActual = arbol.getData();
		Nodo aux = new Nodo(datoActual+suma, datoActual-datoPadre);
		if(arbol.hasLeftChild()) {
			arb.addLeftChild(new BinaryTree<Nodo>(aux));
			sumAndDif(arbol.getLeftChild(),arb.getLeftChild(),suma+datoActual,datoActual);
		}
		if(arbol.hasRightChild()) {
			arb.addRightChild(new BinaryTree<Nodo>(aux));
			sumAndDif(arbol.getRightChild(),arb.getRightChild(),suma+datoActual,datoActual);
		}
	}
}
