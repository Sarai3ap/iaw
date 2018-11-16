package cj.datos;

import java.util.Scanner;

public class Ejercicio01 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Pedir 5 numeros. Mostrar la media de los positivos, media negativos y
		// cantidad de ceros

		double SumaPositivos = 0, sumaNegativos = 0;
		int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Nº: ");
			double numero = sc.nextDouble();

			if (numero > 0) {
				// sumapositivos = sumapositivos + numero;

				SumaPositivos += numero;
				contadorPositivos++;
			} else if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			} else {
				contadorCeros++;
			}

		}

		System.out.println("Media Positivos: " + (SumaPositivos / contadorPositivos));
		System.out.println("Media Negativos: " + (sumaNegativos / contadorNegativos));
		System.out.println("Media ceros: " + (contadorCeros));
	}
}
