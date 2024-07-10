import java.util.Scanner;

public class Cuadrado{

	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);

		/**
		 * Pedimos el lado del cuadrado al usuario
		 * */
		System.out.print("Introducir lado: ");
		int lado=kb.nextInt();
		kb.nextLine();
		
		/**
		 * No necesito preguntar dos datos, ya que
		 * en el cuadrado todos los lados deben ser iguales
		 * 
		 * System.out.print("Introducir ladoDos: ");
		 * int ladoDos=kb.nextInt();
		 * kb.nextLine();
		 * */

		/**
		 * Pedimos el caracter con el que pintar el cuadrado
		 * */
		System.out.print("Introduzca un caracter: ");
		char forma=kb.nextLine().charAt(0);

		/**
		 * Este bucle lleva cuenta de la altura (altura = lado)
		 * */
		for(int i=0; i<lado; i++){
			/**
			 * Este bucle lleva cuenta del ancho (ancho = lado)
			 * */
			for(int k=0; k<lado; k++){
				System.out.print(forma);
			}
			System.out.println();
		}
		
		kb.close();
	}

}