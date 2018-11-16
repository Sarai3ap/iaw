package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Crear una tabla de n números y desplazarla una posición hacia abajo, es
		// decir, el primero pasa a ser el segundo, el segundo pasa a ser el tercero y
		// así sucesivamente. El último pasa a ser el primero

		System.out.println("Introduzca número:");
		int numeros = sc.nextInt();
		int tabla1 [] = new int [numeros];
		int tabla2 [] = new int [numeros];
		for (int i = 0; i < numeros; i++) {
			tabla1[i]= new Random().nextInt(10)+1;			
		}
		for (int i = 0; i < numeros; i++) {
			if(i== numeros -1) {
				 tabla2[0]=tabla1[i];
			}else {
				tabla2[i+ 1]=tabla1[i];
			}
		}
		
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
	}

}
