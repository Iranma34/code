import java.util.Scanner;

/**
 * Hacer un programa que muestra un menú con las siguientes opciones:
 * 1- Introducir datos de un alumno(nombre, edad y teléfono)
 * 2- Cambiar nombre 
 * 3- Cambiar edad
 * 4- Cambiar teléfono
 * 5- Mostrar datos del alumno 
 * 0- Salir del programa
 * */

 public class Alumnos{

 	/**
 	 * Declaramos el Scanner como atributo estático de la clase
 	 * para tenerlo accesible desde todos los métodos de esta clase
	 * */
 	static Scanner sc=new Scanner(System.in);
 	static String nombre, telefono;
 	static int edad;

 	public static void main(String[] args){
 		int opcion;
 		do {
			System.out.println("Menú principal");
	 		System.out.println("1) Introduzca datos del alumno");
	 		System.out.println("2) Cambiar nombre");
	 		System.out.println("3) Cambiar edad");
	 		System.out.println("4) Cambiar teléfono");
	 		System.out.println("5) Mostrar datos del alumno");
	 		System.out.println("0) Salir del programa");
	 		System.out.print("Selecciona una opcion: ");
	 		opcion=sc.nextInt();
			sc.nextLine(); // Vacia el buffer de teclado para evitar que la siguiente lectura arrastre basura previa
	 			
	 		if (opcion==0){
	 			System.out.println("Hasta pronto!");
	 		}
	 		if(opcion==1){
	 			introducirDatos();
	 		}
	 		if(opcion==2){
	 			cambiarNombre();
	 		}
	 		if(opcion==3){
	 			cambiarEdad(); 			
	 		}
	 		if(opcion==4){
	 			cambiarTelefono(); 			
	 		}
	 		if(opcion==5){
	 			mostrarDatosAlumno(); 			
	 		}
 		} while (opcion!=0);
 		
 	}

 	public static void getNombre(){
 		System.out.print("Nombre: ");
		nombre=sc.nextLine();
 	}

 	public static void getEdad(){
 		System.out.print("Edad: ");
		edad=sc.nextInt();
		sc.nextLine(); // Vacia el buffer de teclado para evitar que la siguiente lectura arrastre basura previa
 	}

 	public static void getTelefono(){
 		System.out.print("Teléfono: ");
		telefono=sc.nextLine();
 	}

 	public static void introducirDatos(){
 		getNombre();
 		getEdad();	 	
		getTelefono();
 	}

 	public static void cambiarNombre(){
 		getNombre();
 	}

 	public static void cambiarEdad(){
 		getEdad();
 	}

 	public static void cambiarTelefono(){
 		getTelefono();
 	}

 	public static void mostrarDatosAlumno(){
 		System.out.println(nombre);
 		System.out.println(edad+" años");
 		System.out.println(telefono);
 	}


}