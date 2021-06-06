/**
 * @author Roberto Alarcon Bardon
 * @version 06-06-2021
 */

package CDM1.RobertoAlarcon;

public class Profesor extends Persona{

	private double salario;
	
	/**
	 * Constructor de la clase Profesor
	 * @param nombre El nombre del profesor
	 * @param apellido El apellido del profesor
	 * @param dni El DNI del profesor
	 * @param edad La edad del profesor
	 * @param telefono El telefono del profesor
	 * @param salario El salario del profesor
	 */
	public Profesor(String nombre, String apellido, String dni, int edad, int telefono, double salario) {
		super(nombre, apellido, dni, edad, telefono);
		this.salario = salario;
	}

	/**
	 * Metodo getter de salario
	 * @return El salario del profesor
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Metodo setter de salario
	 * @param salario El nuevo salario
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}
