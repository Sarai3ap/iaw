package cj.datos;

import java.util.Scanner;

public class EjercicioWhileSeis {

	private static Scanner sc = new Scanner(System.in);
	
	// Dise�e una aplicaci�n que muestre las tablas de multiplicar del 1 al 10. Adem�s, solicite al usuario que tabla quiere mostrar
	
	public static void main(String[] args) {
		System.out.println("N�: ");
		for (int i = 1; i <= 10 ; i++) {
				System.out.println("Tabla del n�mero: " + i);
			for (int j = 1; j <=10 ; j++) {
					int multiplicacion= i*j;
				System.out.println(i + "*" + j + "= "+ multiplicacion);
			}
			
		} {
			System.out.println();
			
		}
		
	}
}
