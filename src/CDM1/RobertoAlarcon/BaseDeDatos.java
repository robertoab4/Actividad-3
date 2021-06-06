/**
 * @author Roberto Alarcon Bardon
 * @version 06-06-2021
 */

package CDM1.RobertoAlarcon;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;;

public class BaseDeDatos {

	private ArrayList<Persona> personas;
	private Scanner scn;
	private ArrayList<String> textoAEscribir;
	
	/**
	 * Constructor de la clase BaseDeDatos
	 */
	public BaseDeDatos() {
		this.personas = new ArrayList<>();
		this.scn = new Scanner(System.in);
		this.textoAEscribir = new ArrayList<>();
		
	}
	
	/**
	 * Hace que el programa empiece a funcionar
	 */
	public void iniciar() {
		int numero = 0;
		do {
			try{
				imprimirMenu();
				scn.reset();
				String numerostr = scn.nextLine();
				numero = Integer.parseInt(numerostr);
				eleccion(numero);
			}catch(NumberFormatException e) {
				System.out.print("\nHas introducido una letra, introduce un numero. \n\n");
			}catch(Exception e) {
				System.out.print("\nHa ocurrido un error, vuelva a intentarlo.\n\n");
			}
			
		}
		while(numero != 3);
		scn.close();
		System.out.println("¡Hasta luego!");
	}
	
	/**
	 * El metodo que depende del numero que introduzca el ususario hace una cosa u otra
	 * @param numero El numero que el usuario introduce por consola
	 */
	public void eleccion(int numero) {
		switch(numero){
		case 1:
			aniadirAlumno();
			break;
		case 2:
			aniadirProfesor();
			break;
		case 3:
			break;
		default:
			System.out.println("\nIntroduce un número del 1 al 3.\n");
		}	
	}
	
	/**
	 * Imprime el menu por consola para que el usuario elija
	 */
	public void imprimirMenu() {
		System.out.println("1.- Añadir alumno");
		System.out.println("2.- Añadir profesor");
		System.out.println("3.- Salir");
		
	}
	
	/**
	 * Añade un alumno a la base de datos y escribe el fichero de ese alumno
	 */
	public void aniadirAlumno() {
		
		// Resetea el scanner por si pudiera dar algun error
		scn.reset();

		System.out.println("\nNombre del alumno: ");
		String nombre = scn.nextLine();
		System.out.println("Apellidos del alumno: ");
		String apellido = scn.nextLine();
		System.out.println("DNI del alumno: ");
		String dni = scn.nextLine();
		System.out.println("Edad del alumno (en número): ");
		String edad = scn.nextLine();
		System.out.println("Teléfono del alumno: ");
		String telefono = scn.nextLine();
		System.out.println("¿Está matriculado el alumno? Escriba 'Si' o 'No' (Si no escribe nada o se equivoca al escribir si entenderemos que si está matriculado, revise con cuidado)");
		String matricula = scn.nextLine();
		boolean matriculado = false;
		if(matricula.toLowerCase().trim().equals("si")) {
			matriculado = true;
		}		
		
		// Añade a el array todo lo necesario para luego escribir el fichero '.txt'
		textoAEscribir.add("ALUMNO");
		textoAEscribir.add("Nombre: " + nombre);
		textoAEscribir.add("Apellidos: " + apellido);
		textoAEscribir.add("DNI: " + dni);
		textoAEscribir.add("Edad: " + edad);
		textoAEscribir.add("Telefono: " + telefono);
		if(matriculado == true) {
			textoAEscribir.add("Matriculado: Si");
		}
		else {
			textoAEscribir.add("Matriculado: No");
		}
		
		try {
			
			personas.add(new Alumno(nombre, apellido, dni, Integer.parseInt(edad), Integer.parseInt(telefono), matriculado));
			
			// Escribe y limpia el array para poder crear nuevos ficheros para la base de datos
			escribirFichero("Alumno", nombre, apellido);
			textoAEscribir.clear();
			
		}catch(NumberFormatException e) {
			System.out.print("\nHas introducido la edad o el telefono con letras y no con numeros. Vuelve a intentarlo. \n\n");
			textoAEscribir.clear();
		}catch(Exception e) {
			System.out.print("\nHa ocurrido un error, vuelva a intentarlo. \n\n");
			textoAEscribir.clear();
		}
		
	}
	
	/**
	 * Añade un profesor a la base de datos y escribe el fichero de ese profesor
	 */
	public void aniadirProfesor() {
		
		// Resetea el scanner por si pudiera dar algun error
		scn.reset();
		
		System.out.println("\nNombre del profesor: ");
		String nombre = scn.nextLine();
		System.out.println("Apellidos del profesor: ");
		String apellido = scn.nextLine();
		System.out.println("DNI del profesor: ");
		String dni = scn.nextLine();
		System.out.println("Edad del profesor (en número): ");
		String edad = scn.nextLine();
		System.out.println("Teléfono del profesor: ");
		String telefono = scn.nextLine();
		System.out.println("Salario del profesor: ");
		String salario = scn.nextLine();
				
		// Añade a el array todo lo necesario para luego escribir el fichero '.txt'
		textoAEscribir.add("PROFESOR");
		textoAEscribir.add("Nombre: " + nombre);
		textoAEscribir.add("Apellidos: " + apellido);
		textoAEscribir.add("DNI: " + dni);
		textoAEscribir.add("Edad: " + edad);
		textoAEscribir.add("Telefono: " + telefono);
		textoAEscribir.add("Salario: " + salario);
		
		try {
			personas.add(new Profesor(nombre, apellido, dni, Integer.parseInt(edad), Integer.parseInt(telefono), Double.parseDouble(salario)));
			
			// Escribe y limpia el array para poder crear nuevos ficheros para la base de datos
			escribirFichero("Profesor", nombre, apellido);
			textoAEscribir.clear();
			
		}catch(NumberFormatException e) {
			System.out.print("\nHas introducido la edad, el telefono o el salario con letras y no con numeros. Vuelve a intentarlo.\n\n");
			textoAEscribir.clear();
		}catch(Exception e) {
			System.out.print("\nHa ocurrido un error, vuelva a intentarlo.\n\n");
			textoAEscribir.clear();
		}
		
	}
	
	/**
	 * Escribe el fichero '.txt' con los cuales se crea la base de datos
	 * @param categoria El tipo de persona que es (Alumno o Profesor)
	 * @param nombre El nombre del alumno escrito por consola
	 * @param apellido Los apellidos del alumno escrito por consola
	 */
	public void escribirFichero(String categoria, String nombre, String apellido) {
		
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter(categoria + " " + nombre + apellido + ".txt");
			pw = new PrintWriter(fichero);
		
			for(int i = 0; i < textoAEscribir.size(); i++ ) {
				pw.println(textoAEscribir.get(i));
			}
			
		}catch(IOException e){
			System.out.println("\nSe ha producido un error al ecribir el fichero\n");
		}catch(Exception e) {
			System.out.print("\nSe ha producido un error al ecribir el fichero\n\n");
		}
		
		try {
			if(fichero != null) {
				fichero.close();
				pw.close();
			}
		}catch(IOException e) {
			System.out.println("\nSe ha producido un error al cerrar el fichero\n");
		}
		catch(Exception e) {
			System.out.print("\nSe ha producido un error al cerrar el fichero\n");
		}
			}
}
