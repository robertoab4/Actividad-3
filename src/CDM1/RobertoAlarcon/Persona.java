package CDM1.RobertoAlarcon;

public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private int telefono;
	private String usuario;
	private String contrasenia;
		
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public abstract void setUsuario();
	public abstract void setContraseña();
}
