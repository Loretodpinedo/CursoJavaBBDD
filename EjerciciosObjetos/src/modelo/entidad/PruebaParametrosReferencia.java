package modelo.entidad;

public class PruebaParametrosReferencia {

	public static void main(String[] args) {

		Persona p = new Persona();
		p.setNombre("Marta");
		System.out.println("El nombre antes del m�todo es " + p.getNombre());
		System.out.println("Llamamos al m�todo para que cambie el valor ");
		cambiarNombre(p);
		System.out.println("Despues del m�todo el nombre es " + p.getNombre());

	}

	private static void cambiarNombre(Persona p) {
		p.setNombre("Maria");
	}
}

class Persona {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
