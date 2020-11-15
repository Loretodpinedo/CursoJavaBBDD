package testEventos;

import java.util.EventObject;

public class ModificandoEventos extends EventObject {

	Empresa empresa;

	public ModificandoEventos(Object source, Empresa empresa1) {
		super(source);
		empresa = empresa1;
	}

}
