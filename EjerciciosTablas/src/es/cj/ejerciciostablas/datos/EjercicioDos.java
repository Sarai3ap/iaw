package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioDos {
	private static Scanner sc = new Scanner(System.in);

	//Leer n n�meros ordenados crecientemente. Pedir al usuario un n�mero y buscarlo en la tabla. 
	//Se debe mostrar la posici�n en la que se encuentra. Si no est�, indicarlo con un mensaje

	public static void main(String[] args) {
		System.out.println("Cantidad: ");
		int numero = sc.nextInt();

		int tabla [] = new int [numero];
		
			Arrays.sort(tabla);
			
			for (int i = 0; i < tabla.length; i++) {
			
			tabla[i]= new Random().nextInt(5);
			System.out.println(tabla);
			}
			

		
	}
	
}
