package entidad;

import java.util.Scanner;

public class Calculadora {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String operador;
		do {
		operador = mostrarMenu();
		switch (operador) {
		case "1":
			System.out.println(suma());
			
			break;
		case "2":
			System.out.println(resta());
			
			break;
		case "3":
			System.out.println(multiplicacion());
			
			break;
		case "4":
			System.out.println(division());
			
			break;
			}
	}while(volverMenu()==1);
	}

	private static String mostrarMenu() {
		String operador;

		System.out.println("Seleccione el numero de la operación que quiere realizar:");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
	
		operador = sc.nextLine();

		return operador;

	}

	private static int volverMenu() {

		System.out.println("¿Desea volver a visualizar el panel de opciones?");
		System.out.println("Escriba Si o No:");
		sc.nextLine();
		String respuesta = sc.nextLine();
		if (respuesta.equalsIgnoreCase("Si")) {
			
			return 1;	
		}else {
			System.out.println("Adios.");
		
			return 2;}
		

	}

	public static double suma() {

		System.out.println("Introduzca el primer operando");
		double operando1 = sc.nextInt();
		System.out.println("Introduzca el segundo operando");
		double operando2 = sc.nextInt();
		double resultado = operando1 + operando2;
		return resultado;

	}

	public static double resta() {

		System.out.println("Introduzca el primer operando");
		double operando1 = sc.nextInt();
		System.out.println("Introduzca el segundo operador");
		double operando2 = sc.nextInt();
		double resultado = operando1 - operando2;
		return resultado;

	}

	public static double multiplicacion() {

		System.out.println("Introduzca el primer operando");
		double operando1 = sc.nextInt();
		System.out.println("Introduzca el segundo operador");
		double operando2 = sc.nextInt();
		double resultado = operando1 * operando2;
		return resultado;

	}

	public static double division() {

		System.out.println("Introduzca el primer operando");
		double operando1 = sc.nextInt();
		System.out.println("Introduzca el segundo operador");
		double operando2 = sc.nextInt();
		double resultado = operando1 / operando2;
		return resultado;

	}

}
