
public class Excepciones {

	public static int numerador = 10;
	public static Integer denominador = null;
	public static float division;

	public static void main(String[] args) {
		System.out.println("Antes de hacer la divison");
		try {
			division = numerador / denominador;

		} catch (ArithmeticException ex) {

			division = 0;// Si hay una expcepcion le doy valor 0 al atributo division
			System.out.println("Error AE: " + ex.getMessage());
		} catch (NullPointerException ex) {
			division = 1;// Si hay una excpcion nullPointer le doy valor 1 al atributo division
			System.out.println("Error NPE: " + ex.getMessage());
		} finally {
			System.out.println("Division: " + division);
			System.out.println("Despues de hacer la division");
		}

	}

}
