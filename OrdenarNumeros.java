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
    		// B es menor que A
        	if(c<b){
        		// C es menor que B
        		System.out.println(c+" "+b+" "+a);
        	}else{
				// C es mayor que B
	    		if(c<a){
	    			// C es menor que A
	    			System.out.println(b+" "+c+" "+a);
	    		} else {
	    			// C es mayor que A
	    			System.out.println(b+" "+a+" "+c);
	    		}
	        }
        }else{
        	// B es mayor que A
        	if(c<a){
        		// C es menor que A
        		System.out.println(c+" "+a+" "+b);
        	} else {
        		// C es mayor que A
        		if(c<b){
        			// C es menor que B
        			System.out.println(a+" "+c+" "+b);
        		} else {
        			// C es mayor que B
        			System.out.println(a+" "+b+" "+c);
        		}
        	}
        }
		
		//Mostramos el resultado
		//System.out.print("El orden es: ");
		
		kb.close();
		}	
}
	
