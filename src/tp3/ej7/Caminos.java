package tp3.ej7;

import java.util.ArrayList;
import java.util.List;

import tp3.ej1.GeneralTree;

public class Caminos {

	private GeneralTree<Integer> arbol;
	
	public Caminos(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public List<Integer> caminoAHojaMasLejana(){
		List<Integer> caminoMasLargo = new ArrayList<>();
		if (!arbol.isEmpty() || arbol != null) {
			List<Integer> caminoActual = new ArrayList<>();
			buscoCamino(arbol, caminoActual, caminoMasLargo);
		}
		return caminoMasLargo;
	}

	private void buscoCamino(GeneralTree<Integer> arbol, List<Integer> caminoActual, List<Integer> caminoMasLargo) {
		caminoActual.add(arbol.getData());
		if (arbol.isLeaf()) {
			if(caminoActual.size() > caminoMasLargo.size()) {
				caminoMasLargo.clear();
				caminoMasLargo.addAll(caminoActual);
			}
		} else {
			for (GeneralTree<Integer> hijo: arbol.getChildren()) {
				buscoCamino(hijo, caminoActual, caminoMasLargo);
			}
		}
		caminoActual.remove(caminoActual.size()-1);
	}
}
