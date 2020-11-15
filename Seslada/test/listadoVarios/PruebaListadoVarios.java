package listadoVarios;

import java.util.List;

import modelo.entidad.Empleada;
import modelo.persistencia.DaoEmpleada;

public class PruebaListadoVarios {

	public static void main(String[] args) {

		DaoEmpleada daoEmpleada = new DaoEmpleada();

		List<Empleada> listadoEmpleadas = daoEmpleada.listar();

		System.out.println("Esta es la lista de todas las empleadas\n " + listadoEmpleadas);

		List<Empleada> listaPorSalarioYApellido = daoEmpleada.listaPorSalarioYApellido();

		System.out.println("Esta es la lista de todas las empleadas ordenada por salarios y apellidos\n " + listaPorSalarioYApellido);
	}

}
