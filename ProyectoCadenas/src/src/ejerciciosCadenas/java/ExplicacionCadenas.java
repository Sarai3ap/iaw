package src.ejerciciosCadenas.java;

import java.util.Arrays;

public class ExplicacionCadenas {

	public static void main(String[] args) {
		// String cadena = new String("Hola");
		String cadena1 = "Hola";
		String cadena2 = "HOLA";
		
		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Iguales");			
		}
		else
			System.out.println("Distintas");
		
		cadena1 = cadena1.concat(cadena2);
		System.out.println(cadena1);
		
		if (cadena1.contains("la")) {
			System.out.println("Lo tiene");
		}
		
		System.out.println(cadena1.toLowerCase().lastIndexOf("a"));
		
		if (cadena1.equals("") || cadena1.length() == 0 || cadena1.isEmpty()) {
			System.out.println("Cadena vacia");
		}
		
		cadena1 = cadena1.replace("h", "P");
		System.out.println(cadena1);
		
		System.out.println(cadena1.substring(0, 3));
		
		char [] letras = cadena1.toCharArray();
		System.out.println(Arrays.toString(letras));
		
		String usuario = " javiyo ";
		usuario = usuario.trim();
		System.out.println(usuario);
		
		StringBuffer sb = new StringBuffer(cadena1);
	
		sb.append("adios");
		System.out.println(sb.toString());
		
		sb.insert(0, "Inicio");
		System.out.println(sb.toString());
	
		sb.deleteCharAt(3);
		sb.replace(0, 3, "avi�n");
		System.out.println(sb.toString());	
	
		sb.reverse();
		
		String frase = "hola que tal 12;76;1";
		String [] palabras = frase.split(" ");
			for (int i = 0; i < palabras.length; i++) {
				System.out.println(palabras[i]);
			}
		String [] numeros = palabras [2].split(";");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
}
	}
