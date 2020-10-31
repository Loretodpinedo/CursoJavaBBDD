package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Programa {

	public static void main(String[] args) {

		List<Persona> listaPersonas = new ArrayList<Persona>();// Es e tipo List implementado con arrayList
		Random r = new Random();
		Persona temp = null;
		int sumaAltura = 0;

		Persona p1 = new Persona(1, "Laure", 17);
		Persona p2 = new Persona(2, "Mria", 12);

		listaPersonas.add(p1);
		listaPersonas.add(p2);

		System.out.println(listaPersonas);
		for (int i = 0; i < 1000; i++) {

			Iterator<Persona> it = listaPersonas.iterator();

			while (it.hasNext()) {
				temp = it.next();
				System.out.println(temp);
				sumaAltura += temp.getAltura();
			}
			System.out.println("La media de altura del conjunto de personas es " + sumaAltura / listaPersonas.size());

		}

	}

}
