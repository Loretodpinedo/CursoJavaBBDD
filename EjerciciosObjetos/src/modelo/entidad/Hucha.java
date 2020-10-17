package modelo.entidad;

public class Hucha {

	static int numHuchas = 0;
	double ahorros = 0.0;

	public static void main(String[] args) {

		Hucha hucha1 = new Hucha();
		contarHuchas();
		hucha1.ahorros = 2500;
		hucha1.modificarAhorros();
		System.out.println("Numero de huchas " + numHuchas);

		Hucha hucha2 = new Hucha();
		contarHuchas();
		hucha2.ahorros = 600;
		hucha2.modificarAhorros();

		System.out.println("Numero de huchas " + numHuchas);

	}

	// Este metodo varia si es invocado por hucha1 o hucha2, necesita un objeto
	// hucha para funcionar. No es estatico.
	public void modificarAhorros() {

		if (ahorros > 4000) {
			ahorros = ahorros - 0.1 * ahorros;
		}
		System.out.println("Ahorros= " + ahorros);
	}

	// Este metodo se comporta igual independientemente del objeto que lo invoque
	// Si es estatico.
	private static void contarHuchas() {

		numHuchas++;

	}

}
