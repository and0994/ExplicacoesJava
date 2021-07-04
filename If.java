package explicacoes;

import java.util.Scanner;

public class If {

	public static void main(String[]args){

		System.out.println("Programa Soma");
		soma();
		System.out.println("Segundo Programa Soma");
		soma();
}
	static void soma(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero1=sc.nextInt();

		System.out.println("Digite um número: ");
		int numero2 = sc.nextInt();

		int total = numero1 + numero2;

		System.out.println("A soma dos valores corresponde a: "+total);

		
	}

}
