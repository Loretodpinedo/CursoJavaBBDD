package Borrar;


import modelo.entidad.Empleada;
import modelo.persistencia.DaoEmpleada;

public class PruebaBorrar {

	public static void main(String[] args) {

		DaoEmpleada daoEmpleada = new DaoEmpleada();

		Empleada e = new Empleada();
		e.setIdEmpleada(13);

		 daoEmpleada.borrar(e);

		System.out.println("Se ha borrado la empleada " + e.getIdEmpleada() + " con exito");

	}

}
