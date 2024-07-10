import java.util.Scanner;

public class Rectangulo{
	public static void main(String args[]){
		// Vamos a pedirle al usuario que introduzca los caracteres manualmente
		Scanner kb=new Scanner(System.in);
		System.out.print("Introducir un caracter: ");
		char perimetro=kb.nextLine().charAt(0);

		// Dibujamos el rectángulo
		// Bucle de la altura
		for (int altura=0; altura<5; altura++){
			// Bucle de la anchura
			for(int i=1; i<9; i++){
				System.out.print(perimetro);
			}
			System.out.println();
		}


		kb.close();

	}

}

