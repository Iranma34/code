import java.util.Scanner;

/**
 * Este programa lee un text introducido por el usuario
 * A continuacion lo escribe en pantalla con todos los caracteres en orden inverso
 * Si por ejemplo el usuario introduce la palabra "Hotel"
 * El programa escribirá:
 * letoh
 * */
public class Palindromo{

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args){
		do{
		System.out.println("Introduzca el texto");
		}while String texto=sc.nextLine();
	}

	// Este método no recibe ningun parámetro
	// Devuelve un 'String'
	String textoInvertido=new StringB
	uilder(texto).reverse().toString();

	System.out.println("Texto invertido"+textoinvertido);

	}

	// Este método recibe como parámetro un 'String'
	// No devuelve nada 'void'
	public static void escribirPalindromo(String texto){
		// Completar codigo del método
	}
}