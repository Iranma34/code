import java.util.Scanner;


public class Triangulo{

	public static void main(String args[]){
		Scanner kb=new Scanner(System.in);

		// Bucle de la altura del triangulo
		for (int i=0; i<4; i++){
			// Bucle de la anchura de cada línea (depende del número de linea i)
			for(int k=0; k<=i; k++){
				System.out.print("-");
			}
			System.out.println();
		}

		kb.close();

	}

}

