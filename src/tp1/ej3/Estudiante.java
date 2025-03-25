package tp1.ej3;

public class Estudiante extends Persona {
	
	private String comision;
	private String direccion;
	
	public Estudiante(String nombre, String apellido, String comision, String email, String direccion) {
		super(nombre, apellido, email);
		this.setComision(comision);
		this.setEmail(email);
		this.setDireccion(direccion);
	}
	
	public String tusDatos() {
		return super.tusDatos()+getComision()+" "+getDireccion();
	}
	
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
