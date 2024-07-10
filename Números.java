import java.util.Scanner;

//Importamos la clase scanner

public class Números{
	
	public static void main(String args[]){

		
		//Creamos un scanner para manejar el teclado

		Scanner teclado=new Scanner(System.in);

		System.out.println("Introduce el primer factor");

		//Se hace así para meter a mano los números enteros
		int factorUno=teclado.nextInt();


		System.out.println("Introduce el segundo factor");

		//Se hace así para meter a mano los números enteros al compilar se pueda meter a mano

        int factorDos=teclado.nextInt();

		//int factorUno=65;
		//int factorDos=4;
		int suma=factorUno+factorDos;
		System.out.println("El resultado de la suma es: "+suma);

		
		int resta=factorUno-factorDos;
		System.out.println("El resultado de la resta es: "+resta);

		/* El + cuando está entre dos números los suma automaticamente,
		pero si este está en un texto lo que hace es pegar el resultado
		previamente guardado en la variable*/

		int producto=factorUno*factorDos;
		System.out.println("El resultado de la multiplicación es: "+producto);

		float division=factorUno/factorDos;
		System.out.println("El resultado de la división es: "+division);


       //cierre del teclado
       teclado.close();



	}
}