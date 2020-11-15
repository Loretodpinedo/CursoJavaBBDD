package conexion;

import modelo.persistencia.DaoEmpleada;

public class PruebaConexion {

	public static void main(String[] args) {
		
		DaoEmpleada daocoche = new DaoEmpleada();
		boolean estaConectado = daocoche.abrirConexion();
		System.out.println(estaConectado);
	}

}
