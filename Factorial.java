import java.util.Scanner;


public class Factorial{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int numero=sc.nextInt();
		sc.nextLine();

		System.out.print("El resultado es: "+factorial(numero));
		sc.close();	
	}

	public static int factorial(int n){
		int resultado=1;
		int i=1;
		do{
			resultado=i*resultado;
			i++;
		}while(i<=n);
		return resultado;
	}
}