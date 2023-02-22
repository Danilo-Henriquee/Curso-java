package switchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		// se o valor de x for igual a 1 ele executa esse bloco
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		// se nenhum valor satisfazer os cases acima ele chega
		// a esse bloco
		default:
			dia = "Valor inválido";
		}
		System.out.println("Seu dia é " + dia);
		sc.close();
	}

}
