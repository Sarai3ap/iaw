package src.ejerciciosCadenas.java;

import java.util.Scanner;

public class EjercicioNueve {
		private static Scanner sc = new Scanner(System.in);	

	public static void main(String[] args) {

		// Subcadena mayúscula. Crea un programa en Java que solicite al usuario dos
		// cadenas de caracteres y que devuelva la primera cadena, pero transformando en
		// mayúsculas la parte que coincide con la segunda cadena introducida. Por
		// ejemplo, si se introducen las cadenas “Este es mi amigo Juan” y “amigo”,
		// devolverá “Este es mi AMIGO Juan”.
		
		System.out.println("Introduzca la palabra: ");
		String cadena  = sc.next();
		System.out.println("Introduzca la palabra: ");
		String cadena2  = sc.next();
		char[]  tabla = cadena.toCharArray();
		
		for (int i = 0; i < tabla.length; i++) {
			
			
		}
	}

}
