package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		// para ler somente pastas/diretorios
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// para ler somente arquivos e não pastas/diretorios
		File[] files = path.listFiles(File::isFile);
		System.out.println("FOLDERS:");
		for (File file : files) {
			System.out.println(file);
		}
		
		/* para criar uma subpasta apartir de um diretorio passado
		 * 
		 * -primeiro argumento se passa o diretorio aonde sera criada
		 * 
		 * - segundo parametro o nome dessa pasta que sera criada
		 * 
		 * - depois a extensão .mkdir() para criar a pasta
		*/ 
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully " + success);
		
		sc.close();
	}
}
