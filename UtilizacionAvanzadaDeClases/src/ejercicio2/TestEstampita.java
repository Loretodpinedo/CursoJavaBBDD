package ejercicio2;

import java.util.Scanner;

public class TestEstampita {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		recuentoTotalEstampas();

	}

	public static int recuentoEstampasAbum() {

		Album album = new Album();
		System.out.println("¿Cuantas paginas tiene el album?");
		album.setPaginas(sc.nextInt());
		System.out.println("¿Cuantas estampas se pueden pegar en cada pagina del album?");
		album.setEstampitasPorPagina(sc.nextInt());

		int paginas = album.getPaginas();
		int estampas = album.getEstampitasPorPagina();
		int totalEstampasAlbum = paginas * estampas;
		return totalEstampasAlbum;

	}

	public static int recuentoCaja() {

		Caja caja = new Caja();
		System.out.println("¿cuantos cromos has metido en la caja?");
		caja.setEstampasAñadidas(sc.nextInt());

		return caja.getEstampasAñadidas() + caja.getNumeroEstampas();
	}

	public static int recuentoTotalEstampas() {

		int album1 = recuentoEstampasAbum();
		int album2 = recuentoEstampasAbum();
		int album3 = recuentoEstampasAbum();
		int caja1 = recuentoCaja();

		int totalEstampas = album1 + album2 + album3 + caja1;

		System.out.println("El total de las estampas es " + totalEstampas);

		return totalEstampas;

	}
}
