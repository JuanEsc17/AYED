package tp3.ej4;

import tp1.ej8.Queue;
import tp3.ej1.GeneralTree;

public class AnalizadorArbol {
	
	public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol) {
		if (arbol.isEmpty()) return 0;
		
		Queue<GeneralTree<AreaEmpresa>> cola = new Queue<>();
		double maxPromedio = -1;
		cola.enqueue(arbol);
		
		while(!cola.isEmpty()) {
			int suma = 0;
			int nivel = cola.size();
			for(int i = 0; i < nivel; i++) {
				GeneralTree<AreaEmpresa> actual = cola.dequeue();
				suma+= actual.getData().getTardanza();
				
				for(GeneralTree<AreaEmpresa> hijo: actual.getChildren()) {
					cola.enqueue(hijo);
				}
			}
			maxPromedio = Math.max((double)suma/nivel, maxPromedio);
		}
		return maxPromedio;
			
	}
}
