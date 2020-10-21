package ejercicio2;

/*La clase Caja nos proporcionará el número de estampitas a través de una 
 * variable de instancia, la cual estará inicializada a 100, y además podremos
 *  incluir más estampitas en la Caja.
 * 
 */
public class Caja {

	private int numeroEstampas = 100;
	private int estampasAñadidas;

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

	public int getEstampasAñadidas() {
		return estampasAñadidas;
	}

	public void setEstampasAñadidas(int estampasAñadidas) {
		this.estampasAñadidas = estampasAñadidas;
	}

}
