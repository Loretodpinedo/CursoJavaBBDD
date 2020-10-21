package ejercicioExcepciones;

//Esta clase lanzara la excepción si la persona es menor de 12 años
public class TrowExample {
	// Este metodo contiene la excepcion al cual le pasamos la edad como argumento.
	static void comprobarEdad(int edad) {
		if (edad < 12) {
			throw new ArithmeticException("Esta persona es menor de 12 años, no puede registrarse");

		} else {
			System.out.println("Esta persona si puede registrase");
		}
	}

	public static void main(String args[]) {
		System.out.println("Bienvenide al proceso de registro");
		comprobarEdad(10);
		System.out.println("Ten un buen dia..");
	}

}
