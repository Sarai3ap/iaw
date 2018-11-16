package src.ejerciciosCadenas.java;

public class EjercicioSeis {
	public static void main(String[] args) {

		System.out.println(pasarMorse("hola"));

	}

	public static String pasarMorse(String cadena) {

		// Dada una cadena, cree dos métodos para pasar la cadena a código Morse y
		// volver a recuperar el contenido de la cadena.

		String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", // a-i
				".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", // j-q
				".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".......", // r-" "
				".-", "-...", "-.-.", "-..", ".", "..-.", "--.", // A-G
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", // H-P
				"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", // Q-X
				"-.--", "--..", "......."}; // Y-Z

		String abecedario = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		int posicion = 0;
		String cadena2 = "";
		for (int i = 0; i < cadena.length(); i++) {
			posicion = abecedario.indexOf(cadena.charAt(i));
			cadena2 += morse[posicion] + " ";

		}
		System.out.print("Código normal: " + cadena);
		System.out.print(" ; Código morse: ");
		return cadena2;

	}
}
