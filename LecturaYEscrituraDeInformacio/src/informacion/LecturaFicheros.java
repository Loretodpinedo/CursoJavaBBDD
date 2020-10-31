package informacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LecturaFicheros {

	public static void main(String[] args) {
//Lectura de ficheros caracter a caracter con la clase FileReader y el metodo read().
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(new File("C:\\Users\\javie\\desktop\\Biografia.doc"));
			StringBuffer fileString = new StringBuffer();
			int chara = fileReader.read();
			while (chara != -1) {
				fileString.append((char) chara);
				chara = fileReader.read();

			}
			System.out.println(fileString.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// Lectura de ficheros de forma OPTIMA con la clase BufferedReader a traves de
		// FileReader
		// con el metodo readline() para leer el fichero linea a linea.

		FileReader fileReader2 = null;
		try {
			fileReader2 = new FileReader(new File("C:\\Users\\javie\\desktop\\Biografia.doc"));
			BufferedReader bufferedReader = new BufferedReader(fileReader2);
			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
