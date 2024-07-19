import java.util.Scanner;

/**Este programa pregunta al usuario la longitud de los tres lados de un triángulo, a continuación
comprueba que ese triángulo puede existir (teorema de pitágoras: h^2 = (c^2 + c^2)) y determina
si se trata de un triángulo equilatero, isosceles o escaleno**/

public class CompruebaTriangulo{

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese la longitud del primer lado: ");
		int lado1=sc.nextInt();
		sc.nextLine();

		System.out.print("Ingrese la longitud del segundo lado: ");
		int lado2=sc.nextInt();
		sc.nextLine();

		System.out.print("Ingrese la longitud del tercer lado: ");
		int lado3=sc.nextInt();
		sc.nextLine();

		if (existe(lado1,lado2,lado3)) {
			if(lado1==lado2 && lado2==lado3){
				System.out.println("El triángulo es equilatero");
			} else {
				if(lado1==lado2 || lado1==lado3 || lado2==lado3){
					System.out.println("El triangulo es isosceles");
				} else {
					System.out.println("El triangulo es escaleno");
				}
			}
		} else {
			System.out.println("Este triangulo no existe");
		}
		sc.close();
	}

	public static boolean existe(int a, int b, int c){
        return (a+b>c) && (a+c>b) && (b+c>a);
	}
}