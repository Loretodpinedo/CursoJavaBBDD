package arrays;

public class ArrayDemo {

	// Crea un array con 10 numeros y saca sus valores

	public static void main(String[] args) {
		// Declaracion del array
		int[] unArray;

		// Reservamos memoria para 10 enteros
		unArray = new int[10];

		// Iniciamos los elementos del array
		unArray[0] = 100;// 1º elemento
		unArray[1] = 200;// 2º elemento
		unArray[2] = 300;
		unArray[3] = 400;
		unArray[4] = 500;
		unArray[5] = 600;
		unArray[6] = 700;
		unArray[7] = 800;
		unArray[8] = 900;
		unArray[9] = 1000;
		// sacamos los indices del arry
		System.out.println("El numero en la primera posicion es " + unArray[0]);
		System.out.println("El numero en la segunda posicion es " + unArray[1]);
		System.out.println("El numero en la tercera posicion es " + unArray[2]);
		System.out.println("El numero en la cuatra posicion es " + unArray[3]);
		System.out.println("El numero en la quinta posicion es " + unArray[4]);
		System.out.println("El numero en la sexta posicion es " + unArray[5]);
		System.out.println("El numero en la setima posicion es " + unArray[6]);
		System.out.println("El numero en la octava posicion es " + unArray[7]);
		System.out.println("El numero en la novena posicion es " + unArray[8]);
		System.out.println("El numero en la decima posicion es " + unArray[9]);
	}

}
