import java.util.Scanner;

public class ReemplazarPalabraEnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)
				;
		String[] frutas = {"platano", "manzana", "uva", "melocoton", "manzana"};
		
		System.out.println("Ingresa nombre de fruta a reemplazar");
		String reemplazada = sc.nextLine().toLowerCase();
		
		System.out.println("Ahora elige la fruta que quieres añadir");
		String nuevaFruta = sc.nextLine().toLowerCase();
		
		reemplazarFruta(frutas, nuevaFruta, reemplazada);
		
		System.out.println("Ahora vamos a eleminar una fruta");
		
		System.out.println("Elige fruta a eliminar");
		String eliminada = sc.nextLine().toLowerCase();
		
		String[] frutasNuevo = eliminarFruta(frutas, eliminada);
		
		System.out.println("El array ahora es: ");
		
		for (int i = 0; i < frutasNuevo.length; i++) {
		    System.out.print(frutasNuevo[i] + " ");
		}
			
		sc.close();
	} 
	
	public static void reemplazarFruta(String[]frutas, String nuevaFruta, String reemplazada) {
		
		int cantReemplazo = 0;
	
		for (int i = 0; i < frutas.length; i++) {
			
			if (frutas[i].equals(reemplazada)) {
				
				frutas[i] = nuevaFruta;
				 cantReemplazo++;	
			}	
		}
		
		if (cantReemplazo > 0) {
			
			System.out.println("La fruta " + reemplazada + " a sido reemplazada por " + nuevaFruta + " " + cantReemplazo + " veces");
			
		} else {
			System.out.println("No se encontró ninguna fruta para reeemplazar");
		}	
	}
	
	public static String[] eliminarFruta(String[]frutas, String eliminada) {
		
		int cantEliminadas = 0;
		
		for (int i = 0; i < frutas.length; i++) {
			
			if (frutas[i].equals(eliminada)) {
				
				cantEliminadas++;
			}
		}
		
		String[] frutasNuevo = new String[frutas.length - cantEliminadas];
		
		int j = 0;
		
		for ( int i = 0; i < frutas.length; i++) {
			
			if (!frutas[i].equals(eliminada)) {
				
				frutasNuevo[j] = frutas[i];
				
				j++;
			}
		}
				
	    if (cantEliminadas > 0) {
	    	
	        System.out.println("La fruta " + eliminada + " ha sido eliminada " + cantEliminadas + " veces");
	        
	    } else {
	        System.out.println("No se encontró la fruta " + eliminada);
	    }

	    return frutasNuevo;
	}
}
