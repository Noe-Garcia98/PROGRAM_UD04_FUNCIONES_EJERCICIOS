import java.util.Scanner;

public class NumeroMayorDeTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BUSCANDO EL NÚMERO MAYOR");
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();
		
		System.out.println("Introduce el tercer número");
		int num3 = sc.nextInt();
		
		int numMayor = encontrarMayor(num1, num2, num3);
		
		System.out.println("El número mayor es: " + numMayor);
		
		sc.close();

	}
	
	public static int encontrarMayor(int num1, int num2, int num3) {
		
		if (num1 >= num2 && num1 >= num3) {
			
			return num1;
			
		} else if (num2 >= num1 && num2 >= num3) {
			
			return num2;
		} else {
			return num3;
		}

	}

}
