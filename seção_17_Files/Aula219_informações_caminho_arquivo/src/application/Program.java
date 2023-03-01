package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// pegando o nome do arquivo
		System.out.println("getName: " + path.getName());
		
		// pegando o diretorio em que o arquivo está
		System.out.println("getParent " + path.getParent());
		
		// pega o diretorio completo do arquivo inclusive seu nome
		System.out.println("getPath " + path.getPath());
		
		sc.close();
	}

}
