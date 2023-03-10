package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
//			Esta sendo utilizado HashSet pois ele é o mais
//			rapido e a ordem em que os elementos podem estar
//			não importa então é utilizado ele
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
//				o Set naturalmente barra o inserimento de 
//				elementos iguais então não havera repetição
//				de dados
				set.add(new LogEntry(username, moment));
				
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
