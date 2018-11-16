package cj.datos;
import java.util.Scanner;

public class Explicacion {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
	int numero=sc.nextInt();
		
		//do while
//		int numero;
//		do {
//	System.out.println("Nº: ");
//	numero=sc.nextInt();
//		} while(numero < 0);
		
		
		// while
		//while (numero >=0) {
			//System.out.println(numero);
			//numero--;
		//}
		
		// for
		for (int i = numero; i >= 0; i--) {
			System.out.println(numero);
		}
		
	} 
}

