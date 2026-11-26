

	import java.util.Scanner;

	public class ContarPalabras {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce una letra:");
			
			char letra = sc.nextLine().toLowerCase().charAt(0);
			
			int resultado = contarPalabras(letra);
			
			System.out.println("Hay " + resultado + " palabra(s) con esa letra.");
			
			sc.close();
		}
		
		public static int contarPalabras(char letra) {
			
			String[] palabras = {"azul", "molusco", "luffy", "malo", "mesa"};
			
			int cantidad = 0;
			
			for (int i=0; i < palabras.length; i++) {
				
				String palabra = palabras[i];
				
				palabra.charAt(0);
				
				if (palabra.charAt(0) == letra) {
					
					cantidad++;
				}
			}
			return cantidad;
		}

	}
