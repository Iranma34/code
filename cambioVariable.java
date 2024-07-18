import java.util.Scanner;

public class cambioVariable{
	static Scanner sc=new Scanner(System.in);
	static int a,b,aux;
	
	public static void main(String[] args){
		
		System.out.print("Introduce a = ");
		a=sc.nextInt();
		sc.nextLine();

		System.out.print("Introduce b = ");
		b=sc.nextInt();
		sc.nextLine();
	
		aux=a;
		a=b;
		b=aux;

		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}