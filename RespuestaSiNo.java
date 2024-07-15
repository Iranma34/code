import java.util.Scanner;

//Este programa pregunta al usuario si o no y muestra su respuesta por pantalla
//Para responder si tecleará una s y una n en caso negativo
//En cualquier otro caso, el programa vuelve a hacer la pregunta
public class RespuestaSiNo{
	
	static Scanner kb=new Scanner(System.in);

	public static void main(String[] args){
		char respuesta;
		boolean preguntarOtraVez=true;
		do {
			//Plantear pregunta
			System.out.print("Esta usted feliz?: ");
			//Leer respuesta del usuario
			respuesta=kb.nextLine().charAt(0);
			
			//Decidir que hacer con esa respuesta
			if (respuesta=='S' || respuesta=='s'){
				System.out.println("Me alegro mucho por usted");
				preguntarOtraVez=false;
			}
			if (respuesta=='N' || respuesta=='n') {
				System.out.println("Normal, la vida es un tremendo excremento");
				preguntarOtraVez=false;
			}	
		} while (preguntarOtraVez);
	}

}