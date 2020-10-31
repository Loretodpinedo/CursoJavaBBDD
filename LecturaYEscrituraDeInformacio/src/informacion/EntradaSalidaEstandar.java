package informacion;

import java.io.IOException;

public class EntradaSalidaEstandar {

	public static void main(String[] args) {
		// De forma oblgatoria el proceso de lectura ha de estar dentro de un bloque
		// try...catch.
		// para leer un caracter
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// para detener de manera obligatoria la ejecucion del programa hasta pulsar la
		// tecla de
		// RETORNO

		StringBuffer str = new StringBuffer();
		char c;
		try {
			while ((c = (char) System.in.read()) != '\n') {
				str.append(c);
			}

		} catch (IOException e2) {
		}
		System.out.println(str);

	}
}
