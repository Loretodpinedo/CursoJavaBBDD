package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProgramaDos {

	public static void main(String[] args) {

		Set<Gente> setGente = new HashSet<Gente>();
		SortedSet<Gente> sortedSetGente = new TreeSet<Gente>();

		Gente gente = new Gente(1, 176, "Loreto");
		setGente.add(gente);
		sortedSetGente.add(gente);

		gente = new Gente(2, 190, "Laura");
		setGente.add(gente);
		sortedSetGente.add(gente);

		gente = new Gente(3, 180, "Irene");
		setGente.add(gente);
		sortedSetGente.add(gente);

		System.out.println("Personas en conjunto " + setGente);
		System.out.println("Personas en conjunto ordenado " + sortedSetGente);

	}

}
