package colecciones;

public class Gente implements Comparable<Gente> {

	private int idGente;
	private int altura;
	private String nombre;

	@Override
	public String toString() {
		return "Gente [idGente=" + idGente + ", altura=" + altura + ", nombre=" + nombre + "]";
	}

	public Gente(int idGente, int altura, String nombre) {
		super();
		this.idGente = idGente;
		this.altura = altura;
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Gente o) {

		return this.altura - o.altura;
	}

	@Override
	public int hashCode() {

		return altura + nombre.hashCode() + idGente;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gente other = (Gente) obj;
		if (altura != other.altura)
			return false;
		if (idGente != other.idGente)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
