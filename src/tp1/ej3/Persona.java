package tp1.ej3;

public class Persona {
	
	private String email;
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido, String email) {
		this.setApellido(apellido);
		this.setEmail(email);
		this.setNombre(nombre);
	}
	
	public String tusDatos() {
		return getNombre()+" "+getApellido()+" "+getEmail()+" ";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
