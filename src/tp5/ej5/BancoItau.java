package tp5.ej5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp1.ej8.Queue;
import tp5.Edge;
import tp5.Graph;
import tp5.Vertex;

public class BancoItau {
	
	public List<Persona> quedateEnCasa(Graph<Persona> grafo, Persona empleado, int distanciaMax){
		List<Persona> listaJubilados = new LinkedList<>();
		if(grafo != null && !grafo.isEmpty() && empleado != null && distanciaMax >= 0) {
			Vertex<Persona> vEmpleado = grafo.search(empleado);
			if(empleado != null) {
				quedateEnCasaBFS(grafo, vEmpleado, distanciaMax, listaJubilados, 40);
			}
		}
		return listaJubilados;
	}
	
	public void quedateEnCasaBFS(Graph<Persona> grafo, Vertex<Persona> empleado, int distanciaMax, List<Persona> listaJubilados, int jubiladosMaximos) {
		int distanciaActual = 0;
		Queue<Vertex<Persona>> cola = new Queue<>();
		boolean[] marca = new boolean[grafo.getSize()];
		marca[empleado.getPosition()] = true;
		
		cola.enqueue(empleado);
		cola.enqueue(null);
		boolean seguir = true;
		while(!cola.isEmpty() && seguir) {
			Vertex<Persona> aux = cola.dequeue();
			if(aux != null) {
				List<Edge<Persona>> adyacentes = grafo.getEdges(aux);
				Iterator<Edge<Persona>> iterador = adyacentes.iterator();
				while(iterador.hasNext() && seguir) {
					Edge<Persona> v = iterador.next();
					int j = v.getTarget().getPosition();
					if(!marca[j]) {
						if((distanciaActual + 1 <= distanciaMax) && (listaJubilados.size() < jubiladosMaximos)) {
							marca[j] = true;
							cola.enqueue(v.getTarget());
							Persona persona = v.getTarget().getData();
							if(persona.esJubilado() && !persona.cobroSueldo()) {
								listaJubilados.add(v.getTarget().getData());
							}
						}else {
							seguir = false;
						}
					}
				}
				
			}else if(!cola.isEmpty()) {
				distanciaActual++;
				if(listaJubilados.size() == jubiladosMaximos) {
					seguir = false;
				}
				if(distanciaActual <= distanciaMax) {
					cola.enqueue(null);
				}
			}
		}
	}
}
