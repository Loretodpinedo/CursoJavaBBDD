
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerDatos {

	public static void main(String[] args) throws IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String numero = "";
		String continua = "";
		try {
			do {
				System.out.println("Introduzca un numero:");
				numero = teclado.readLine();
				int num = Integer.parseInt(numero);
				if (num % 2 == 0) {
					System.out.println("El numero: " + num + " es par");
				} else {
					System.out.println("El numero: " + num + " es impar");
				}
				System.out.println("¿Desea continuar (S/N)?");
				continua = teclado.readLine();

				if (!continua.equalsIgnoreCase("S") || !continua.equalsIgnoreCase("N")) {
					throw new MiPropiaExcepcion();
				}
			} while (continua.equalsIgnoreCase("S"));
		} catch (NumberFormatException e) {
			System.out.println("Debe introducir numero");

		} catch (MiPropiaExcepcion e) {
			System.out.println(e.mensaje());
			teclado.readLine();
		}
	}
}
