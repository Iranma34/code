import java.util.Scanner;

public class Tratamiento{

	public static void main(String[]args){
		Scanner kb=new Scanner(System.in);

        //Preguntamos si el usuario es mayor de edad
		System.out.println("Edad? : ");
		
		int edad=kb.nextInt();
		kb.nextLine();

		if (edad<18){
			System.out.println("Menor de edad");
		} else {
			System.out.println("Mayor de edad");
		}


		System.out.println("Sexo?: ");
		
		char sexo=kb.nextLine().charAt(0);
		kb.nextLine();

		if(sexo=='f'){

		} else {
			System.out.println("F");
		} 
		if(edad<18){
			System.out.printl("Señorita");

		} else {
			System.out.printl("Señora");
		}

		if(sexo=='m'){

		}else {
			System.out.println("M");
		}
		if(edad<18){
			System.out.printl("Señorito");

		} else {
			System.out.printl("Señor");
		}


		/*if((sexo=='f') || (sexo=='m')){
			System.out.print("Señor");
		
		} else {
			System.out.println("Señorito");
		}*/


		kb.close();


	}


}

	
		






	
	    

    
    




	


