import java.util.Scanner;

//Este programa pregunta al usuario si o no y muestra su respuesta por pantalla
//Para responder si tecleará una s y una n en caso negativo
//En cualquier otro caso, el programa vuelve a hacer la pregunta
public class RespuestaSiNo{
	
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		
		//Plantear pregunta
		System.out.println("¿Desea confirmar?: ");
				
		//Leer respuesta del usuario
		char respuesta=kb.nextLine().charAt(0);

		//Decidir que hacer con esa respuesta
		if((respuesta=='S') || (respuesta=='s')){
			System.out.println("Confirmado");
		} else{
			if((respuesta=='N') || (respuesta=='n')) {
				System.out.println("No confirmado");
			}

		}


	
		kb.close();
	}
}