import java.util.Scanner;

public class Cuadrado{

	public static void main(String[] args){
	Scanner kb=new Scanner(System.in);

	System.out.print("Introducir lado: ");
	int lado=kb.nextInt();
	kb.nextLine();
	
	System.out.print("Introducir ladoDos: ");
	int ladoDos=kb.nextInt();
	kb.nextLine();

	System.out.print("Introduzca un caracter: ");
	char forma=kb.nextLine().charAt(0);

	for(int i=0; i<lado; i++){

		for(int k=0; k<=ladoDos; k++){
			System.out.print(forma);
		}
		System.out.println();
	}




kb.close();
	}
	


}
