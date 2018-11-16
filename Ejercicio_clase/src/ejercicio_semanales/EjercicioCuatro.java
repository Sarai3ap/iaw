package ejercicio_semanales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioCuatro {
	
	private static Scanner sc = new Scanner(System.in);
	
	//Rellena una tabla de 20 números positivos de manera aleatoria. Pida números al usuario 
	//(0 para finalizar el bucle) y muestra cuántas veces se repite el número en la tabla y cuál es la 
	//primera posición en la que aparece (-1 si no se encuentra en la tabla)

	private static int [] numeros = new int [20];
	
	private static int veces = 0, posicion = -1;
	
	public static void main(String[] args) {
		rellenarTabla();
		mostrarTabla();
		int num=0;
		
		do {
			System.out.println("Nª= ");
			num= sc.nextInt();
			if(num>0) {
				calcularVecesPosicion(num);
				System.out.println("Veces: " + veces);
				System.out.println("Posicion: " + posicion);
				veces= 0;
				posicion= -1;
			}
		}
		while (num !=0);
			System.out.println("FIN");
			
		
}

	private static void calcularVecesPosicion(int num) {
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == num) {
				veces++;
				if (veces ==1) {
					posicion = i;
				}
			}
			
		}
		
	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(numeros));
		}
		

	private static void rellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
		
	}
}
