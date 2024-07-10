import java.util.Scanner;


public class Letras{

	public static void main(String args[]){

		//Los tipos primitivos se escriben siempre en minúscula (número entero o letras/caracter(int o char))

		 Scanner teclado=new Scanner(System.in);

		 System.out.println("Introducir un caracter: ");

		 //Solo es para manejar letras o caracteres cuando solo es una

		 char unCaracter=teclado.nextLine().charAt(0);
		 System.out.println("El caracter introducido es: "+unCaracter);


		 System.out.println("Introduce el mensaje:  ");
		 String unStr=teclado.nextLine();
		 System.out.println("La frase que ha introducido es: "+unStr);
          

          String unStrEnMinusculas=unStr.toLowerCase();
          String unStrEnMayusculas=unStr.toUpperCase();

          System.out.println(unStrEnMinusculas);
          System.out.println(unStrEnMayusculas);

          String unTrozo=unStr.subsyting(0,3);
          System.out.println(unTrozo);











teclado.close();
	}

}