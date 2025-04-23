package tp2.ej7;

import tp2.ej1.BinaryTree;

public class ParcialArboles {

	private BinaryTree<Integer> arbol;
	
	public ParcialArboles(BinaryTree<Integer> a) {
		this.arbol=a;
	}
	
	public boolean isLeftTree(int num) {
		BinaryTree<Integer> aux = esta(arbol,num);
		return (!aux.isEmpty()) ? isLeftTree(aux) : false;
	}

	public BinaryTree<Integer> esta (BinaryTree<Integer> arb, int num){
		if(arb.getData()==num) return arb;
		BinaryTree<Integer> aux = new BinaryTree<>();
		if(arb.hasLeftChild()) aux = esta(arb.getLeftChild(),num);
		if(arb.hasRightChild()) aux = esta(arb.getRightChild(),num);
		return aux;
	}
	
	public boolean isLeftTree(BinaryTree<Integer> arb) {
		int contLeft = -1;
		int contRight = -1;
		if(arb.hasLeftChild()) contLeft = cuentoUnico(arb.getLeftChild());
		if(arb.hasRightChild()) contRight = cuentoUnico(arb.getRightChild());
		return contLeft > contRight;
	}
	
	public int cuentoUnico(BinaryTree<Integer> arb) {
		int cant = 0;
		if(arb.hasLeftChild()) cant += cuentoUnico(arb.getLeftChild());
		if(arb.hasRightChild()) cant += cuentoUnico(arb.getRightChild());
		if((arb.hasLeftChild() && !arb.hasRightChild()) || (!arb.hasLeftChild() && arb.hasRightChild())) cant++;
		return cant;
	}
	
	public static void main (String[]args) {
		System.out.println("Saque este test de otro repositorio :)");
		System.out.println("EJ 7");
	        
        BinaryTree<Integer> ab = new BinaryTree<Integer>(2);
        ab.addLeftChild(new BinaryTree<Integer>(7));
        ab.addRightChild(new BinaryTree<Integer>(-5));
        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(23));
        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(6));
        ab.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(-3));
        ab.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(55));
        ab.getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(11));
	    ab.getRightChild().addLeftChild(new BinaryTree<Integer>(19));
        ab.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(4));
        ab.getRightChild().getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(18));
	        
        ParcialArboles parcialArb = new ParcialArboles(ab);
        System.out.println("Resultado=" + parcialArb.isLeftTree(7));
        System.out.println("Resultado=" + parcialArb.isLeftTree(2));
        System.out.println("Resultado=" + parcialArb.isLeftTree(-5));
        System.out.println("Resultado=" + parcialArb.isLeftTree(19));
        System.out.println("Resultado=" + parcialArb.isLeftTree(-3));
    }
}


