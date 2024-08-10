package controleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Insira o primeiro parametro: ");
		Integer parametro1 = terminal.nextInt();
		System.out.println("Insira o segundo parametro: ");
		Integer parametro2 = terminal.nextInt();
		try {
			contar(parametro1, parametro2);
			
		}catch(ParametrosInvalidosException exception) {
			exception.exception(exception);
		}
		
		terminal.close();
			
	}
	
	static void contar(Integer parametro1, Integer parametro2) throws ParametrosInvalidosException {
		if(parametro1 > parametro2) 
			throw new ParametrosInvalidosException();
		
		Integer contagem = parametro2 - parametro1;
		
		for(int i = 0; i <= contagem; i++) {
			System.out.println("O número " + (i+1) + " é: " + parametro1);
			parametro1++;
		}
		
		
	}
}
