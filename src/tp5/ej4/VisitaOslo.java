package tp5.ej4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp5.Edge;
import tp5.Graph;
import tp5.Vertex;

public class VisitaOslo {
	
	public VisitaOslo() {
		
	}
	
	public List<String> paseoEnBici(Graph<String> lugares, String destino, int maxTiempo, List<String> lugaresRestringidos){
		List<String> camino = new LinkedList<String>();
		if(!lugares.isEmpty()) {
			Vertex ver1 = lugares.search("Ayuntamiento");
			Vertex ver2 = lugares.search(destino);
			if(ver1 != null && ver2 != null) {
				boolean[] marcas = new boolean[lugares.getSize()];
				marcarRestringidos(lugares, lugaresRestringidos, marcas);
				dfs(lugares, ver1, ver2, camino, marcas, maxTiempo);
			}
		}
		return camino;
	}

	private boolean dfs(Graph<String> lugares, Vertex<String> origen, Vertex<String> destino, List<String> camino, boolean[] marcas, int tiempo) {
		boolean encontre = false;
		marcas[origen.getPosition()] = true;
		camino.add(origen.getData());
		if(origen == destino) {
			return true;
		}
		else {
			List<Edge<String>> ady = lugares.getEdges(origen);
			Iterator<Edge<String>> it = ady.iterator();
			while(it.hasNext() && !encontre) {
				Edge<String> v = it.next();
				int j = v.getTarget().getPosition();
				if(!marcas[j] && tiempo - v.getWeight() >= 0) {
					encontre = dfs(lugares, v.getTarget(), destino, camino, marcas, tiempo - v.getWeight());
				}
			}
		}
		if(!encontre) {
			camino.remove(camino.size()-1);
		}
		marcas[origen.getPosition()] = false;
		return encontre;
	}

	public void marcarRestringidos(Graph<String> lugares, List<String> lugaresRestringidos, boolean[] marcas) {
		for(String nom: lugaresRestringidos) {
			Vertex<String> v = lugares.search(nom);
			if(v!=null) {
				marcas[v.getPosition()] = true;
			}
		}
	}
}
