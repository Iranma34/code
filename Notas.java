import java.util.Scanner;

public class Notas{

	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);

		System.out.print("Introduce la nota: ");
		int nota=kb.nextInt();

		String evaluacion = "";
	/*	
		if(nota== 1 || nota== 2){
			evaluacion = "Muy deficiente";
		} else {
			if(nota==3 || nota==4){
				evaluacion = "Deficiente";
			} else {
				if(nota== 5){
					evaluacion = "Suficiente";
				} else {
					if(nota== 6){
						evaluacion ="Bien";
					} else {
						if(nota==7 || nota==8){
							evaluacion ="Notable";
						} else {
							if(nota==9 || nota==10){
								evaluacion ="Sobresaliente";
							} else {
								System.out.println("La nota debe estar comprendida entre 1 y 10");
							}
						}
					}
				}
			}
		}
	*/

		// Lógica de las comparaciones simplificada
		if (nota==1 || nota==2) { evaluacion="Muy deficiente"; }
		if (nota==3 || nota==4) { evaluacion="Deficiente"; }
		if (nota==5) { evaluacion="Suficiente"; }
		if (nota==6) { evaluacion="Bien"; }
		if (nota==7 || nota==8) { evaluacion="Notable"; }
		if (nota==9 || nota==10) { evaluacion="Sobresaliente"; }

		if (evaluacion == ""){
			System.out.println("La nota debe estar comprendida entre 1 y 10");
		} else {
			System.out.println("La nota es: "+evaluacion);
		}

		kb.close();	
	}
}