import java.util.Scanner;

public class Rectangulo{
	public static void main(String args[]){
		// Vamos a pedirle al usuario que introduzca los caracteres manualmente
		Scanner kb=new Scanner(System.in);
		System.out.print("Introducir un caracter: ");
		char perimetro=kb.nextLine().charAt(0);

		// Pedimos las dimensiones del rectángulo
		System.out.print("Introducir base: ");
		int base=kb.nextInt();
		kb.nextLine();
		System.out.print("Introducir altura: ");
		int altura=kb.nextInt();
		kb.nextLine();

		// Dibujamos el rectángulo
		// Bucle de la altura
		for (int j=0; j<altura; j++){
			// Bucle de la base
			for(int i=0; i<base; i++){
				System.out.print(perimetro);
			}
			System.out.println();
		}

		kb.close();
	}

}

