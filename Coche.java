import java util Scanner;

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
 	public static void mani(String[] args){
 		Scanner kb=new Scanner(System.in);
 		
 		System.out.println("Datos vehículo");
 		System.out.println("1) Marca");
 		System.out.println("2) Modelo");
 		System.out.println("3) Año");
 		System.out.println("4) Color");
 		System.out.println("5) Matrícula");
 		System.out.println("6) Estado de la revisión");
 		System.out.println("0) Salir");
 		System.out.print("Seleccione una opcion");



 		kb.close();
 	}
 }