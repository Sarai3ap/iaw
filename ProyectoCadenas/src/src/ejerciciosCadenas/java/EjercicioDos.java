package src.ejerciciosCadenas.java;

public class EjercicioDos {

	public static void main(String[] args) {
		// Realizar un programa que reciba dos cadenas de caracteres y cuente el número
		// de apariciones de la primera en la segunda

		String palabra = "Hola";
		String frase = "Hola que tal. Hola que pasa. Hola";

		int contador = 0;
		int posicion = frase.indexOf(palabra);

		if (posicion != 1) {
			contador++;
			while (posicion != -1) {
				posicion = frase.indexOf(palabra, posicion + 1);
				if (posicion != -1)
					contador++;
			}

		}
System.out.println(contador);
	}
}
