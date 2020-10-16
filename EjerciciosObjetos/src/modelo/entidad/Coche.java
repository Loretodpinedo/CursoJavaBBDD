package modelo.entidad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Coche {

	static boolean estado = false;
	static int velocidad = 0;
	static int VMAXIMA = 120;

	public static void menu() {

		System.out.println("1.- Montar en el coche");
		System.out.println("2.- Comenzar");
		System.out.println("3.- Parar");
		System.out.println("4.- Salir del coche");
		System.out.println("");
		System.out.println("Introduzca una opcion");
	}

	public static void montar() {

		if (estado == false) {

			System.out.println("Ya estas dentro del coche");
			estado = true;

		} else {
			System.out.println("Ya estabas dentro del coche, no intentes subir otra vez");
		}

		menu();
	}

	public static void comenzar() {

		if (estado == false) {

			System.out.println("Primero sube al coche");
		} else if (velocidad == VMAXIMA) {
			System.out.println("Ya no puedes acelerar más");

		} else {
			++velocidad;
			System.out.println("La velocidad actual es: " + velocidad);
		}

		menu();
	}

	public static void parar() {
		if (velocidad == 0) {
			System.out.println("Ya estas parado, deja de frenar");
		} else {
			System.out.println("Has frenado de golpe");
			velocidad = 0;
		}

		menu();
	}

	public static void salirCoche() {
		if (estado == false) {
			System.out.println("No puedes bajar del coche porque no te has subido");
		} else if (velocidad != 0) {
			System.out.println("No puedes bajar en marcha, primero frena");
		} else {
			System.out.println("Acabas de bajar del coche.");
		}
		menu();

	}

	public static void main(String args[]) throws IOException {

		BufferedReader i = new BufferedReader(new InputStreamReader(System.in));

		String opcion;
		menu();
		do {
			opcion = i.readLine();

			try {

				switch (Integer.parseInt(opcion)) {
				case 1:
					montar();

					break;
				case 2:
					comenzar();

					break;
				case 3:
					parar();

					break;
				case 4:
					salirCoche();
					System.exit(0);

				default:
					System.out.println("No existe la opcion");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("La opcion debe ser un numero");
			}
		} while (true);
	}
}
