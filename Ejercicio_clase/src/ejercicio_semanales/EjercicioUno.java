package ejercicio_semanales;

import java.util.Scanner;

public class EjercicioUno {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Se solicita leer un n�mero entero positivo y determinar si es un n�mero de
		// 1,2,3 o 4 cifras.

		System.out.println("N�mero: ");
		int num1 = sc.nextInt();

		if (num1 <= 0)
			System.out.println("N�mero incorrecto");
		else if (num1 >= 1 && num1 <= 9)
			System.out.println("N�mero de una cifra");

		else if (num1 >= 10 && num1 <= 99)
			System.out.println("N�mero de dos cifras");

		else if (num1 >= 100 && num1 <= 999)
			System.out.println("N�mero de tres cifras");

		else if (num1 >= 1000 && num1 <= 9999)
			System.out.println("N�mero de cuatros cifras");

		else
			System.out.println("N�mero de 5 o m�s cifras");
	}

}
