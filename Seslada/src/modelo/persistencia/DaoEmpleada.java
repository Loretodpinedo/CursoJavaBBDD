package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import modelo.entidad.Empleada;

public class DaoEmpleada {

	private Connection conexion;

	public boolean abrirConexion() {
		// protocolo:subprotocolo://IP:PUERTO/NOMBRE_ESQUEMA
		String url = "jdbc:mysql://localhost:3306/selsada?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "Pecador35!";

		try {
			conexion = DriverManager.getConnection(url, usuario, password);
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}

	}

	public boolean cerrarConexion() {
		try {
			conexion.close();
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}
	}

	public boolean alta(Empleada empleada) {
		if (!abrirConexion()) {
			return false;
		}

		String query = "insert into empleadas (dniEmpleada,nombre,apellido,salario) values (?,?,?,?)";

		try {
			PreparedStatement ps = conexion.prepareStatement(query);

			ps.setString(1, empleada.getDniEmpleada());
			ps.setString(2, empleada.getNombre());
			ps.setString(3, empleada.getApellido());
			ps.setDouble(4, empleada.getSalario());

			int numeroFilas = ps.executeUpdate();
			if (numeroFilas == 0) {
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al insertar");
			e.printStackTrace();
			return false;
		} finally {

			cerrarConexion();
		}
	}

	public boolean modificar(Empleada empleada) {
		if (!abrirConexion()) {
			return false;
		}
		String query = "update empleadas set dniEmpleada=?, nombre=?, apellido=?, salario=? where idEmpleada=?";

		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ps.setString(1, empleada.getDniEmpleada());
			ps.setString(2, empleada.getNombre());
			ps.setString(3, empleada.getApellido());
			ps.setDouble(4, empleada.getSalario());
			ps.setInt(5, empleada.getIdEmpleada());

			int numeroFilas = ps.executeUpdate();
			if (numeroFilas == 0) {
				return false;
			} else {
				return true;
			}

		} catch (SQLException e) {
			System.out.println("Error al insertar");
			e.printStackTrace();
			return false;
		} finally {

			cerrarConexion();
		}
	}

	public boolean borrar(Empleada empleada) {
		if (!abrirConexion()) {
			return false;
		}
		String query = "delete from empleadas where idEmpleada=?";

		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ps.setInt(1, empleada.getIdEmpleada());

			int numeroFilas = ps.executeUpdate();
			if (numeroFilas == 0) {
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al borrar");
			e.printStackTrace();
			return false;
		} finally {
			cerrarConexion();
		}

	}

	public Empleada obtener(int idEmpleada) {
		if (!abrirConexion()) {
			return null;
		}
		String query = "select idEmpleada, dniEmpleada, nombre, apellido, salario from empleadas where idEmpleada=?";

		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, idEmpleada);

			ResultSet rs = ps.executeQuery();

			Empleada empleada = null;

			while (rs.next()) {

				empleada = new Empleada();
				empleada.setDniEmpleada(rs.getString(2));
				empleada.setNombre(rs.getString(3));
				empleada.setApellido(rs.getString(4));
				empleada.setSalario(rs.getDouble(5));
			}
			return empleada;
		} catch (SQLException e) {
			System.out.println("Error al mostrar empleada");
			e.printStackTrace();
			return null;
		} finally {
			cerrarConexion();
		}
	}

	
	public List<Empleada> listaPorSalarioYApellido() {
		if (!abrirConexion()) {
			return null;
		}
		String query = "select idEmpleada,dniEmpleada,nombre,apellido,salario from empleadas order by salario,apellido asc";
		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			Empleada empleada = null;

			List<Empleada> listaPorSalarioYApellido = new ArrayList<Empleada>();

			while (rs.next()) {

				empleada = new Empleada();
				empleada.setIdEmpleada(rs.getInt(1));
				empleada.setDniEmpleada(rs.getString(2));
				empleada.setNombre(rs.getString(3));
				empleada.setApellido(rs.getString(4));
				empleada.setSalario(rs.getDouble(5));

				listaPorSalarioYApellido.add(empleada);
			}
			return listaPorSalarioYApellido;
		} catch (SQLException e) {
			System.out.println("Error al listar ");
			e.printStackTrace();
			return null;
		} finally {
			cerrarConexion();

		}

	}

	public List<Empleada> listar() {
		if (!abrirConexion()) {
			return null;
		}
		String query = "select idEmpleada,dniEmpleada,nombre,apellido,salario from empleadas";
		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			Empleada empleada = null;

			List<Empleada> listaEmpleadas = new ArrayList<Empleada>();

			while (rs.next()) {

				empleada = new Empleada();
				empleada.setIdEmpleada(rs.getInt(1));
				empleada.setDniEmpleada(rs.getString(2));
				empleada.setNombre(rs.getString(3));
				empleada.setApellido(rs.getString(4));
				empleada.setSalario(rs.getDouble(5));

				listaEmpleadas.add(empleada);
			}
			return listaEmpleadas;
		} catch (SQLException e) {
			System.out.println("Error al listar ");
			e.printStackTrace();
			return null;
		} finally {
			cerrarConexion();

		}

	}
}
