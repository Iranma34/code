import java.util.Scanner;

/**Este programa pide al usuario al arrancar, un saldo inicial(número entero), después va a mostrar
un mensaje:
1-Ingresar dinero
1.1-Cuanto dinero ingresa
2- Retirar dinero
2.1- Cuanto dinero retiro
3- Consultar saldo
0- Salir **/

public class Saldo{
	static Scanner sc=new Scanner(System.in);
	static int saldo;

public static void main(String[] args){
	double saldo=0;
	int opcion;
	do{
		System.out.println("1.Ingresar dinero");
		System.out.println("2.Retirar dinero");
		System.out.println("3.Consultar saldo");
		System.out.println("0.Salir");
		System.out.print("Seleccione una opcion: ");
		opcion=sc.nextInt();
		sc.nextLine();
	}while(opcion!=0);

}
}

