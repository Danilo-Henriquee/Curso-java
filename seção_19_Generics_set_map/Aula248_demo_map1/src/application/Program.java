package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
//		a chave phone ja existi, porém se alterar o valor, o valor dessa chave
//		ira ser modificado para o novo valor, Map só não aceita repetições.
		cookies.put("phone", "99771133");
		
//		ira retornar true ou false se esse conjunto ja possui uma chave com
//		o nome passado no argumento
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
//		ira ser retornado o valor que possui a chave 'phone'
		System.out.println("Phone number: " + cookies.get("phone"));
		
//		Quando uma chave não existe no conjunto ele ira retornar o valor
//		null com o nome da chave passada que no caso não existe
		System.out.println("Email: " + cookies.get("email"));
		
//		Para mostrar o tamanho da coleção
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
//		cookies.keySet irá retornar a chave do valor 	
//		ou seja username, email e phone
		for (String key : cookies.keySet()) {
//			cookies.get() ele pega o valor usando a chave
//			então ele vai retornar o valor
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
