package testEventos;

import java.util.ArrayList;
import java.util.ListIterator;

public class Empresa {

	private String id;
	private String nombre;
	private String apellido;
	private int edad;
	private String empresa;
	private static ArrayList listeners;

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", empresa="
				+ empresa + "]";
	}

	public Empresa(String id, String nombre, String apellido, int edad, String empresa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.empresa = empresa;

		listeners = new ArrayList();
	}

	// Metodo para incluir los eventos en el array listeners
	public void añadirEventosALaLista(EscuchandoEventos listener) {
		listeners.add(listener);

	}

	private void triggerNombreEvento() {
		ListIterator li = listeners.listIterator();
		while (li.hasNext()) {
			EscuchandoEventos listener = (EscuchandoEventos) li.next();
			ModificandoEventos readerEvObj = new ModificandoEventos(this, this);
			(listener).cambioNombre(readerEvObj);
		}
	}

	private void triggerApellidoEvento() {
		ListIterator li = listeners.listIterator();
		while (li.hasNext()) {
			EscuchandoEventos listener = (EscuchandoEventos) li.next();
			ModificandoEventos readerEvObj = new ModificandoEventos(this, this);
			(listener).cambioApellido(readerEvObj);
		}
	}

	private void triggerIdEvento() {
		ListIterator li = listeners.listIterator();
		while (li.hasNext()) {
			EscuchandoEventos listener = (EscuchandoEventos) li.next();
			ModificandoEventos readerEvObj = new ModificandoEventos(this, this);
			(listener).cambioId(readerEvObj);
		}
	}

	private void triggerEdadEvento() {
		ListIterator li = listeners.listIterator();
		while (li.hasNext()) {
			EscuchandoEventos listener = (EscuchandoEventos) li.next();
			ModificandoEventos readerEvObj = new ModificandoEventos(this, this);
			(listener).cambioEdad(readerEvObj);
		}
	}

	private void triggerEmpresaEvento() {
		ListIterator li = listeners.listIterator();
		while (li.hasNext()) {
			EscuchandoEventos listener = (EscuchandoEventos) li.next();
			ModificandoEventos readerEvObj = new ModificandoEventos(this, this);
			(listener).cambioEmpresa(readerEvObj);
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
