package ejercicio2;

/*
La clase Album contendr� el n�mero de p�ginas y las estampitas que se pueden
 pegar en cada p�gina, dichos datos ser�n indicados al instanciar la clase.
 */
public class Album {

	private int paginas;
	private int estampitasPorPagina;

	@Override
	public String toString() {
		return "Cada album tiene " + paginas + " paginas y cada pagina tiene " + estampitasPorPagina + " estampas.";
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getEstampitasPorPagina() {
		return estampitasPorPagina;
	}

	public void setEstampitasPorPagina(int estampitasPorPagina) {
		this.estampitasPorPagina = estampitasPorPagina;
	}

}
