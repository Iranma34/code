import java.util.Scanner;

/**
 * 
 * Este programa pregunta al usuario un código
 * Si se corresponde con una provincia gallega, muestra el nombre
 * En caso contrario, responde el mensaje "Código desconocido"
 * Los códigos son:
 * 		15: A Coruña
 * 		27: Lugo
 *		32: Ourense
 * 		38: Pontevedra 		
 * */
public class CodigoProvincia{
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args){
		System.out.print("¿Cuál es el código?: ");
		int codigoProvincia=sc.nextInt();

		public static boolean getConfirmation(){

		if(codigoProvincia==15){
			System.out.println("A Coruña");
			{ else 
		if(codigoProvicia==27){
			System.out.println("Lugo");
			{ else
		if(codigoProvincia==32){
			System.out.println("Ourense");
			{ else 
		if(codigoProvincia==38){
			System.out.println("Pontevedra");
			} else {
			System.out.println("Código desconocido");

		}

			}
		}

		
		/*// Este método no recibe ningún parámetro
	// Devuelve un 'int'
	public static int leerCodigoProvincia(){
		System.out.print("Introducir codigo: ");
		int codigo=sc.nextInt();
		sc.nextLine();
		return codigo;
	}

	// Este método recibe como parámetro un código
	// No devuelve nada 'void'
	public static void comprobarCodigoProvincia(int codigo){
		// Completar el programa escribiendo este método
	}*/

