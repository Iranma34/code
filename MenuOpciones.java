import java.util.Scanner;

public class MenuOpciones{
	static Scanner sc=new Scanner(System.in);
	static int numero;
	
	public static void main(String[] args){
		int opcion;
		do{
			System.out.println("Opcion 1");
			System.out.println("Opcion 2");
			System.out.println("Opcion 3");
			System.out.println("Opcion 4");
			System.out.println("Opcion 5");
			System.out.println("0 Salir");
			System.out.print("Seleccione una opcion: ");
			opcion=sc.nextInt();
			sc.nextLine();

/*			if(opcion==1){	System.out.println("Escogió la opcion 1"); }
			if(opcion==2){	System.out.println("Escogió la opción 2"); }
			if(opcion==3){	System.out.println("Escogió la opcion 3"); }
			if(opcion==4){	System.out.println("Escogió la opcion 4"); }
			if(opcion==5){	System.out.println("Escogió la opcion 5"); }
*/

			switch(opcion){
				case 1: System.out.println("Escogió opcion 1"); break;
				case 2: System.out.println("Escogió opcion 2"); break;
				case 3: System.out.println("Escogió opcion 3"); break;
				case 4: System.out.println("Escogió opcion 4"); break;
				case 5: System.out.println("Escogió opcion 5"); break;
				case 0: break;
				default: System.out.println("Escogió una opción desconocida"); break;
			}
		}while(opcion!=0);
	}
}