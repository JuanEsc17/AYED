package tp1.ej7;

import java.util.ArrayList;

public class Capicua {
	
	public Capicua() {
		
	}
	
	public boolean esCapicua(ArrayList<Integer> lista) {
		int inicio = lista.size();
		int fin = lista.size()-1;
		while (inicio < fin) {
			if (!lista.get(inicio).equals(lista.get(fin))) {
				return false;
			}
			inicio++;
			fin--;
		}
		return true;
	}
	
}
