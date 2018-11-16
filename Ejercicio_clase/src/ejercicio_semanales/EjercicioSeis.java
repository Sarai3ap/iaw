package ejercicio_semanales;

import java.util.Arrays;
import java.util.Random;

public class EjercicioSeis {

		// Rellena una tabla de 10 números (valores aleatorios del 1 al 6). Reliza una
		// función que devuelva el número que más se repite.
		private static int tabla [] = new int[10];
		private static int tabla2 [] = new int[7];
		private static int mayor=0, posicion=0;
		public static void main(String[] args) {
			
			iniciartabla();
			numerorepite();
			repetido();
			System.out.println(Arrays.toString(tabla));
			System.out.println(Arrays.toString(tabla2));
			
}
			
		private static void repetido() {
			for (int i = 0; i < tabla2.length; i++) {
				if(tabla2[i] > mayor) {
					mayor=tabla2[i];
					posicion = i;
				}
			}
		System.out.println("El numero que más se repite es: " + posicion);
		}

		private static void numerorepite() {
			for (int i = 0; i < tabla.length; i++) {
				for (int j = 0; j < tabla2.length; j++) {
					if(tabla[i] == j) {
						tabla2[j]++;
					}
				}
			}
			
		}

		private static void iniciartabla() {
			for(int i = 0; i < tabla.length; i++) {
				tabla[i] = new Random().nextInt(6)+1;
			
		}
	}
}



