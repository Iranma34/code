gimport java.util.Scanner;


public class Frase{

	public static void main(String args[]){

		Scanner teclado=new Scanner(System.in);




		System.out.println("Introduce el mensaje: ");
   		String unStr=teclado.nextLine();
   		//System.out.println("Mi mensaje al mundo es: " +unStr);

   		System.out.println("Introduce un caracter: ");
   		char unCaracter=teclado.nextLine().charAt(0);
   		//System.out.println("El caracter requerido es: "+unCaracter);

   		int posicion;
   		posicion=unStr.indexOf(unCaracter);
   		System.out.println("El caracter esta en la posicion: "+posicion);



		teclado.close();

	}

}


	


		










