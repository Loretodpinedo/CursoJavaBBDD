package ejercicio2;

/*
La clase Album contendrá el número de páginas y las estampitas que se pueden
 pegar en cada página, dichos datos serán indicados al instanciar la clase.
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
