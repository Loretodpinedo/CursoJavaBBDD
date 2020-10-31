package cadenasCaracteres;

import java.util.StringTokenizer;

public class CadenasCaracteres {

	// Contar cuantas palabras tiene una cadena de caracteres

	public static int contarPalabras(String cadena) {
		cadena += "";
		int c = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				c++;
			}

		}
		return c;
	}

	// Eliminar una palabra de una cadena de caracteres

	public static String eliminarPalabra(String cadena, int k) {
		cadena += "";
		String nuevaCadena = "";
		int c = 0;
		String palabra = "";
		for (int i = 0; i < cadena.length(); i++) {
			palabra += cadena.charAt(i);
			if (cadena.charAt(i) == ' ') {
				c++;
				if (c != k) {
					nuevaCadena += palabra;
				}
				palabra = "";
			}
		}
		return nuevaCadena.trim();
	}

	// Invertir las palabras de una cadena
	public static String invertirPalabras(String cadena) {
		cadena += "";
		String palabra = "";
		String nuevaCadena = "";
		for (int i = 0; i < cadena.length(); i++) {
			palabra = cadena.charAt(i) + palabra;
			if (cadena.charAt(i) == ' ') {
				nuevaCadena += palabra;
				palabra = "";
			}
		}
		return nuevaCadena.trim();
	}

	public static void main(String[] args) {
		// StringBuffer
		// StringTokenizer
		String nombre = "Loreto Diaz Pinedo";
		StringTokenizer partes = new StringTokenizer(nombre);
		while (partes.hasMoreTokens()) {
			System.out.println(partes.nextToken());
		}
		String cadenote = "tengo un tractor amarillo que es lo que se lleva ahora";
		System.out.println(contarPalabras(cadenote));

		System.out.println(eliminarPalabra(cadenote, 4));
		System.out.println(invertirPalabras(cadenote));
		// concatenar dos cadenas
		String nombre2 = "Javier Serrano Lopez";
		nombre2 += " es guapisimo";
		System.out.println(nombre2);
		System.out.println(nombre = nombre + " es guapisima");
	}

}
