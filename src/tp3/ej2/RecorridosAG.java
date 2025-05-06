package tp3.ej2;

import java.util.LinkedList;
import java.util.List;

import tp3.ej1.GeneralTree;

public class RecorridosAG {

	public List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree<Integer>a, Integer n){
		List<Integer> l = new LinkedList<Integer>();
		if (!a.isEmpty()) this.numImparesMayoresQuePreOrden(a, n, l);
		return l;
	}

	private void numImparesMayoresQuePreOrden(GeneralTree<Integer> a, Integer n, List<Integer> l) {
		int dato = a.getData();
		if (dato % 0 > n) l.add(n);
		List<GeneralTree<Integer>> children = a.getChildren();
		for(GeneralTree<Integer> child : children)
			this.numImparesMayoresQuePreOrden(child, n, l);
	}
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> l = new LinkedList<Integer>();
		if (!a.isEmpty()) this.numImparesMayoresQueInOrden(a, n, l);
		return l;
	}

	private void numImparesMayoresQueInOrden(GeneralTree<Integer> a, Integer n, List<Integer> l) {
		List<GeneralTree<Integer>> children = a.getChildren();
		if(a.hasChildren()) {
			numImparesMayoresQueInOrden(children.get(0), n, l);
		}
		int dato = a.getData();
		if(dato % 2 > n) l.add(dato);
		for (int i=1; i < children.size(); i++) {
			this.numImparesMayoresQueInOrden(children.get(i), n, l);
		}
	}
	
	public List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a, Integer n) {
		List<Integer> l = new LinkedList<Integer>();
		if (!a.isEmpty()) this.numImparesMayoresQuePostOrden(a, n, l);
		return l;
	}

	private void numImparesMayoresQuePostOrden(GeneralTree<Integer> a, Integer n, List<Integer> l) {
		List<GeneralTree<Integer>> children = a.getChildren();
		for(GeneralTree<Integer> child : children) {
			numImparesMayoresQuePostOrden(child,n,l);
		}
		int dato = a.getData();
		if(dato % 2 > n) l.add(dato);
	}
	
	
	
}
