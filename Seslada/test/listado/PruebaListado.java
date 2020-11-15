package listado;

import modelo.entidad.Empleada;
import modelo.persistencia.DaoEmpleada;

public class PruebaListado {

	public static void main(String[] args) {

		DaoEmpleada daoEmpleada = new DaoEmpleada();

		Empleada obtenerEmpleada = daoEmpleada.obtener(10);

		System.out.println("La empleada seleccionada es " + obtenerEmpleada);

	}

}
