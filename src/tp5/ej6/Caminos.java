package tp5.ej6;

import java.util.LinkedList;
import java.util.List;

import tp5.Edge;
import tp5.Graph;
import tp5.Vertex;

public class Caminos {
	
	private Graph<String> bosque;
	
	public Caminos(Graph<String> grafo) {
		this.bosque = grafo;
	}
	
	public List<List<String>> recorridosMasSeguros(){
		List<List<String>> listaReturn = new LinkedList<>();
		if(this.bosque != null && !this.bosque.isEmpty()) {
			Vertex<String> casaCaperucita = this.bosque.search("Casa Caperucita");
			if(casaCaperucita!=null) {
				recorrido(casaCaperucita, this.bosque, listaReturn, new LinkedList<>(), new boolean[this.bosque.getSize()]);
			}
		}
		return listaReturn;
 	}

	private void recorrido(Vertex<String> lugarAct, Graph<String> grafo, List<List<String>> listaReturn,
			LinkedList caminoActual, boolean[] marca) {
		marca[lugarAct.getPosition()] = true;
		String lugar = lugarAct.getData();
		caminoActual.add(lugar);
		if(lugar.equals("Casa Abuelita")) {
			listaReturn.add(new LinkedList<>(caminoActual));
		}
		else {
			List<Edge<String>> adyacentes = this.bosque.getEdges(lugarAct);
			for(Edge<String> ady: adyacentes) {
				int cantFrutales = ady.getWeight();
				int j = ady.getTarget().getPosition();
				if(!marca[j] && cantFrutales < 5) {
					recorrido(ady.getTarget(), grafo, listaReturn, caminoActual, marca);
				}
			}
		}
		caminoActual.remove(caminoActual.size()-1);
		marca[lugarAct.getPosition()] = false;
	}
}
