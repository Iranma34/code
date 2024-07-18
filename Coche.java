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

	public static void main(String[] args){
		int opcion;
		do{
			System.out.print("""
			Menu principal:
			1) Introducir datos del coche
			2) Modificar datos
			3) Ver datos del coche
			0) Salir
			Introducir opcion: """);
			opcion=sc.nextInt();
			sc.nextLine();

		} while (opcion!=0);
	}
}