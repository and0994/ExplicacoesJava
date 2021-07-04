package explicacoes;

public class IfElse {

	public static void main(String[] args) {
		int valor = 23;
				
				if (valor<11) {
					System.out.println("Valor menor que 10");
				} 
				else if(valor>10 && valor<20){
					System.out.println("Valor está entre 11 e 20");
				} 
				else if(valor>20 && valor<30) {
					System.out.println("Valor está entre 21 e 30");
				}
				else {
					System.out.println("Não pode entrar no parque");
				}
		}
	
}
