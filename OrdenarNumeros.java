import java.util.Scanner;

public class OrdenarNumeros{}

	public static void main(String[]args){
		Scanner kb=new Scanner(System.in);
		
		// Pedimos tres números al usuario
		System.out.print("Introduce el primer numero: ");
        int primerNumero=kb.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int segundoNumero=kb.nextInt();
        System.out.print("Introduce el tercer numero: ");
        int tercerNumero=kb.nextInt();

	
	kb.close();
}
	}
