import java.util.Scanner;

public class Unarios{
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		int contarMas=0;
		int contarMenos=10;

		for (int i=0; i<3; i++){
			System.out.println("Pulsa enter");
			kb.nextLine();
			contarMas++;
			System.out.println("ContarMas vale: "+contarMas);
		}

		for (int i=0; i<3; i++){
			System.out.println("Pulsa enter");
			kb.nextLine();
			contarMenos--;
			System.out.println("ContarMenos vale: "+contarMenos);
		}

		for (int i=0; i<3; i++){
			System.out.println("Bucle que incrementa: paso "+i);
		}
		for (int i=10; i>7; i--){
			System.out.println("Bucle que disminuye: paso "+i);
		}
	    


	    kb.close();
	}
}