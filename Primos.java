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
		if (numero < 4){
			System.out.println("El numero es primo");
		} else {
			if(numero % 2==0){
				System.out.print("El numero no es primo");
			} else {
				for(int i=1; i<=numero; i=i+2){
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
	}
}
