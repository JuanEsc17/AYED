package tp2.ej4;

import tp2.ej1.BinaryTree;

public class RedBinariaLlena {

	private BinaryTree<Integer> red;
	
	public RedBinariaLlena(BinaryTree<Integer> red) {
		this.red = red;
	}
	
	public int retardoReenvio() {
		if(!red.isEmpty()) return retardoReenvio(red);
		else
			return 0;
	}
	
	public int retardoReenvio(BinaryTree<Integer> rb) { //RECORRIDO EN PROFUNDIDAD
		int retornoIzq = 0;
		int retornoDer = 0;
		if(rb.hasLeftChild())
			retornoIzq = retardoReenvio(rb.getLeftChild());
		if(rb.hasRightChild())
			retornoDer = retardoReenvio(rb.getRightChild());
		return(Math.max(retornoIzq, retornoDer) + rb.getData());
	}
	
	public static void main(String[] args) {
	    // Creamos un árbol binario con diferentes valores
	    BinaryTree<Integer> ab = new BinaryTree<Integer>(10);
	    ab.addLeftChild(new BinaryTree<Integer>(2));
	    ab.addRightChild(new BinaryTree<Integer>(3));

	    ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(5));
	    ab.getLeftChild().addRightChild(new BinaryTree<Integer>(4));

	    ab.getRightChild().addLeftChild(new BinaryTree<Integer>(9));
	    ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
	    
	    ab.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(7));
	    ab.getLeftChild().getLeftChild().addRightChild(new BinaryTree<Integer>(8));
	    ab.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(5));
	    ab.getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(7));
	    ab.getRightChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(12));
	    ab.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(8));
	    ab.getRightChild().getRightChild().addLeftChild(new BinaryTree<Integer>(2));
	    ab.getRightChild().getRightChild().addRightChild(new BinaryTree<Integer>(1));
	    // Creamos la red a partir del árbol binario completo
	    RedBinariaLlena red = new RedBinariaLlena(ab);

	    // Imprimimos el mayor retardo posible
	    System.out.println("El mayor retardo posible es de: " + red.retardoReenvio() + " segundos");
	}

}
