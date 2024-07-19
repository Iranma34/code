import java.util.Scanner;

public class Zodiaco{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Introducir mes: ");
		String mm=sc.nextLine();
		int dd;
		do {
			System.out.print("Introducir dia: ");
			dd=sc.nextInt();
			sc.nextLine();
			if (dd<1 || dd>31){
				System.out.println("El dia no es valido");
			}
		} while (dd<1 || dd>31);

		switch(mm){
			case "Enero": case "enero": case: "ENERO":
				if (dd<21){
					System.out.println("Capricornio");
				} else {
					System.out.println("Acuario");
				}
				break;
			case "Febrero":  
				if (dd<20){
					System.out.println("Acuario");
				} else {
					System.out.println("Piscis");
				}
				break;
			case "Marzo": 
				if (dd<21){
					System.out.println("Piscis");
				} else {
					System.out.println("Aries");
				}
				break;
			case "Abril":
				if (dd<21){
					System.out.println("Aries");
				} else {
					System.out.println("Tauro");
				}
				break;
			case "Mayo":
				if (dd<21){
					System.out.println("Tauro");
				} else {
					System.out.println("Géminis");
				}
				break;
			case "Junio":
				if (dd<21){
					System.out.println("Géminis");
				} else {
					System.out.println("Cáncer");
				}
				break;
			case "Julio":
				if (dd<23){
					System.out.println("Cáncer");
				} else {
					System.out.println("Leo");
				}
				break;
			case "Agosto":
				if (dd<24){
					System.out.println("Leo");
				} else {
					System.out.println("Virgo");
				}
				break;
			case "Septiembre":
				if (dd<23){
					System.out.println("Virgo");
				} else {
					System.out.println("Libra");
				}
				break;
			case "Octubre":
				if (dd<23){
					System.out.println("Libra");
				} else {
					System.out.println("Escorpio");
				}
				break;
			case "Noviembre":
				if (dd<23){
					System.out.println("Escorpio");
				} else {
					System.out.println("Sagitario");
				}
				break;
			case "Diciembre":
				if (dd<22){
					System.out.println("Sagitario");
				} else {
					System.out.println("Capricornio");
				}
				break;
			default: System.out.println("Mes no válido"); break;
		}
/*
		if (mm.equalsIgnoreCase("Enero")){
		}
		if (mm.equalsIgnoreCase("Febrero")){
		if (mm.equalsIgnoreCase("Marzo")){ 
			if (dd<21){
				System.out.println("Piscis");
			} else {
				System.out.println("Aries");
			}
		}
		if (mm.equalsIgnoreCase("Abril")){ 
			if (dd<21){
				System.out.println("Aries");
			} else {
				System.out.println("Tauro");
			}
		}
		if (mm.equalsIgnoreCase("Mayo")){ 
			if (dd<21){
				System.out.println("Tauro");
			} else {
				System.out.println("Géminis");
			}
		}
		if (mm.equalsIgnoreCase("Junio")){ 
			if (dd<21){
				System.out.println("Géminis");
			} else {
				System.out.println("Cáncer");
			}
		}
		if (mm.equalsIgnoreCase("Julio")){ 
			if (dd<23){
				System.out.println("Cáncer");
			} else {
				System.out.println("Leo");
			}
		}
		if (mm.equalsIgnoreCase("Agosto")){ 
			if (dd<24){
				System.out.println("Leo");
			} else {
				System.out.println("Virgo");
			}
		}
		if (mm.equalsIgnoreCase("Septiembre")){ 
			if (dd<23){
				System.out.println("Virgo");
			} else {
				System.out.println("Libra");
			}
		}
		if (mm.equalsIgnoreCase("Octubre")){ 
			if (dd<23){
				System.out.println("Libra");
			} else {
				System.out.println("Escorpio");
			}
		}
		if (mm.equalsIgnoreCase("Noviembre")){ 
			if (dd<23){
				System.out.println("Escorpio");
			} else {
				System.out.println("Sagitario");
			}
		}*/

		sc.close();
	}

}