package src.ejerciciosCadenas.java;

import java.util.Random;

public class EjercicioCinco {

	public static void main(String[] args) {
		// Dada una cadena y un código entero aleatorio. Generar una cadena cifrada
		// donde cada carácter se sustituye por el carácter situado n posiciones después
		// del mismo. Debe empezar por la letra A si la suma del carácter con el codigo
		// es mayor que Z.

		int numero = new Random().nextInt(10) + 1;
		String cadena = "h";
		char[] tabla = cadena.toCharArray();
		int sumatorio = 0;

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] >= 65 && tabla[i] <= 90 || tabla[i] >= 97 && tabla[i] <= 122) {
				String numero2 = String.valueOf(tabla[i]);
				int cadena2 = numero2.charAt(0);

				if (cadena2 > 90 && cadena2 <= 96) {
					 sumatorio = numero + 65;
					
				} else if (cadena2 > 122) {
					 sumatorio = numero + 97;
					

				} else {
					sumatorio = cadena2 + numero;

				}
				char letra = (char) sumatorio;
				System.out.print(letra);
				sumatorio = 0;
			}
		}
	}

}
