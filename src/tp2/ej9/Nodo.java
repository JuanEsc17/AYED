package tp2.ej9;

public class Nodo {
	
	private int suma;
	private int diferencia;
	
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	public int getDiferencia() {
		return diferencia;
	}
	public void setDiferencia(int diferencia) {
		this.diferencia = diferencia;
	}
	
	public Nodo(int suma, int diferencia) {
		super();
		this.suma = suma;
		this.diferencia = diferencia;
	}	
}
