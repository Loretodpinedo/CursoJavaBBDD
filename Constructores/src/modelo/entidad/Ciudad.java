package modelo.entidad;

public class Ciudad {

	private String nombreCiudad;
	private double numeroHabitantes;
	private String localizacionAyuntamiento;
	private int temperaturaMedia;
	private boolean tienePlaya;

	// Constructor hecho a mano
	public Ciudad(String vNombreCiudad, double vNumeroHabitanes, String vLocalizacionAyuntamiento,
			int vTemperaturaMedia, boolean vTienePlaya) {
		nombreCiudad = "Madrid";
		numeroHabitantes = 2000.54;
		localizacionAyuntamiento = "Plaza de Cibeles";
		temperaturaMedia = 28;
		tienePlaya = false;
	}
//constructor hecho con el menú.
	/*
	 * public Ciudad(String nombreCiudad, double numeroHabitantes, String
	 * localizacionAyuntamiento, int temperaturaMedia, boolean tienePlaya) {
	 * super(); this.nombreCiudad = nombreCiudad; this.numeroHabitantes =
	 * numeroHabitantes; this.localizacionAyuntamiento = localizacionAyuntamiento;
	 * this.temperaturaMedia = temperaturaMedia; this.tienePlaya = tienePlaya; }
	 */

//Método para el valor de los atributos.
	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public double getNumeroHabitantes() {
		return numeroHabitantes;
	}

	public String getLocalizacionAyuntamiento() {
		return localizacionAyuntamiento;
	}

	public int getTemperaturaMedia() {
		return temperaturaMedia;
	}
	// public boolean getTienePlaya() {return tienePlaya;}

	// al generar geter y seter solo me hace el seter

	public void setTienePlaya(boolean tienePlaya) {
		this.tienePlaya = tienePlaya;
	}

//is?
	public boolean isTienePlaya() {
		return tienePlaya;
	}

}
