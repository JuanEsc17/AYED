package tp2.ej6;

import tp2.ej1.BinaryTree;

public class Transformacion {
	
	BinaryTree<Integer> arbol;
	
	public Transformacion(BinaryTree<Integer> ab) {
		this.arbol = ab;
	}
	
	public BinaryTree<Integer> getArbol(){
		return arbol;
	}
	
	private BinaryTree<Integer> suma() {
		suma(arbol);
		return arbol;
	}
	
	private int suma(BinaryTree<Integer> ab) {
		int sum = 0;
		if(arbol.isLeaf()) {
			sum = arbol.getData();
			arbol.setData(0);
			return sum;
		}
		if(arbol.hasLeftChild()) {
			sum+= suma(arbol.getLeftChild());
		}
		if(arbol.hasRightChild()) {
			sum+=suma(arbol.getRightChild());
		}
		int actual = arbol.getData();
		arbol.setData(0);
		return actual + sum;
	}
	
	public class Main {
	    public static void main(String[] args) {
	        System.out.println("Iniciando prueba de transformación del árbol...");

	        // Crear el árbol binario
	        BinaryTree<Integer> arbol = new BinaryTree<>(4);
	        BinaryTree<Integer> nodoIzq = new BinaryTree<>(2);
	        BinaryTree<Integer> nodoDer = new BinaryTree<>(6);

	        nodoIzq.addLeftChild(new BinaryTree<>(1));
	        nodoIzq.addRightChild(new BinaryTree<>(3));

	        nodoDer.addLeftChild(new BinaryTree<>(5));
	        nodoDer.addRightChild(new BinaryTree<>(8));

	        arbol.addLeftChild(nodoIzq);
	        arbol.addRightChild(nodoDer);

	        // Mostrar árbol original
	        arbol.imprimirArbol();

	        // Transformar el árbol
	        Transformacion transformador = new Transformacion(arbol);
	        transformador.suma();

	        // Mostrar árbol transformado
	        System.out.println("\nÁrbol tras aplicar la transformación:");
	        transformador.getArbol().imprimirArbol();
	    }
	}

}
