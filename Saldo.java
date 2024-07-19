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
		System.out.print("Saldo inicial? ");
		saldo=sc.nextInt();
		sc.nextLine();

		int opcion;
		do{
			System.out.println("1.Ingresar dinero");
			System.out.println("2.Retirar dinero");
			System.out.println("3.Consultar saldo");
			System.out.println("0.Salir");
			System.out.print("Seleccione una opcion: ");
			opcion=sc.nextInt();
			sc.nextLine();

			if(opcion==1){
				ingresarDinero();
			}
			if(opcion==2){
				retirarDinero();
			}
			if(opcion==3){
				consultarSaldo();
			}
		}while(opcion!=0);
	}

	public static void ingresarDinero(){
		System.out.print("Cuánto quiere ingresar: ");
		int ingreso=sc.nextInt();
		sc.nextLine();
		saldo=saldo+ingreso;
	}
	public static void retirarDinero(){
		System.out.print("Cuánto quiere retirar: ");
		int retiro=sc.nextInt();
		sc.nextLine();
		if(retiro<=saldo){
			saldo=saldo-retiro;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	public static void consultarSaldo(){
		System.out.println("Su saldo es: "+saldo);
	}
}
