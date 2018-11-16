package src.ejerciciosCadenas.java;

import java.util.Scanner;

public class EjercicioSiete {
	private static Scanner sc = new Scanner(System.in);	

	// Una palabra se dice abecedaria si las letras que la forman se encuentran en
	// orden alfabético si son leídas de izquierda a derecha. Por ejemplo, las
	// siguientes palabras cumplen con ser abecedarias: amor, filo, chintz, luz,
	// dinos. Escriba un método que permita determinar si una palabra es abecedaria.
	// El método debe recibir un string como parámetro y retorna verdadero en caso
	// que la palabra sea abecedaria, y falso en caso contrario.

	public static void main(String[] args) {
		
		System.out.println("Introduzca la palabra: ");
		String cadena  = sc.next();
		char[]  tabla = cadena.toCharArray();
		boolean verdadero = true;
		int posicion = 0 ;

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] >= 97 && tabla[i] <= 122) {
				String numero2 = String.valueOf(tabla[i]);
				int cadena2 = numero2.charAt(0);

				if (cadena2 < posicion) {
					 verdadero = false;
					
				}else {
					verdadero = true;

				}
				
				posicion = cadena2;
			}
		
		}
		if(verdadero == true ) {
			System.out.println("Es una palabra abecedaria");
		}else {
			System.out.println("No es una palabra abecedaria");

		}
			}
}
