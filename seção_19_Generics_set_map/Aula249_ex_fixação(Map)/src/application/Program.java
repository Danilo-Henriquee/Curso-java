package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);
				
				if (map.containsKey(name)) {
					int votesExist = votes;
					map.put(name, votesExist + map.get(name));
				}
				else {
					map.put(name, votes);
				}
				
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for (String name : map.keySet()) {
			System.out.println(name + ": " + map.get(name));
		}
		
		sc.close();
	}

}
