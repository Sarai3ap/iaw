package src.ejerciciosCadenas.java;

public class EjercicioTres {

	public static void main(String[] args) {
		// Aplicar las operaciones básicas de modificación de Strings a la cadena “Uno
		// dosuno”, añadiendo caracteres al final, cambiando la “o” por “e” y pasándola
		// a mayúscula.

		String palabra ="Uno dosuno";
		
		StringBuffer sb = new StringBuffer(palabra);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
		
	}

}
