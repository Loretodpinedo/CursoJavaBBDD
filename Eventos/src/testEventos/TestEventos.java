package testEventos;

public class TestEventos {

	static EscuchandoEventos evento = new EscuchandoEventos() {

		// Lo que va a ocurrir cada vez que se produzca un eventodeterminado
		@Override
		public void cambioNombre(ModificandoEventos ev) {
			System.out.println("Se ha cambiado el nombre");

		}

		@Override
		public void cambioId(ModificandoEventos ev) {
			System.out.println("Se ha cambiado el Id");

		}

		@Override
		public void cambioEmpresa(ModificandoEventos ev) {
			System.out.println("Se ha cambiado la empresa");

		}

		@Override
		public void cambioEdad(ModificandoEventos ev) {
			System.out.println("Se ha cambiado la edad");

		}

		@Override
		public void cambioApellido(ModificandoEventos ev) {
			System.out.println("Se ha cambiado el apellido");

		}
	};

	public static void main(String[] args) {

		Empresa empresa = new Empresa("1569498-5", "Loreto", "Diaz", 44, "De la solidaridad");
		System.out.println("Nombre completo " + empresa.getNombre() + " " + empresa.getApellido());

		empresa.añadirEventosALaLista(evento);

		// Cambio los valore iniciales
		empresa.setId("458997646-l");
		empresa.setNombre("Javier");
		empresa.setApellido("Serrano");
		empresa.setEdad(31);
		empresa.setEmpresa("Solidaridad");

	}

}
