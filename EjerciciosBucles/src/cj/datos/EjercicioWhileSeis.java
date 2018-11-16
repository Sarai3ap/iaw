package cj.datos;

import java.util.Scanner;

public class EjercicioWhileSeis {

	private static Scanner sc = new Scanner(System.in);
	
	// Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10. Además, solicite al usuario que tabla quiere mostrar
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		for (int i = 1; i <= 10 ; i++) {
				System.out.println("Tabla del número: " + i);
			for (int j = 1; j <=10 ; j++) {
					int multiplicacion= i*j;
				System.out.println(i + "*" + j + "= "+ multiplicacion);
			}
			
		} {
			System.out.println();
			
		}
		
	}
}
