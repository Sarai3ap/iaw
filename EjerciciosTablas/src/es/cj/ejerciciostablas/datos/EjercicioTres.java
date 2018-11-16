package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioTres {

	// Leer tabla de n números y guardar en otra tabla los pares y en otra tabla los
	// impares

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca número:");
		int cuantos = sc.nextInt();
		int numeropar = 0;
		int numeroimpar =0;
		
		int tabla [] = new int [cuantos];
	
		for (int i = 0; i < cuantos; i++) {
			tabla[i]= new Random().nextInt(10)+1;			
		}
		for (int i = 0; i < cuantos; i++) {
			if(tabla[i]%2 == 1) {
				numeropar++;
				
			}
			else {
				numeroimpar++;
				 
			} 
		}
			int tabla2 []= new int [numeropar];
			int tabla3 [] = new int [numeroimpar];
			
			numeropar = 0;
			numeroimpar =0;
			for(int i = 0 ; i < cuantos ; i++) {
				if(tabla[i]%2==1) {
					tabla2[numeropar]=tabla[i];
					numeropar++;
				}
				else {
					tabla3[numeroimpar]=tabla[i];
					numeroimpar++;
				}
			}
			
			System.out.println(Arrays.toString(tabla));
			System.out.println(Arrays.toString(tabla2));
			System.out.println(Arrays.toString(tabla3));
		}
	}
	