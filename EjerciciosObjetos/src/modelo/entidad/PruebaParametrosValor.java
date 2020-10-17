package modelo.entidad;

public class PruebaParametrosValor {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 30; // declaro y asigno valores.
		System.out.println("Valores declarados, antes de cambiar ");
		System.out.format("a=%d, b=%d, c=%d\n", a, b, c);// imprime a=10, b=20, c=30.

		cambiandoValores(a, b, c); // llamo al método que cambia los valores

		System.out.println("Valores despues de cambiar ");
		System.out.format("a=%d, b=%d, c=%d\n", a, b, c);

	}

	private static void cambiandoValores(int a, int b, int c) {
		a = 100;
		b = 200;
		c = 300;

		System.out.println("Valores cambiados con el método ");
		System.out.format("a=%d, b=%d, c=%d\n", a, b, c);

	}

}
