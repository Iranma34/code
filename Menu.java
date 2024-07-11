import java.util.Scanner;

/**
 * Este programa muestra un menú al usuario y no termina
 * hasta que el usuario escoge la opción de salir
 * */
public class Menu {


	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);

		// Pedimos una línea de texo
		System.out.print("Introduce una línea de texto: ");
		String texto = kb.nextLine();

		// Bucle principal del programa (solo termina si selecciona salir)
		int opcion=0;
		do {
			// Mostrar el menú
			System.out.println();
			System.out.println("MENU PRINCIPAL");
			System.out.println("1) Contar palabras");
			System.out.println("2) Mostrar cada palabra en una línea");
			System.out.println("3) Salir");
			System.out.print("Opcion: ");
			opcion = kb.nextInt();
			kb.nextLine();

			if (opcion== 1){
				// Contar el número de palabras en esa línea de texto
				int numPalabras=0;
				for (int i = 0; i < texto.length(); i++){
					if (texto.charAt(i) == ' ') {
						numPalabras++;
					}
					if (i == texto.length()-1){
						numPalabras++;
					}
				}

				// Mostrar el número de palabras
				System.out.println("La frase contiene "+numPalabras+" palabras.");
			}

			if (opcion == 2){
				// Hago una copia para no perder el texto original
				String textoCopiado=texto;
				// Mostrar una palabra por linea
	        	while (textoCopiado.indexOf(' ')>-1){
	        		int indice = textoCopiado.indexOf(' ');
					String palabra=textoCopiado.substring(0,indice);
		        	System.out.println(palabra);
		        	textoCopiado=textoCopiado.substring(indice+1);
	        	}
	        	System.out.println(textoCopiado);
			}

		} while (opcion!=3);

		kb.close();
	}

}