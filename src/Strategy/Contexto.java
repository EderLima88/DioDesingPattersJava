package Strategy;

public class Contexto {

	private Strategy strategy;
	
	public Contexto(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int exeStrategy(int n1, int n2) {
		return strategy.fazerOperacao(n1, n2);
	}
	
}
