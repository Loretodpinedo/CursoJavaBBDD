package colecciones;

import java.util.HashMap;
import java.util.Map;

public class ProgramaTres {

	public static void main(String[] args) {
		Map<Integer, Persona> map = new HashMap<Integer, Persona>();

		Persona persona = new Persona(1, "Maria de la O", 198);
		map.put(1, persona);
		persona = new Persona(3, "Isaac Gusi Luz", 176);
		map.put(3, persona);
		persona = new Persona(2, "Javier Precioso", 169);
		map.put(2, persona);
		persona = new Persona(5, "Lore Guapa a Rabiar", 169);
		map.put(5, persona);
		persona = new Persona(10, "Anita Dinamita", 169);
		map.put(10, persona);
		persona.agendaTelefono.put("Movil", "6711111111");
		persona.agendaTelefono.put("Casa", "9122222226");
		persona.agendaTelefono.put("Almeria", "98888161616");
		persona = new Persona(9, "Ana Maria Iginia Africa", 169);
		persona.agendaTelefono.put("Movil", "6789162561");
		persona.agendaTelefono.put("Casa", "91265165646");
		persona.agendaTelefono.put("Muñas", "96564161616");
		map.put(9, persona);

		System.out.println(map);
		System.out.println(persona.agendaTelefono.get("Casa"));
	}

}
