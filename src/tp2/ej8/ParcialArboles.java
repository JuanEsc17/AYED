package tp2.ej8;

import tp2.ej1.BinaryTree;

public class ParcialArboles {
	
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		if(arbol1.isEmpty() || arbol2.isEmpty())
			return arbol1.isEmpty() && arbol2.isEmpty();
		return esPrefijoExtra(arbol1,arbol2);
	}
	
	public boolean esPrefijoExtra(BinaryTree<Integer>arbol1, BinaryTree<Integer>arbol2) {
		if(arbol1.getData()!=arbol2.getData())
			return false;
		boolean aux = true;
		if(arbol1.hasLeftChild())
			if(arbol2.hasLeftChild())
				aux = aux && esPrefijoExtra(arbol1.getLeftChild(), arbol2.getLeftChild());
			else return false;
		if(arbol1.hasRightChild())
			if(arbol2.hasRightChild())
				aux = aux && esPrefijoExtra(arbol1.getRightChild(), arbol2.getRightChild());
			else return false;
		return aux;
	}
	
	public static void main(String[]args) {
		BinaryTree<Integer> a1 = new BinaryTree<Integer>(65);
		a1.addLeftChild(new BinaryTree<Integer>(37));
		a1.addRightChild(new BinaryTree<Integer>(81));
		a1.getLeftChild().addRightChild(new BinaryTree<Integer>(47));
		a1.getRightChild().addLeftChild(new BinaryTree<Integer>(93));
		BinaryTree<Integer> a2 = new BinaryTree<Integer>(65);
		//a2.addLeftChild(new BinaryTree<Integer>(37)); // con este true
		a2.addLeftChild(new BinaryTree<Integer>(36)); // con este false
		a2.addRightChild(new BinaryTree<Integer>(81));
		a2.getLeftChild().addRightChild(new BinaryTree<Integer>(47));
		a2.getLeftChild().addLeftChild(new BinaryTree<Integer>(22));
		a2.getRightChild().addLeftChild(new BinaryTree<Integer>(93));
		ParcialArboles par=new ParcialArboles();
		System.out.println("el resultado del a1 y a2 es "+ par.esPrefijo(a1,a2));

	}
}
