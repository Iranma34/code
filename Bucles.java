import java.util.Scanner;

public class Bucles {
	
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);

		System.out.print("Introducir un numero: ");
		int numero = kb.nextInt();
		int iterador;
		
		// Bucle FOR:
		//   - es el más seguro
		//   - el iterador avanza solo
		// Es bueno cuando conozco exactamente el número de iteraciones	
		for (int i=0; i<numero; i++){
			System.out.println("Iteración FOR "+i);
		}

		// Bucle WHILE:
		//   - es menos seguro
		//   - el iterador debe ser avanzado
		// Es bueno si las instrucciones se van a realizar 0 o más veces
		// Primero evalua la condición y luego ejecuta
		iterador=0;
		while (iterador<numero){
			System.out.println("Iteración WHILE "+iterador);
			iterador=iterador+1;
		}

		// Bucle DO-WHILE:
		//   - es menos seguro
		//   - el iterador debe ser avanzado
		// Realiza las instrucciones AL MENOS una vez
		// Primero ejecuta y luego evalúa la condición
		iterador=0;
		do {
			System.out.println("Iterador DO-WHILE "+iterador);
			iterador=iterador+1;
		} while (iterador<numero);

		kb.close();
	}

}