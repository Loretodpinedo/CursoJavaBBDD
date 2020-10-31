package colecciones;

public class ProbandoProbando {

	public static void main(String[] args) {

		Genericos<Integer> seleccion = new Genericos<Integer>();

		seleccion.adderir(1);
		seleccion.adderir(2);
		seleccion.adderir(3);

		Integer select = seleccion.getRandomCosa();
		System.out.println(select);

		Genericos<Fruta> selectorFruta = new Genericos<Fruta>();
		selectorFruta.adderir(Fruta.CHIRIMOYA);

		Fruta eleccionFrutal = selectorFruta.getRandomCosa();
		System.out.println(eleccionFrutal);
	}

}
