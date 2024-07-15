import java.util.Scanner;

//Programa que pregunta al usuario dos números enteros
//Mostrará por pantalla todos los números pares entre esos dos números
//La introducción de datos y la presentación del resultado se realizarán en métodos separados

public class ParesEntreLimites{

	/**
	 * Declaro dos variables que serviran como límites
	 * de la sucesión de números pares.
	 * Al declararlas fuera de cualquier método, puedo
	 * acceder a ellas desde todos los métodos de esta
	 * clase.
	 * */
	static int numero1, numero2;

	/**
	 * El método main invoca a dos métodos distintos y
	 * cada uno de ellos realiza una operación sencilla
	 * y concreta.
	 * */
	public static void main(String[] args){
		introducirLimites();
		mostrarNumerosPares();
	}

	/**
	 * Este método pide por teclado los dos números
	 * que representan los límites de nuestro programa
	 * y los almacena en las variables numero1 y numero2
	 * declaradas al principio de la clase
	 * */
	public static void introducirLimites(){
		Scanner kb=new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		numero1=kb.nextInt();
		System.out.print("Introduce el segundo numero: ");
		numero2=kb.nextInt();
		kb.close();
	}

	/**
	 * Este método muestra los números pares entre los dos
	 * límites por pantalla.
	 * Antes de empezar a mostrarlos, se asegura de que el
	 * primero de los números (numero1) sea un número par.
	 * Si es impar, suma uno para empezar en el siguiente.
	 * */
	public static void mostrarNumerosPares(){
		if (numero1 % 2 == 1) { numero1++; }
		for(int i=numero1; i<=numero2; i=i+2){
			System.out.print(i+" ");
		}
	}

}