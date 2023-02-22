package metodosParaStrings;

public class Main {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG";
		
		// Para transformar todos os caracteres em minusculas
			String s1 = original.toLowerCase();
			
		// Para transformar todos os caracteres em maiusculas
			String s2 = original.toUpperCase();
			
		// Para removers os espaços nos cantos da string
			String s3 = original.trim();
			
		// Ele vai formar uma nova String apartir do indice que for passado como argumento
			String s04 = original.substring(2);
		
		// Passando dois argumentos consegue se colocar um inicio e um limite
			String s05 = original.substring(4, 9);
		
		// Ele vai trocar todos os a´s por x
			String s06 = original.replace('a', 'x');
			String s07 = original.replace("abc", "xy");
		
		// Para descobrir qual a primeira ocorrencia dos caracteres passados
			int i1 = original.indexOf("bc");
		
		// Para descobrir qual a ultima ocorrencia dos caracteres passados
			int i2 = original.lastIndexOf("bc");
			
		// Para coletar Strings que estão separadas por qualquer caracter
			String words = "Potato Apple Lemon Orange";
			
			String[] vect = words.split(" ");
			
			String potato = vect[0];
			String apple = vect[1];
			String lemon = vect[2];
		// Sera coletado as Strings que estão separadas por espaço e serão
		// introduzidas em uma array ou vetor
	}

}
