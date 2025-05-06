package tp3.ej1;

import java.util.List;

import tp1.ej8.Queue;

public class GeneralTree<T> {

	T data;
	List<GeneralTree<T>> children;
	
	public GeneralTree(){
		
	}
	
	public GeneralTree(T dato) {
		this.data = dato;
	}
	
	public GeneralTree(T dato, List<GeneralTree<T>> children) {
		this.data = dato;
		this.children = children;
	}
	
	public T getData() {
		return data;
	}
	
	public List<GeneralTree<T>> getChildren(){
		return children;
	}
	
	public void addChild(GeneralTree<T> child) {
		children.add(child);
	}
	
	public void removeChild(GeneralTree<T> child) {
		if(this.hasChildren())
			children.remove(child);
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return data == null && !this.hasChildren();
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public int altura() {
		return (!this.isEmpty()) ? altura2() : -1;
	}
	
	private int altura2() {
		if(this.isLeaf()) return 0;
		else {
			int altMax = -1;
			List<GeneralTree<T>> children = this.getChildren();
			for(GeneralTree<T> child: children) {
				altMax = Math.max(altMax, child.altura2());
			}
			return altMax + 1;
		}
	}
	
	public int nivel(T dato) {
		return (!this.isEmpty()) ? nivel2(dato) : -1;
	}
	
	public int nivel2(T dato) {
		int cont = 0;
		int act;
		GeneralTree<T> aux;
		Queue<GeneralTree<T>> cola = new Queue<>();
		cola.enqueue(this);
		while(!cola.isEmpty()) {
			act = cola.size();
			for(int i = 0; i < act; i++) {
				aux = cola.dequeue();
				if(aux.getData().equals(dato)) {
					return cont;
				}
				else {
					for(GeneralTree<T> child : aux.getChildren()) {
						cola.enqueue(child);
					}
				}
			}
			cont++;
		}
		return -1;
	}
	
	public int ancho() {
	    if (this.isEmpty()) return 0;

	    Queue<GeneralTree<T>> cola = new Queue<>();
	    cola.enqueue(this);
	    int maxAncho = 0;

	    while (!cola.isEmpty()) {
	        int nivelActual = cola.size(); // cantidad de nodos en este nivel
	        maxAncho = Math.max(maxAncho, nivelActual); // actualiza el máximo

	        // procesamos todos los nodos del nivel actual
	        for (int i = 0; i < nivelActual; i++) {
	            GeneralTree<T> actual = cola.dequeue();

	            // encolamos a todos los hijos
	            for (GeneralTree<T> hijo : actual.getChildren()) {
	                cola.enqueue(hijo);
	            }
	        }
	    }

	    return maxAncho;
	}

	public boolean esAncestro(T a, T b) {
		GeneralTree<T> nodoA = buscar(this,a);
		if (nodoA == null) return false;
		return contiene(nodoA,b);
	}

	private GeneralTree<T> buscar(GeneralTree<T> arbol, T a) {
		if(arbol.getData().equals(a)) return arbol;
		for (GeneralTree<T> hijo: arbol.getChildren()) {
			GeneralTree<T> resultado = buscar(hijo,a);
			if(resultado != null) return resultado;
		}
		return null;
	}
	
	private boolean contiene(GeneralTree<T> nodo, T b) {
	if(nodo.getData().equals(b)) return true;
	for(GeneralTree<T> hijo: nodo.getChildren()) {
		if(contiene(hijo,b)) return true;
	}
	return false;
			
	}
}
