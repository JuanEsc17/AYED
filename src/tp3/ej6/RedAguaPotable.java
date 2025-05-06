package tp3.ej6;

import java.util.List;

import tp3.ej1.GeneralTree;

public class RedAguaPotable{
	
	private GeneralTree<Integer> red;
	
	public RedAguaPotable(GeneralTree<Integer> red) {
		this.red = red;
	}
	
	public double minimoCaudal(double caudal) {
		if (red.isEmpty() || red == null) return 0;
		return calcularMinimoCaudal(red, caudal);
	}

	private double calcularMinimoCaudal(GeneralTree<Integer> nodo, double caudal) {
		if(nodo.isLeaf()) return caudal;
		
		List<GeneralTree<Integer>> hijos = nodo.getChildren();
		double nuevoCaudal = caudal / hijos.size();
		double min = Double.MAX_VALUE;
		
		for(GeneralTree<Integer> hijo: hijos) {
			double caudalHijo = calcularMinimoCaudal(hijo, nuevoCaudal);
			min = Math.min(min, caudalHijo);
		}
		return min;
	}
} 
