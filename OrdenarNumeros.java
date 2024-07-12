import java.util.Scanner;

public class OrdenarNumeros{

	public static void main(String[]args){
		Scanner kb=new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
        int primerNumero=kb.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int segundoNumero=kb.nextInt();
        System.out.print("Introduce el tercer numero: ");
        int tercerNumero=kb.nextInt();

        //Asumimos que el primer número es el mayor ya que es el orden lógico
        
        int mayor=tercerNumero;
        int menor=segundoNumero;

        if (segundoNumero<menor){
        	menor=segundoNumero;
        }
        if (tercerNumero<menor){
        	menor=tercerNumero;
        }

		
		//Mostramos el resultado
		System.out.print("El orden es: ");
		
		kb.close();
}
	}
