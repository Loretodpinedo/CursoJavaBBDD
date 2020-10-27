package arrays;

public class Arrays {
	
	public static void main (String arg[]) {

	// Arrays UNIDIMENSIONALES

	// Declaracion de un array
	// tipoVariable[]nombreArray = new tipoVariable[dimension];

	int[] enteros = new int[5];// se crean 5 variable de tipo int del 0 al 4

	// Segunda manera de declarar un array
	// tipoVariable[]nombreArray;
	// nombreArray = new tipoVariable[dimension];

	 String[]palabros;
	 palabros = new String[10]; 
	 
	 palabros[0]="fruta";
	 palabros[1]="coco";
	 palabros[2]="pepino";

	// Inicializacion con valores propios
	int[] edades = { 45, 23, 11, 9 };// array de enteros de 4 elementos
	double[] estaturas = { 1.70, 1.63, 1.57 };
	float[] pesos = { 63.5f, 59.3f };
	String[] nombres = { "Javivi", "La Lore", "Maria de la O" };
	char[] sexo = {'b', 'm'};
	
	//boolean[] = {true,false};

	// Arrays MULTIDIMENSIONALES

	// Declaracion
	// tipoVariable[][]...[] nombreArray = new
	// tipoVAriable[dimension1][dimension2][dimensionN];
	int[][] matriz = new int[3][2];// seria una estructura con 3 filas y 2 columnas
	
	matriz[0][0]=1;//introduciendo valores en la matriz
	matriz[0][1]=2;
	
	
	// Declaracion2
	// tipoVariable[][]...[] nombreArray;
	// nombreArray = new tipoVAriable[dimension1][dimension2][dimensionN];
	 int[][] matriz2;
	matriz2 = new int[6][9];
	
	matriz2[0][0]=3;
	matriz2[0][1]=4;
	
	int filas = matriz2.length;
	int columnas = matriz2[0].length;
	int[][] matriz2Clonada = matriz2.clone();
	
	
	//Cargando directamente valores en la matriz
	int [][] matriz3= {{1,2},{3,4},{5,6}};//2,1 es la fila 1, 3,4 la fila2 y 5,6 la fila 3.los números (1, 3, 5) de cada una de las filas se corresponden a la primera columna, y los números (2, 4, 6) se corresponden con la segunda columna.  
}
}

