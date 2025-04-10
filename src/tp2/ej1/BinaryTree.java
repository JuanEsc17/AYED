package tp2.ej1;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;
	
	public BinaryTree() {
	}
	
	public BinaryTree(T data) {
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public BinaryTree<T> getLeftChild(){
		return leftChild;
	}
	
	public BinaryTree<T> getRightChild(){
		return rightChild;
	}
	
	public void addLeftChild(BinaryTree<T> hijo) {
		leftChild = hijo;
	}
	
	public void addRightChild(BinaryTree<T> hijo) {
		rightChild = hijo;
	}
	
	public void removeLeftChild() {
		leftChild = null;
	}
	
	public void removeRightChild() {
		rightChild = null;
	}
	
	public boolean isEmpty() {
		return (this.isLeaf() && (data == null));
	}
	
	public boolean isLeaf() {
		return !(this.hasRightChild())&&(this.hasLeftChild());
	}
	
	public boolean hasLeftChild() {
		return this.getLeftChild() != null;
	}
	
	public boolean hasRightChild() {
		return this.getRightChild() != null;
	}
	
	public String toString() {
		return this.getData().toString();
	}
	
	//Ejercicio 2
	
	public int contarHojas() {
		int leftLeafs = 0;
		int rightLeafs = 0;
		if (this.isEmpty()) return 0;
		else if(this.isLeaf()) return 1;
		else {
			if (this.hasLeftChild()){
				leftLeafs = this.getLeftChild().contarHojas();
			}
			if (this.hasRightChild()) {
				rightLeafs = this.getRightChild().contarHojas();
			}
			return leftLeafs + rightLeafs;
		}
	}
	
	public BinaryTree<T> espejo(){
		BinaryTree<T> arbolEspejo = new BinaryTree<T>(this.getData());
		if(this.hasLeftChild()) {
			arbolEspejo.addRightChild(this.getLeftChild().espejo());
		}
		if(this.hasRightChild()) {
			arbolEspejo.addLeftChild(this.getRightChild().espejo());
		}
		return arbolEspejo;
	}
	
	public void entreNiveles(int n, int m) {
		if(this.isEmpty() || n < 0 || m < n) return;
		Queue<BinaryTree<T>> cola = new LinkedList();
		cola.add(this);
		int nivelAct = 0;
		while(!cola.isEmpty()) {
			int nodoNivel = cola.size();
			if(nivelAct >= n && nivelAct <= m) {
				for(int i=0; i < nodoNivel; i++) {
					BinaryTree<T> nodo = cola.remove();
					System.out.print(nodo.getData() + " | ");
					if(nodo.hasLeftChild()) cola.add(nodo.getLeftChild());
					if(nodo.hasRightChild()) cola.add(nodo.getRightChild());
				}
			} else {
				for(int i=0; i < nodoNivel; i++) {
					cola.remove();
				}
			}
			nivelAct++;
			System.out.println("");
		}
		
		
	}
	
	public void imprimirArbol() {
        if(this.hasLeftChild()) this.getLeftChild().imprimirArbol();
        System.out.print(this.getData() + " ");
        if(this.hasRightChild()) this.getRightChild().imprimirArbol();
    }
	
	public static void main (String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
		ab.addLeftChild(new BinaryTree<Integer>(2));
		ab.addRightChild(new BinaryTree<Integer>(6));
		ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
		ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
		ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
		ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
		
		System.out.println(ab.contarHojas());
		System.out.println("Arbol original");
		ab.imprimirArbol();
		System.out.println("Arbol espejo");
		BinaryTree<Integer> arbolEspejo = ab.espejo();
		arbolEspejo.imprimirArbol();
		System.out.println("Impresion arbol por niveles n = 0 y m = 1");
		ab.entreNiveles(0, 2);
	}
}
