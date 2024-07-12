import java.util.Scanner;

public class Tratamiento{

	public static void main(String[]args){
		Scanner kb=new Scanner(System.in);

		System.out.print("Edad?: ");
		int edad=kb.nextInt();
		kb.nextLine();

		System.out.print("Sexo?: ");
		char sexo=kb.nextLine().charAt(0);
		
		if((sexo=='f') || (sexo=='F')){
			if(edad<18){
				System.out.println("Señorita");
			} else {
				System.out.println("Señora");
			}
		}

		if((sexo=='m') || (sexo=='M')) {
			if(edad<18){
				System.out.println("Señorito");
			} else {
				System.out.println("Señor");
			}
		} 

		kb.close();

	}

}
