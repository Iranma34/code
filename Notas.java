import java.util.Scanner;

public class Notas{

	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);

		Sytem.out.println("Introduce la nota: ");
		int nota=kb.nextInt();

		System.out.println("La nota es:"+resultado);

		if(nota== 1 || nota== 2){
			return "Muy deficiente";
			} else {
		if(nota==3 || nota==4){
			return "Deficiente";
			} else {
		if(nota== 5){
			return "Suficiente";
			} else {
		if(nota== 6){
			return"Bien";
			} else {
		if(nota==7 || nota==8){
			return"Notable";
			} else {
		if(nota==9 || nota==10){
			return"Sobresalliente";
		}
		}
		}
		}

			


		}



	kb.close();	
}
 	}	