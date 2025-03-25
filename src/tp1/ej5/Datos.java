package tp1.ej5;

public class Datos {
	private int min,max;
	private double promedio;
	
	public Datos(int min, int max, double promedio) {
		this.min=min;
		this.max=max;
		this.promedio=promedio;
	}

	public Datos() {
		
	}
	
	public String toString() {
		return "Min: "+min+" Max: "+max+" Promedio: "+promedio;
	}
	
	public void setMin(int min) {
		this.min = min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
}
