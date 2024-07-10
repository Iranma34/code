import java.util.Scanner;

/**
 * Este programa pide al usuario que introduzca una línea de texto
 * Después muestra:
 * - El número de palabras que había en la línea
 * - La primera palabra de la línea con todas las letras en MAYÚSCULAS.
 */

public class ContarPalabras{
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		// Pedir al usuario una línea de texto
		System.out.println("Intruzca una línea de texto: ");
		String unStr=teclado.nextLine();
		System.out.println("La frase que ha introducido es:  "+unStr);

		// Contar el número de palabras en esa línea de texto
		int numPalabras=0;
		for (int i=0; i<unStr.length(); i++){
			if (unStr.charAt(i) == ' ') {
				numPalabras=numPalabras+1;
			}
			if (i == unStr.length()-1){
				numPalabras=numPalabras+1;
			}
		}

		// Mostrar el número de palabras
		System.out.println("La frase contiene "+numPalabras+" palabras.");

		// Mostrar la primera palabra en MAYÚSCULAS
		int primerEspacio=unStr.indexOf(' ');
		String unTrozo=unStr.substring(0,primerEspacio);
        System.out.println(unTrozo.toUpperCase());

		teclado.close();
	}

}