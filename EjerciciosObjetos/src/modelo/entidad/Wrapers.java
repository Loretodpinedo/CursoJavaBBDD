package modelo.entidad;

public class Wrapers {

	int entero = 3;

	Integer enteroI = new Integer(entero);// de primitivo a objeto boxing.
	int aEntero = enteroI.intValue();// de objeto a primitivo unboxing.

	String str = "100";
	int stri = Integer.parseInt(str);// conversion de String a int.

	// Envoltorios y autoboxing

	Integer a = new Integer(50);
	Integer b = new Integer("50");

	int enteroPrimitivo;
	Integer iEntero = enteroPrimitivo;// autoboxing.

	Float c = new Float(7.56f);
	Float d = new Float("7.56f");

	Character e = new Character('t');

	// Para el constructor boolean cuando el String es true (no es case sensitive)
	// será
	// true, cualquier otro valor sera false.

	Boolean f = new Boolean(false);// sera false.
	Boolean g = new Boolean("trUe");// sera true.
	Boolean h = new Boolean("No");// sera falso.

	// ValueOf metodo estatico que
	// crea un objeto de clase wraper o envoltorio
	// puede aceptar un String o un String y un parametro que indique base numerica.

	// Ver bien, no he conseguido entenderlo.

}
