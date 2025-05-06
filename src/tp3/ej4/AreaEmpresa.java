package tp3.ej4;

public class AreaEmpresa {

	private String id;
	private int tardanza;
	
	public AreaEmpresa(int tardanza) {
		this.tardanza = tardanza;
		id = "hola";
	}
	
	public int getTardanza() {
		return tardanza;
	}
}
