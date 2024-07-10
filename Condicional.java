import java.util.Scanner;

public class Condicional{
	
	public static void main(String args[]){

		Scanner kb=new Scanner(System.in);

		// Saber si un numero es PAR o IMPAR
		System.out.print("Introduce un numero: ");
		int numeroIntroducido = kb.nextInt();
		int resto = numeroIntroducido % 2;
		if (resto == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		kb.nextLine();


		// Saber si una letra es una s (mayúscula o minúscula)
		System.out.print("Introduce una letra: ");
		char charIntroducido = kb.nextLine().charAt(0);
		if ((charIntroducido=='S') || (charIntroducido=='s')){
			System.out.println("Sí");
		} else {
			System.out.println("No");
		}


		// Saber si un número está entre 0 y 100
		System.out.print("Introduce un numero: ");
		int intIntroducido=kb.nextInt();
		if (intIntroducido>=0 && intIntroducido<=100) {
			System.out.println("El numero está entre cero y 100");
		}

		kb.close();

	}
}