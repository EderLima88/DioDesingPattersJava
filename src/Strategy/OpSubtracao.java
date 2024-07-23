package Strategy;

public class OpSubtracao implements Strategy{
	@Override
	public int fazerOperacao(int n1, int n2) {
	return n1 - n2;
}
}