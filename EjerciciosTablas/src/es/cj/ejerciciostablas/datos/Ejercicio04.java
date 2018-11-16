package es.cj.ejerciciostablas.datos;

	import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;

	public class Ejercicio04 {
		// Leer 2 tablas de n números y mezclarla en una tercera tabla de la
		// siguiente forma:
		// 1º de A, 1º de B, 2º de A, 2º de B, 3º de A, 3º de B,..
		private static Scanner sc = new Scanner(System.in);	

		public static void main(String[] args) {
			int tabla1[], tabla2[], tabla3[];
			int i,j;
			System.out.println("Cantidad de numeros de las tablas: ");
			int cuantos = sc.nextInt();
			tabla1=new int[cuantos];
			tabla2=new int[cuantos];
			// la tabla c tendrá que tener el doble de tamaño que a y b.
			tabla3 = new int [cuantos*2];
			for (int i2 = 0; i2 < cuantos; i2++) {
				tabla1[i2] = new Random().nextInt(10) + 1;
			}

			for (int i2 = 0; i2 < cuantos; i2++) {
				tabla2[i2] = new Random().nextInt(10) + 1;
			}

			j=0;
			for (i=0;i<cuantos;i++){
			tabla3[j]=tabla1[i];
			j++;
			tabla3[j]=tabla2[i];
			j++;
			}
			
			System.out.println(Arrays.toString(tabla1));
			System.out.println(Arrays.toString(tabla2));
			System.out.println("La tabla c queda: ");
			System.out.println(Arrays.toString(tabla3));
			
			}

	}
