package alta;

import modelo.entidad.Empleada;
import modelo.persistencia.DaoEmpleada;

public class PruebaAlta {

	public static void main(String[] args) {

		DaoEmpleada daoEmpleada = new DaoEmpleada();

		Empleada e = new Empleada();
		e.setDniEmpleada("34567899s");
		e.setNombre("Isaac");
		e.setApellido("Pinedo");
		e.setSalario(2900.56);

		daoEmpleada.alta(e);

		Empleada e1 = new Empleada();
		e1.setDniEmpleada("12345678l");
		e1.setNombre("Ines");
		e1.setApellido("Diaz");
		e1.setSalario(1100.56);

		daoEmpleada.alta(e1);

		Empleada e2 = new Empleada();
		e2.setDniEmpleada("23456789p");
		e2.setNombre("Martina");
		e2.setApellido("Serrano");
		e2.setSalario(990.90);

		daoEmpleada.alta(e2);

		Empleada e3 = new Empleada();
		e3.setDniEmpleada("987654321k");
		e3.setNombre("Javier");
		e3.setApellido("Martin");
		e3.setSalario(11600.89);

		daoEmpleada.alta(e3);

		Empleada e4 = new Empleada();
		e4.setDniEmpleada("4526789p");
		e4.setNombre("Teo");
		e4.setApellido("Yañez");
		e4.setSalario(1499.23);

		daoEmpleada.alta(e4);

		Empleada e5 = new Empleada();
		e5.setDniEmpleada("189156898y");
		e5.setNombre("Aaron");
		e5.setApellido("Syilcicon");
		e5.setSalario(1490.99);

		daoEmpleada.alta(e5);

		Empleada e6 = new Empleada();
		e6.setDniEmpleada("125896745f");
		e6.setNombre("Norma");
		e6.setApellido("Cabrera");
		e6.setSalario(5000.56);

		daoEmpleada.alta(e6);

		Empleada e7 = new Empleada();
		e7.setDniEmpleada("1256549849p");
		e7.setNombre("Sergio");
		e7.setApellido("Serrano");
		e7.setSalario(1359.45);

		daoEmpleada.alta(e7);

		Empleada e8 = new Empleada();
		e8.setDniEmpleada("56978125648s");
		e8.setNombre("Cristina");
		e8.setApellido("Veneno");
		e8.setSalario(8900.89);

		daoEmpleada.alta(e8);

		Empleada e9 = new Empleada();
		e9.setDniEmpleada("25698456d");
		e9.setNombre("Ana");
		e9.setApellido("Pinedo");
		e9.setSalario(1200.78);

		daoEmpleada.alta(e9);

		System.out.println("Se han dado de alta las empleadas" + e.getNombre() + e1.getNombre() + e2.getNombre()
				+ e3.getNombre() + e4.getNombre() + e5.getNombre() + e6.getNombre() + e7.getNombre() + e8.getNombre()
				+ e9.getNombre());

	}

}
