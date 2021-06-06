/**
 * @author Roberto Alarcon Bardon
 * @version 06-06-2021
 */

package CDM1.RobertoAlarcon;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private int telefono;
		
	/**
	 * Constructor de la clase Persona
	 * @param nombre El nombre de la persona
	 * @param apellido El apellido de la persona
	 * @param dni El DNI de la persona
	 * @param edad La edad de la persona
	 * @param telefono El telefono de la persona
	 */
	public Persona(String nombre, String apellido, String dni, int edad, int telefono) {
		this.nombre = nombre;;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	/**
	 * Metodo getter de nombre
	 * @return El nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo setter de nombre
	 * @param nombre El nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo getter de apellido
	 * @return El apellido de la persona
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Metodo setter de apellido
	 * @param apellido El apellido de la persona
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Metodo getter de DNI
	 * @return El DNI de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Metodo setter de dni
	 * @param dni El dni de la persona
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * Metodo getter de edad
	 * @return La edad de la persona
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Metodo setter de edad
	 * @param edad La edad de la persona
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Metodo getter de telefono
	 * @return El telefono de la persona
	 */
	public int getTelefono() {
		return telefono;
	}
	
	/**
	 * Metodo setter de telefono
	 * @param telefono El telefono de la persona
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
