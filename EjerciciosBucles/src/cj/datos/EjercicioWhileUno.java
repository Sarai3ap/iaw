package cj.datos;

import java.util.Scanner;

public class EjercicioWhileUno {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		double numero = sc.nextDouble();
		
		//Muestre y calcule el producto de los n primeros números impares
	// 1 opcion 
		if(numero>=1) {
			

			double multi=1;
			for (int i = 1; i <= numero ; i+=2) {
				multi=multi*i;
			}
			System.out.println(multi);
		}
		else {
			System.out.println("Número par");
		}	
	}
	
}


