package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		/* Existem duas maneiras de se escrever em um arquivo
		 * 
		 * - new FileWriter(path) ele cria um arquivo ou
		 * recria se ja existir um arquivo com esse nome 
		 * 
		 * - new FileWriter(path, true) ele acrescenta a um
		 * arquivo ja existente não substituindo seu conteudo 
		*/
		
		String[] lines = new String[] {"Good morning", "Good afernoon", "Good Night"};
		
		String path = "C:\\teste aula java\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
