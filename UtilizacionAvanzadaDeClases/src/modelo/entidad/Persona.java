package modelo.entidad;

import java.util.Calendar;

public class Persona {

	private String nombre;
	private String direccion;
	private int codigoPostal;
	private String ciudad;
	private Fecha fechaNacimiento;

	/*
	 * Asi lo he hecho yo
	 * 
	 * @Override public String toString() { return "Nombre: " + nombre + "/n" +
	 * "Fecha de nacimiento: " + fechaNacimiento + "/n" + "Direccion: " + direccion
	 * + "/n" + codigoPostal; }
	 */
	// Asi lo hace el profe con StringBuilder
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("nombre: ");
		sb.append(nombre);
		sb.append("\nFecha de Nacimiento: ");
		sb.append(fechaNacimiento);
		sb.append("\nDireccion: ");
		sb.append(direccion);
		sb.append("\n");
		sb.append(codigoPostal);
		sb.append("\n");
		sb.append(ciudad);
		sb.append("\n");
		return sb.toString();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

//modificado 
	public void setFechaNacimiento(Fecha fecha) {
		// this.fechaNacimiento = fechaNacimiento;
		fechaNacimiento.setDia(fecha.getDia());
		fechaNacimiento.setMes(fecha.getMes());
		fechaNacimiento.setAnio(fecha.getAnio());
	}

	public Persona() {
		super();
	}

	public Persona(String nombre, String direccion, int codigoPostal, String ciudad, Fecha fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Metodo que comprueba si la persona es mayor de edad
	public boolean esMayorDeEdad() {

		Calendar hoy = Calendar.getInstance();
		int anioActual = hoy.get(Calendar.YEAR);
		int mesActual = hoy.get(Calendar.MONTH);
		int diaActual = hoy.get(Calendar.DAY_OF_MONTH);
		if (anioActual - fechaNacimiento.getAnio() > 18) {
			return true;
		} else if (anioActual - fechaNacimiento.getAnio() == 18 && mesActual > fechaNacimiento.getMes()) {
			return true;
		} else if (anioActual - fechaNacimiento.getAnio() == 18 && mesActual == fechaNacimiento.getMes()
				&& diaActual >= fechaNacimiento.getDia()) {
			return true;
		}
		return false;
	}

}
