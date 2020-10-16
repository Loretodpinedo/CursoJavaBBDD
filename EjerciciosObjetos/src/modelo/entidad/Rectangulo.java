package modelo.entidad;

public class Rectangulo {

	public int altura;
	public int ancho;
	Punto punto;

	// constructores
	public Rectangulo() {
		punto = new Punto(0, 0);
	}

	public Rectangulo(Punto p) {
		punto = p;
	}

	public Rectangulo(int alt, int anch) {

		altura = alt;
		ancho = anch;
		punto = new Punto(0, 0);
	}

	public Rectangulo(Punto p, int alt, int anch) {
		punto = p;
		altura = alt;
		ancho = anch;
	}

	// metodo para mover el rectangulo
	public void mover(int x, int y) {
		punto.x = x;
		punto.y = y;
	}

	// metodo para calcular el area del rectangulo
	public int calcularArea() {
		return altura * ancho;
	}

	// Instancia rectangulos
	Rectangulo rectangulo = new Rectangulo(punto, 15, 12);
	Rectangulo rectangulo2 = new Rectangulo(56, 32);
	Rectangulo rectangulo3 = new Rectangulo();
}
