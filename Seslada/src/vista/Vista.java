package vista;

import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Empleada;
import modelo.persistencia.DaoEmpleada;

public class Vista {

	static DaoEmpleada daoEmpleada = new DaoEmpleada();

	public static void main(String[] args) {

		List<Empleada> listaPorSalarioYApellido = daoEmpleada.listaPorSalarioYApellido();

		System.out.println(
				"Lista de todas las empleadas ordenada por salarios y apellidos\n " + listaPorSalarioYApellido);

		System.out.println("Las empleadas a las que se les ha subido el sueldo son:\n ");
		subidaSalario();

	}

	public static void subidaSalario() {

		double salarioMinimo = 1500;
		double resto;
		double salarioFinal;

		List<Empleada> listadoSalarios = daoEmpleada.listar();
		List<Empleada> listadoSalariosSubida = new ArrayList<Empleada>();

		for (Empleada empleada : listadoSalarios) {
			if (empleada.getSalario() <= salarioMinimo) {
				resto = salarioMinimo - empleada.getSalario();
				salarioFinal = resto + empleada.getSalario();
				empleada.setSalario(salarioFinal);
				listadoSalariosSubida.add(empleada);
				daoEmpleada.modificar(empleada);

				System.out.println("Nombre: " + empleada.getNombre() + " Apellido: " + empleada.getApellido()
						+ " Salario: " + empleada.getSalario() + "\n");
			}
		}

	}

}
