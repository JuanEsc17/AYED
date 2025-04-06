package tp1.ej7;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private String email;
	private String facultad;

	public Estudiante(String nombre, String apellido, String email, String facultad) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setFacultad(facultad);
		this.setEmail(email);
	}
	
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	public String tusDatos() {
		return getNombre()+" "+getApellido()+" "+getEmail()+" "+getFacultad();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getNombre() {
		return nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private String getApellido() {
		return apellido;
	}
	private String getEmail() {
		return email;
	}
	public void setEmail(String email2) {
		this.email = email2;
	}
	
}
