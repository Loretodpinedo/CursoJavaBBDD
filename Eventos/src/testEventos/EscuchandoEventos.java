package testEventos;

import java.util.EventListener;

//changeEventListener
public interface EscuchandoEventos extends EventListener {

	public abstract void cambioId(ModificandoEventos ev);

	public abstract void cambioNombre(ModificandoEventos ev);

	public abstract void cambioApellido(ModificandoEventos ev);

	public abstract void cambioEdad(ModificandoEventos ev);

	public abstract void cambioEmpresa(ModificandoEventos ev);
}
