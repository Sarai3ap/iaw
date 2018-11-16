package ejercicio_semanales;

import java.util.Scanner;

public class EjercicioUno {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Se solicita leer un número entero positivo y determinar si es un número de
		// 1,2,3 o 4 cifras.

		System.out.println("Número: ");
		int num1 = sc.nextInt();

		if (num1 <= 0)
			System.out.println("Número incorrecto");
		else if (num1 >= 1 && num1 <= 9)
			System.out.println("Número de una cifra");

		else if (num1 >= 10 && num1 <= 99)
			System.out.println("Número de dos cifras");

		else if (num1 >= 100 && num1 <= 999)
			System.out.println("Número de tres cifras");

		else if (num1 >= 1000 && num1 <= 9999)
			System.out.println("Número de cuatros cifras");

		else
			System.out.println("Número de 5 o más cifras");
	}

}
