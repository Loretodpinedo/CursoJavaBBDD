package modificar;

import modelo.entidad.Empleada;
import modelo.persistencia.DaoEmpleada;

public class PruebaModificar {

	public static void main(String[] args) {

		DaoEmpleada daoEmpleada = new DaoEmpleada();

		Empleada e = new Empleada();
		e.setIdEmpleada(22);
		e.setDniEmpleada("45689165l");
		e.setNombre("Norma");
		e.setApellido("Cabrera");
		e.setSalario(1050.30);
		daoEmpleada.modificar(e);

		System.out.println("Se ha modificado la empleada con exito");

	}
}