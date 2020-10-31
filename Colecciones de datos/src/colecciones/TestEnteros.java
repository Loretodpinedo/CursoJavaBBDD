package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEnteros {

	public static void main(String[] args) {
		ArrayList<Integer> miListadoAL;
		miListadoAL = new ArrayList<Integer>();
		Iterator<Integer> it = miListadoAL.iterator();

		miListadoAL.add(44);
		miListadoAL.add(7);
		miListadoAL.add(16);
		miListadoAL.add(29);
		miListadoAL.add(8);
		miListadoAL.add(50);
		System.out.println("Todos los numeros son " + miListadoAL);
		System.out.println("La suma de los numero mayores de 10 es ");

		System.out.println(miListadoAL.stream().filter(i -> i > 10).mapToInt(i -> i).sum());
		int sum = 0;
		while (it.hasNext())
			;
		{
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
	}

}
