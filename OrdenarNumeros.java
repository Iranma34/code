import java.util.Scanner;

public class OrdenarNumeros{

	public static void main(String[]args){
		Scanner kb=new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
        int a=kb.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int b=kb.nextInt();
        System.out.print("Introduce el tercer numero: ");
        int c=kb.nextInt();

        //Asumimos que el primer número es el menor
        
        
        if(b<a){
        	if(c<b){
        		System.out.println(c+" "b+" "a);

        	}else{
        		if(c<a){
        			System.out.println(b+" "+c+" "+a);
        		}

        	}
        }else{
        	if(c<a){
        		System.out.println(a+" "+b+" "+c);
        	}
        }
        
       
        
		

		
		//Mostramos el resultado
		System.out.print("El orden es: ");
		
		kb.close();
		}	
}
	
