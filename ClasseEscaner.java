package explicacoes;

import java.util.Scanner;

public class ClasseEscanner {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		int numero=sc.nextInt();
		
		System.out.println("O valor digitado pela pessoa corresponde a:"+numero);
		
	}
	
}
