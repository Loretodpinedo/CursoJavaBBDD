package modelo.entidad;

import java.util.Scanner;

public class ComparandoCadenas {

	public String atributo1;
	public String atributo2;

	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	public String getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pido que ingrese la primera cadena
		System.out.println("Escribe la primera cadena ");
		String s1 = sc.next();

		// Pido que ingrese la segunda cadena
		System.out.println("Escribe la segunda cadena ");
		String s2 = sc.next();
		System.out.println("comparando las cadenas que has metido");
		// con este comparador == se comparan las direcciones de memoria asi que
		// siempre seran distintas.
		if (s1 == s2) {
			System.out.println(s1 + " " + s2 + " son iguales ");
		} else {
			System.out.println(s1 + " " + s2 + " son distintas");
		}

		// Creo dos objetos diferentes

		ComparandoCadenas c1 = new ComparandoCadenas();
		ComparandoCadenas c2 = new ComparandoCadenas();

		// los comparo
		System.out.println("Comparando c1 y c2 con equals ");
		if (c1.equals(c2)) {
			System.out.println(c1 + " y " + c2 + " Son iguales");
		} else {
			System.out.println(c1 + " y " + c2 + " No son iguales");
		}

		// Creo un nuevo objeto

		ComparandoCadenas c3;
		// asignamos la direccion de c1 a c3;
		c3 = c1;

		// ahora si seran iguales
		System.out.println("Comparando c3 y c1 despues de igualarlos");
		if (c3.equals(c1)) {
			System.out.println("Los objetos son iguales");
		} else {
			System.out.println("Los objetos no son iguales");
		}

		sc.close();
	}
}
