package src.ejerciciosCadenas.java;

public class EjercicioTres {

	public static void main(String[] args) {
		// Aplicar las operaciones b�sicas de modificaci�n de Strings a la cadena �Uno
		// dosuno�, a�adiendo caracteres al final, cambiando la �o� por �e� y pas�ndola
		// a may�scula.

		String palabra ="Uno dosuno";
		
		StringBuffer sb = new StringBuffer(palabra);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
		
	}

}
