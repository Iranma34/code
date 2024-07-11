import java.util.Scanner;

//Este programa devuelve el mayor de tres número introducidos por el usuario
public class NumeroMayor{
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		
		//Pedimos tres números al usuario
		System.out.println("Introduce el primer numero");
         int primerNumero=kb.nextInt();

         System.out.println("Introduce el segundo numero");
         int segundoNumero=kb.nextInt();

         System.out.println("Introduce el tercer numero");
         int tercerNumero=kb.nextInt();



		//Comparamos esos tres números
         if (primerNumero<=segundoNumero){
         	//El mayor es el segundo número
         	if (segundoNumero<=tercerNumero){
         		//tercerNumero
			}else{
				//segundoNumero
			}
         }else{
         	//primerNumero
         	if (primerNumero<=tercerNumero){
         		//tercerNumero
			}else{
         		//primerNumero
			}
         }


		kb.close();
	}
}