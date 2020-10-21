package modelo.entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// Creamos ArrayList de Personas

	static ArrayList<Persona> personas = new ArrayList<Persona>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// se leen las personas y se introducen en el ArrayList
		leerPersonas();
		if (numeroDePersonas() > 0) {
			// Se muestran todas las personas introducidas
			System.out.println("\nPersonas introducidas: ");
			mostrar();
			// se muestra la persona de mayor edad
			System.out.println("\nPersona de mayor edad: ");
			System.out.println(personaMayorEdad());
			// Se muestra el numero de personas mayores de edad
			System.out.println("\nNumero de personas mayores de edad: " + personasMayoresDeEdad());

		}
	}

	// metodo que lee los datos de cada persona y las añade al ArrayList

	public static void leerPersonas() {

		String nombre;
		String direccion;
		String ciudad;
		Fecha fecha;
		Persona p;
		int codigoPostal;
		int N;
		int i;
		int dia;
		int mes;
		int anio;

		do {
			System.out.println("¿Número de personas?");
			N = sc.nextInt();
		} while (N < 0);
		sc.nextLine();// limpia el buffer de entrada

		for (i = 1; i <= N; i++) {

			System.out.println("Persona " + i);
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			do {
				System.out.println("Fecha de nacimiento: ");
				System.out.println("Dia: ");
				dia = sc.nextInt();
				System.out.println("Mes: ");
				mes = sc.nextInt();
				System.out.println("Año: ");
				anio = sc.nextInt();
				fecha = new Fecha(dia, mes, anio);

			} while (!fecha.fechaCorrecta());

			sc.nextLine();
			System.out.println("Direccion: ");
			direccion = sc.nextLine();
			System.out.println("Codigo postal: ");
			codigoPostal = sc.nextInt();
			sc.nextLine();
			System.out.println("Ciudad: ");
			ciudad = sc.nextLine();

			// Nueva instancia de Persona.
			p = new Persona();
			p.setNombre(nombre);
			p.setFechaNacimiento(fecha);
			p.setDireccion(direccion);
			p.setCodigoPostal(codigoPostal);
			p.setCiudad(ciudad);

			// Añado el objeto Persona al ArrayList Personas
			personas.add(p);
		}
	}

	// metodo para mostrar todas las personas
	private static void mostrar() {
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i));
		}
	}

	// Devuelve el numero de personas que contiene el ArrayList
	public static int numeroDePersonas() {
		return personas.size();

	}

	// Devuelve la persona de mayor edad
	// En este metodo se uliza el metodo esMayorQue() añadido a la clase Fecha
	public static Persona personaMayorEdad() {
		Persona per = personas.get(0);
		// inicializacion;terminacion;incremento
		for (int i = 1; i < personas.size(); i++) {
			if (personas.get(i).getFechaNacimiento().esMayorQuefecha(per.getFechaNacimiento())) {
				per = personas.get(i);
			}

		}

		return per;
	}

	// Calcula y devuelve el numero de personas que viven
	// en la ciudad que se recibe como parametro
	public static int cuantasPersonasVivenEn(String ciudad) {
		int cont = 0;
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getCiudad().equalsIgnoreCase(ciudad)) {
				cont++;
			}
		}
		return cont;
	}

	// Calcula y devuelve el numero de personas mayores de edad
	public static int personasMayoresDeEdad() {
		int cont = 0;
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).esMayorDeEdad()) {
				cont++;
			}
		}
		return cont;
	}
}
