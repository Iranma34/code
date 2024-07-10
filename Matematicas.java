import java.util.Scanner;


public class Matematicas{
	//C:\Users\Carlos>cd java  para poder operar en la consola

public static void main(String args[]){
		


         Scanner teclado=new Scanner(System.in);

         System.out.println("Vamos a hacer operaciones matemáticas: ");

         System.out.println("Introduce el primer numero");
         int primerNumero=teclado.nextInt();

         System.out.println("Introduce el segundo numero");
         int segundoNumero=teclado.nextInt();

         int suma=primerNumero+segundoNumero;
         System.out.println("El resultado de la suma es: "+suma);

         int resta=primerNumero-segundoNumero;
         System.out.println("El resultado de la resta es:"+resta);

         int producto=primerNumero*segundoNumero;
         System.out.println("El resultado de la multiplicación es:"+producto);

         float division=primerNumero/segundoNumero;
         System.out.println("El resultado de la division es:"+division);

         System.out.println("Introduce el tercer numero");
         int tercerNumero=teclado.nextInt();

        





     }

	}
