import java.util.Scanner;

/**
 * Este programa pregunta al usuario su edad
 * y muestra un mensaje diciendo si es o no
 * mayor de edad
 * */
public class MayorDeEdad {

	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);

		System.out.print("¿Cuántos años tiene?: ");
		int edad=kb.nextInt();

		if (edad<18){
			System.out.print("Menor de edad");
		} else {
			System.out.print("Mayor de edad");

		}

		kb.close();
	}

}