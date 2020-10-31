package colecciones;

import java.util.ArrayList;
import java.util.Random;

// Defino el objeto de tipo generic
public class Genericos<T> {

	private java.util.Random random = new Random();

	private ArrayList<T> lista;

	public Genericos() {
		lista = new ArrayList<T>();
	}

	public void adderir(T cosa) {
		lista.add(cosa);
	}

	public T getRandomCosa() {
		int indice = random.nextInt(lista.size());
		return lista.get(indice);
	}

	}
