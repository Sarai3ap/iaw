package cj.datos;

import java.util.Scanner;

public class EjercicioWhileCinco {

	// Pedir un número y calcular su factorial
	
	private static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		int multi = 1;
		for (int i =1; i <= numero; i++) {
			multi = multi * i;
		}
		
System.out.println(multi);
	}

}
