package modelo.entidad;

public class Bicicleta {

	public int cadencia;
	public int velocidad;
	public int engranaje;

	public Bicicleta(int startCadencia, int startVelocidad, int startEngranaje) {

		cadencia = startCadencia;
		velocidad = startVelocidad;
		engranaje = startEngranaje;
	}

	Bicicleta miBici = new Bicicleta(30, 8, 7);

	public Bicicleta() {
	}

	Bicicleta tuBici = new Bicicleta();

}
