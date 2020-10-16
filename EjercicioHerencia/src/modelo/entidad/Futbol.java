package modelo.entidad;

public class Futbol extends Deportes {//asi hereda de deportes
	
	//Indicamos que vamos a sobrescribir metodos
	@Override 
	String getName() {
		return "Futbol";
		
	}
}
