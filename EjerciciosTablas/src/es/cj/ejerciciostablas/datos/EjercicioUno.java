package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

public class EjercicioUno {

	//Leer n números enteros, guardarlos en la tabla y mostrar la media de los positivos, media negativos
	//y el número de ceros

	private static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		System.out.println("Cantidad: ");
		int cuanto = sc.nextInt();

		int tabla [] = new int [cuanto];
		
		double SumaP = 0, SumaN = 0, ContP = 0, ContN = 0, ContC = 0;
		
		for (int i = 0; i < cuanto; i++) {
			
			System.out.println("Numero " + (i+1) + ":");
			
			tabla[i]= sc.nextInt();
			if(tabla[i]>0) {
				SumaP = tabla[i] + SumaP;
				ContP++;
			}
			else if(tabla[i]<0) {
				SumaN = tabla[i] + SumaN;
				ContN++;
			}
			else {
				ContC++;
			}
		}
		
		SumaP= SumaP/ContP;
		
		System.out.println("Media positivos: " + SumaP);
	
		SumaN= SumaN/ContN;
		
		System.out.println("Media negativos: " + SumaN);
		
		
		System.out.println("Media ceros: " + ContC);
	}

}
