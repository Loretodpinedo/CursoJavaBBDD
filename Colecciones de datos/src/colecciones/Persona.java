package colecciones;

import java.util.SortedMap;
import java.util.TreeMap;

public class Persona {

	private int idPersona;
	private String nombre;
	private int altura;
	public SortedMap<String, String> agendaTelefono;

	public Persona(int idPersona, String nombre, int altura) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
		this.agendaTelefono = new TreeMap<String, String>();// Inicialmente el mapa esta vacio.
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Persona" + "\nId: " + idPersona + "\nNombre: " + nombre + "\nAltura: " + altura + "\naAgenda"
				+ agendaTelefono.toString().replaceAll("\n"+",", "\n") + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Persona other = (Persona) obj;
		if (this.idPersona != other.idPersona) {
			return false;
		}
		return true;
	}

}
