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
		String txt=leerTexto();
		escribirPalindromo(txt);
	}

	// Este método no recibe ningun parámetro
	// Devuelve un 'String'
	public static String leerTexto(){
		System.out.print("Introduzca el texto: ");
		String texto=sc.nextLine();
		return texto;
	}

	// Este método recibe como parámetro un 'String'
	// No devuelve nada 'void'
	public static void escribirPalindromo(String texto){
		String textoInvertido="";
		for(int i=texto.length()-1; i>=0; i--){
			textoInvertido +=texto.charAt(i);
		}
		System.out.println("Texto invertido: "+textoInvertido);
	}
}