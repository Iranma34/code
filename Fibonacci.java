// import java.util.Scanner;

/**
 * Sucesion fibonacci: 1 1 2 3 5 8 13 21 ...
 * 
 * Fibonacci(posicion)=numero en esa posicion
 * Fibonacci(0)=1
 * Fibonacci(1)=1
 * Fibonacci(2)=2
 * Fibonacci(3)=3
 * Fibonacci(4)=5
 * Fibonacci(5)=8
 * Fibonacci(6)=13
 * 
 * */

public class Fibonacci{
	public static void main(String[] args){
		/**
		 * En lugar de pedir el numero por teclado
		 * lo leemos como argumento de la linea de comandos
		 * 
		 * 
		 * Scanner sc=new Scanner(System.in);
		 * System.out.print("Introduzca un número: ");
		 * int numero=sc.nextInt();
		 * sc.nextLine();
		 *	*/

		// Esta línea convierte un texto a número
		int numero = Integer.parseInt(args[0]);
		System.out.println(fibo(numero));
		// sc.close();
	}

	public static int fibo(int n){
		if (n<2){
			return 1;
		} else {
			// Llamo al mismo método que estoy programando
			// Esto se llama RECURSIVIDAD DIRECTA
			return fibo(n-1)+fibo(n-2);
		}
	}

}