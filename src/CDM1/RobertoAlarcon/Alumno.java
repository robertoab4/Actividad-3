/**
 * @author Roberto Alarcon Bardon
 * @version 06-06-2021
 */

package CDM1.RobertoAlarcon;

public class Alumno extends Persona{

	private boolean matriculado;
	
	/**
	 * Constructor de la clase Alumno
	 * @param nombre El nombre del alumno
	 * @param apellido El apellido del alumno
	 * @param dni El DNI del alumno
	 * @param edad La edad del alumno
	 * @param telefono El telefono del alumno
	 * @param matriculado true si esta matriculado, false si no lo esta
	 */
	public Alumno(String nombre, String apellido, String dni, int edad, int telefono, boolean matriculado) {
		super(nombre, apellido, dni, edad, telefono);
		this.matriculado = matriculado;
	}

	/**
	 * Metodo getter de matriculado
	 * @return Si esta matriculado o no
	 */
	public boolean isMatriculado() {
		return matriculado;
	}

	/**
	 * Metodo setter de matriculado
	 * @param matriculado true si esta matriculado, false si no lo esta
	 */
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	
}
