package modelo.entidad;

public class Deportes {

	// Este metodo se sobreecribira en las clases que hereden de esta.
	String getName() {
		return "Deportes genericos";
	}

	// Este metodo nos dira a que deporte nos referimos

	void getNameOfTeam() {
System.out.println("Nos referimos a " + getName());
	}
}
