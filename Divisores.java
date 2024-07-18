import java.util.Scanner;
/**Este programa pide un número entre 1 y 100 y escribe en pantalla los divisores de ese número 
**/
public class Divisores{
	static Scanner sc=new Scanner(System.in);
	static int a;
	public static void main(String[] args){


		System.out.print("Ingrese un número entre 1 y 100: ");
		int a=sc.nextInt();
		sc.nextLine();

		if(a<1 || a>100){
			System.out.print("El número está fuera del rango.");
			
		} else {
			System.out.print("Los divisores de "+a+" son: ");
			for(int i=1; i<=a; i++){
				if(a % i==0){
					System.out.print(i+" ");
				}
			}
		} 
		
	}
	
}