import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		
		System.out.println("Introduce una palabra");
		Scanner sc = new Scanner(System.in);
		
		String palabra = sc.nextLine();
		
		System.out.println("La palabra " + palabra + " tiene " + contarVocales(palabra) + " vocales.");
		
		sc.close();
	}
	
	public static int contarVocales (String palabra) {
		
		int vocales = 0;
		
		for (int i=0; i < palabra.length(); i++) {
		
			char letra = palabra.charAt(i);
			
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				
				vocales++;
			}		
		}
		
		return vocales;
	}

}
