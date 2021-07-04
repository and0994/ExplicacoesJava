package explicacoes;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira o numero de um mes do ano:");
		int mes=sc.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("Janeiro");
			System.out.println("Signo Capricórnio");
		break;
		case 2:
			System.out.println("Fevereiro");
			System.out.println("Signo Aquário");
		break;
		case 3:
			System.out.println("Março");
			System.out.println("Signo Peixes");
		break;
		case 4:
			System.out.println("Abril");
			System.out.println("Signo Aries.\n");
		break;
		case 5:
			System.out.println("Maio");
			System.out.println("Signo Touro.\n");
		break;
		case 6:
			System.out.println("Junho");
			System.out.println("Signo Gêmeos");
		break;
		case 7:
			System.out.println("Julho");
			System.out.println("Signo Câncer");
		break;
		case 8:
			System.out.println("Agosto");
			System.out.println("Signo Leão");
		break;
		case 9:
			System.out.println("Setembro");
			System.out.println("Signo Virgem");
		break;
		case 10:
			System.out.println("Outubro");
			System.out.println("Signo Libra");
		break;
		case 11:
			System.out.println("Novembro");
			System.out.println("Signo Escorpião");
		break;
		case 12:
			System.out.println("Dezembro");
			System.out.println("Signo Sagitário");
		break;
		default:
			System.out.println("Insira um mês valido.");
		break;
		}
	}
}
