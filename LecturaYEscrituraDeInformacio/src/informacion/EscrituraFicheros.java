package informacion;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscrituraFicheros {

	public static void main(String[] args) {
		//Clase BufferedWriter a partir de un objeto FileWriter utilizando el metodo append()
		//y newLine()
		//si el fichero no existe se crea para añadir dentro de un fichero existente se 
		//modifica el constructor
		BufferedWriter bufferedWriter = null;	
		try {
													//para que modifique el fichero ya existente
		FileWriter fileWriter = new FileWriter("C:\\Users\\javie\\desktop\\Biografia.doc", true);
		bufferedWriter = new BufferedWriter(fileWriter);
		for (int i = 0; i<10; i++) {
			bufferedWriter.append(Integer.toString(i));
			bufferedWriter.newLine();
		}		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bufferedWriter !=null) {
					bufferedWriter.close();
				}
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
