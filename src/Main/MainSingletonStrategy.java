package Main;

import Strategy.Contexto;
import Strategy.OpSoma;
import Strategy.OpSubtracao;
import singleton.Singleton;

public class MainSingletonStrategy {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton("Eder Barreto");
		System.out.println("Resultado do Singleton: ");	
		System.out.println(singleton.values);
			
			
			
		Contexto contextoSoma = new Contexto(new OpSoma());
		System.out.println("Resultado da Strategy: ");
		System.out.println("Soma: " + contextoSoma.exeStrategy(5, 10));

		Contexto contextoSubtracao = new Contexto(new OpSubtracao());
		System.out.println("Subtracao: " + contextoSubtracao.exeStrategy(50, 25));
	}

}
