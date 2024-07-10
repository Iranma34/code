import java.util.Scanner;


public class Triangulo{

	public static void main(String args[]){
		Scanner kb=new Scanner(System.in);

		// Pedimos las dimensiones del triangulo
		System.out.print("Introducir altura: ");
		int altura=kb.nextInt();
		kb.nextLine();

		System.out.print("Introduzca un caracter: ");
		char contenido=kb.nextLine().charAt(0);

		// Bucle de la altura del triangulo
		for (int i=0; i<altura; i++){
			// Bucle de la anchura de cada línea (depende del número de linea i)
			for(int k=0; k<=i; k++){
				System.out.print(contenido);
			}
			System.out.println();
		}

		kb.close();

	}

}

