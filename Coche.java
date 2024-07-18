import java.util.Scanner;
/**
 * 
 * Escribir un programa similar a 'Alumnos.java' en el que
 * se pueda trabajar con los siguientes datos de un coche:
 * - Marca
 * - Modelo
 * - Año
 * - Color
 * - Matrícula
 * - Estado de revisión (que puede ser Superada o No superada)
 * 
 * El programa debe estar dirigido por menús
 * La primera opción debe servir para introducir todos los
 * datos de un coche, las siguientes para modificarlos de
 * forma individual y la última para mostrar todos los datos
 * del coche (además de una opción de salir)
 * 
 * El codigo debe estar encapsulado en diferentes métodos
 * */

public class Coche{

	static Scanner sc=new Scanner(System.in);
	static String marca, modelo, color, matricula;
	static int año;
	static boolean estadoRevision = false;

	public static void main(String[] args){
		int opcion;
		do{
			System.out.print("""
			Menu principal:
			1) Introducir datos del coche
			2) Modificar datos
			3) Ver datos del coche
			0) Salir
			Introducir opcion:  """);
			opcion=sc.nextInt();
			sc.nextLine();

			if (opcion==1) { introducirDatos(); }
			if (opcion==0) { System.out.println("Saliendo del programa"); }
			if (opcion==2) { cambiarDatos(); }
			if (opcion==3) { mostrarDatos();}
		} while (opcion!=0);
	}


	public static void introducirDatos(){
		System.out.print("Marca? ");
		marca=sc.nextLine();
		System.out.print("Modelo? ");
		modelo=sc.nextLine();
		System.out.print("Año? ");
		año=sc.nextInt();
		sc.nextLine();
		System.out.print("Color? ");
		color=sc.nextLine();
		System.out.print("Matricula? ");
		matricula=sc.nextLine();

		char confirmarSoN;
		do{
			System.out.print("Revisión superada? (S/N): ");
			confirmarSoN=sc.nextLine().charAt(0);
			estadoRevision=confirmarSoN=='s' || confirmarSoN=='S';
		} while (confirmarSoN!='s' && confirmarSoN!='S' && confirmarSoN!='n' && confirmarSoN!='N');
	}

	public static void mostrarDatos(){
		System.out.println(marca+" "+modelo+" de color "+color+" y matricula "+matricula+" fabricado en "+año);
		// En este condicional verifico si ha pasado la revisión
		// Equivale a hacer estadoRevision == true, pero estadoRevision ya es un valor boolean
		// Y por lo tanto ya tiene un valor true o false
		if (estadoRevision) {
			System.out.println("Estado de la revisión: Superada");
		} else {
			System.out.println("Estado de la revisión: No superada. Acuda a su taller.");
		}
	}

	public static void cambiarDatos(){
		System.out.print("Nueva marca ");
		marca=sc.nextLine();
		System.out.print("Nuevo modelo ");
		modelo=sc.nextLine();
		System.out.print("Nuevo año ");
		año=sc.nextInt();
		sc.nextLine();
		System.out.print("Nuevo color ");
		color=sc.nextLine();
		System.out.print("Nueva matricula ");
		matricula=sc.nextLine();

		char confirmarSoN;
		do{
			System.out.print("Revisión superada? (S/N): ");
			confirmarSoN=sc.nextLine().charAt(0);
			estadoRevision=confirmarSoN=='s' || confirmarSoN=='S';
		} while (confirmarSoN!='s' && confirmarSoN!='S' && confirmarSoN!='n' && confirmarSoN!='N');
			
	}

}