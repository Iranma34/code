import java.util.Scanner;

/**
 * Los ciudadanos con nacionalidad española se identifican con un número (NIF)
 * y una letra que figuran en su DNI.
 * Esta letra se calcula de la siguiente forma:
 * 		1º Dividimos el número de identificación entre 23
 * 		2º El resto de la división (módulo) es un numero entre 0 y 22
 * 		3º Buscamos la letra en la posición indicada por el módulo
 * 		   dentro de una cadena de letras pre-establecida
 * Este programa calcula la letra correspondiente a cada DNI a partir de un NIF
 * */

public class LetraNIF {
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

		System.out.print("Introduce los 8 digitos de tu NIF: ");
		int nif = kb.nextInt();
		kb.nextLine();

		int posicion = nif % 23;

		char letra = letras.charAt(posicion);
		System.out.println("La letra de tu DNI es: "+letra);

		kb.close();
	}
}