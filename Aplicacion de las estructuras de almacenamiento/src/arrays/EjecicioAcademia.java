package arrays;

public class EjecicioAcademia {

	public static void main(String[] args) {

		/*
		 * 3 filas para representar al nivel básico, nivel medio y de perfeccionamiento
		 * 4 columnas para referenciar los idiomas (0 = Inglés, 1 = Francés, 2 = Alemán
		 * y 3 = Ruso).
		 */

		int[][] alumnosNivelIdioma = new int[3][4];// 3 filas y 4 columnas

		alumnosNivelIdioma[0][0] = 7;// primera fila primera columna
		alumnosNivelIdioma[0][1] = 14;// primera fila segunda columna
		alumnosNivelIdioma[0][2] = 8;
		alumnosNivelIdioma[0][3] = 20;
		alumnosNivelIdioma[1][0] = 26;
		alumnosNivelIdioma[1][1] = 0;
		alumnosNivelIdioma[1][2] = 12;
		alumnosNivelIdioma[1][3] = 5;
		alumnosNivelIdioma[2][0] = 3;
		alumnosNivelIdioma[2][1] = 95;
		alumnosNivelIdioma[2][2] = 47;
		alumnosNivelIdioma[2][3] = 1;

		System.out.println("En Ruso hay " + alumnosNivelIdioma[2][3] + " alumnes con nivel perfeccionamiento");

		int[][] alumnosNivelIdioma2 = { { 7, 14, 8, 20 }, { 26, 0, 12, 5 }, { 3, 95, 47, 1 } };

		String[][] nombreAlumno = new String[5][25];
		nombreAlumno[4][23] = "Loreto Diaz";

		System.out.println("El alumne numero 25 del curso se llama " + nombreAlumno[4][23]);
	}

}
