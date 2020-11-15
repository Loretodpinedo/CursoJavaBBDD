package modelo.entidad;

public class Empleada {

	private int idEmpleada;
	private String dniEmpleada;
	private String nombre;
	private String apellido;
	private double salario;

	@Override
	public String toString() {
		return "Empleadas:\ndniEmpleada: " + dniEmpleada + ", nombre: " + nombre
				+ ", apellido: " + apellido + ", salario: " + salario+"\n";
	}

	public int getIdEmpleada() {
		return idEmpleada;
	}

	public void setIdEmpleada(int idEmpleada) {
		this.idEmpleada = idEmpleada;
	}

	public String getDniEmpleada() {
		return dniEmpleada;
	}

	public void setDniEmpleada(String dniEmpleada) {
		this.dniEmpleada = dniEmpleada;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
