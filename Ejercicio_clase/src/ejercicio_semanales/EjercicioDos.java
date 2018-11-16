package ejercicio_semanales;

import java.util.Scanner;

public class EjercicioDos {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Un obrero necesita calcular su salario semanal,
		// el cual se obtiene de la siguiente manera:
		// Si trabaja 40 horas o menos se le paga 16€ por hora
		// Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras
		// 40 horas y 20€ por cada hora extra.

		System.out.println("Número de horas: ");
		int num1 = sc.nextInt();

		if (num1 <= 40) {
			double dinero = num1 * 16;
			System.out.print(dinero + "€");

		} else {
			double dinero = 40 * 16 + (num1 - 40) * 20;
			System.out.print(dinero + "€");
		}

	}

}
