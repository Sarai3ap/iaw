package src.ejerciciosCadenas.java;

public class EjercicioCuatro {

	public static void main(String[] args) {
		// Escriba un método que, dada una cadena de caracteres, de la suma de todos los
		// dígitos que hay en ella. Por ejemplo, si la cadena es abc12de3f4, dará como
		// resultado 10. (interger.ponseInt(x)

		String frase = "abc12de3f4";
		char[] tabla = frase.toCharArray();
		int sumatorio = 0;

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] >= 48 && tabla[i] <= 59) {
				String suma = String.valueOf(tabla[i]);
				sumatorio = sumatorio + Integer.parseInt(suma);
				System.out.println("Número");
			} else {
				System.out.println("Letra");
			}

		}
		System.out.println(sumatorio);
	}

}
