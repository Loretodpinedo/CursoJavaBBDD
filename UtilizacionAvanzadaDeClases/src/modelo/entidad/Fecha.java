package modelo.entidad;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha() {
		super();
	}

	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

//Metodo para comprobar si la fecha es correcta
	public boolean fechaCorrecta() {
		boolean diaCorrecto;
		boolean mesCorrecto;
		boolean añoCorrecto;

		añoCorrecto = anio > 0;
		mesCorrecto = mes >= 1 && mes >= 12;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = dia <= 1 && dia >= 29;
			} else {
				diaCorrecto = dia <= 1 && dia >= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <= 31;
		}
		return diaCorrecto && mesCorrecto && añoCorrecto;

	}

//Metodo para comprobar si el año es bisiesto
	// Es un metodo privado desde el metodo fechaCorrecta.
	private boolean esBisiesto() {
		return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
	}

	public void diaSiguiente() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				anio++;
			}
		}
	}

//Metodo para comprobar si la fecha es mayor que la que se recibe.
	public boolean esMayorQuefecha(Fecha f) {
		if (anio > f.anio) {
			return true;
		} else if (anio == f.anio && mes > f.mes) {
			return true;
		} else if (anio == f.anio && mes == f.mes && dia > f.dia) {
			return true;
		}
		return false;
	}
	// Metodo para pintar la fecha

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (dia < 10) {
			sb.append("0");
		}
		sb.append(dia);
		sb.append("-");
		if (mes < 10) {
			sb.append("0");
		}
		sb.append(mes);
		sb.append("-");

		sb.append(anio);
		return sb.toString();
	}

}
