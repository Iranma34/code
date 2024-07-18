import java.util.Scanner;

/**
 * 
 * Escribir un programa que al empezar muestra un menu con
 * las siguientes opciones:
 * 1) Dibujar un cuadrado
 * 2) Dibujar un triángulo
 * 0) Salir
 * 
 * Cuando el usuario selecciona una de las dos opciones para
 * pintar una figura, el programa le preguntará el caracter
 * empleado para dibujarla y las dimensiones de la misma.
 * 
 * El código fuente debe estar bien encapsulado en diferentes
 * métodos
 * El programa no termina tras dibujar una figura, si no que
 * vuelve al menu principal y solo terminará cuando el usuario
 * escoja la opción "Salir"
 * 
 */

public class Figuras{

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args){
		int opcion;
		do{
	  		System.out.println("1) Dibujar un cuadrado");
			System.out.println("2) Dibujar un triángulo");
			System.out.println("0) Salir del programa");
			System.out.print("Seleccione una opción: ");
			opcion=sc.nextInt();
			
			if(opcion==0){
				System.out.print("El programa se cerrará");
			}
			if(opcion==1){
				dibujarCuadrado();
			}
			if(opcion==2){
				dibujarTriangulo();
			}
		}while(opcion!=0);	
	}


	public static void dibujarCuadrado(){
        System.out.print("Introducir lado: ");
		int lado=sc.nextInt();
		sc.nextLine();
	
	    System.out.print("Introducir ladoDos: ");
		int ladoDos=sc.nextInt();
		sc.nextLine();

	    System.out.print("Introduzca un caracter: ");
	    char forma=sc.nextLine().charAt(0);

	  	for(int i=0; i<lado; i++){
			for(int k=0; k<=ladoDos; k++){
				System.out.print(forma);
			}
			System.out.println();
		}
	}

			
    public static void dibujarTriangulo(){
        System.out.print("Introducir altura: ");
		int altura=sc.nextInt();
		sc.nextLine();

		System.out.print("Introduzca un caracter: ");
		char contenido=sc.nextLine().charAt(0);

		for (int i=0; i<altura; i++){
			for(int k=0; k<=i; k++){
				System.out.print(contenido);
			}
			System.out.println();
		}
    }

}