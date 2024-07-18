import java.util.Scanner;
/**
 * 
 * Primos.java
 * 
 * Este programa pide al usuario un número y determina si es o no un número primo
 * */

public class Primos{
	
	static Scanner sc=new Scanner(System.in);
	static int numero;
	static int contadorDivisores;
	
	public static void main(String[] args){
		System.out.print("Introduzca un número ");
		numero=sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=numero; i++){
			if (numero % i == 0){
				contadorDivisores++;
			}
		}

		if(contadorDivisores==2){
			System.out.print("El numero es primo");
		} else {
			System.out.print("El numero no es primo");
		}

	}
}
