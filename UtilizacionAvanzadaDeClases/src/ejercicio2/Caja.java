package ejercicio2;

/*La clase Caja nos proporcionar� el n�mero de estampitas a trav�s de una 
 * variable de instancia, la cual estar� inicializada a 100, y adem�s podremos
 *  incluir m�s estampitas en la Caja.
 * 
 */
public class Caja {

	private int numeroEstampas = 100;
	private int estampasA�adidas;

	@Override
	public String toString() {
		return "La caja tiene " + numeroEstampas + " estampas.";
	}

	public int getNumeroEstampas() {
		return numeroEstampas;
	}

	public void setNumeroEstampas(int numeroEstampas) {
		this.numeroEstampas = numeroEstampas;
	}

	public int getEstampasA�adidas() {
		return estampasA�adidas;
	}

	public void setEstampasA�adidas(int estampasA�adidas) {
		this.estampasA�adidas = estampasA�adidas;
	}

}
