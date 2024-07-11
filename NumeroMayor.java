import java.util.Scanner;

//Este programa devuelve el mayor de tres número introducidos por el usuario
public class NumeroMayor{
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		
		// Pedimos tres números al usuario
		System.out.print("Introduce el primer numero: ");
        int primerNumero=kb.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int segundoNumero=kb.nextInt();
        System.out.print("Introduce el tercer numero: ");
        int tercerNumero=kb.nextInt();

		// Comparamos esos tres números
		/*
		int mayor;
        if (primerNumero>segundoNumero){
         	if (primerNumero>tercerNumero){
         		mayor=primerNumero;
			}else{
         		mayor=tercerNumero;
			}
        }else{
         	if (segundoNumero>tercerNumero){
         		mayor=segundoNumero;
			}else{
				mayor=tercerNumero;
			}
        }
        */

        // Asumo que el primero es el mayor y lo almaceno
        int mayor = primerNumero;
        // Si el segundo es mayor, lo sustituyo
        if (segundoNumero > mayor){
        	mayor = segundoNumero;
        }
        // Si el tercero es mayor, lo sustituyo
        if (tercerNumero > mayor){
        	mayor = tercerNumero;
        }


        // Presentamos el resultado
        System.out.println("El mayor es: "+mayor);
		kb.close();
	}
}