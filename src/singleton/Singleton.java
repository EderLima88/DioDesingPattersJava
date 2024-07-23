package singleton;

public class Singleton {
	private static Singleton instancia;
	public String values;
	
	private Singleton(String value) {
		this.values = value;
	}
	
	public static Singleton getSingleton(String value) {
		
		instancia = new Singleton(value);
		
		return instancia;
	}
	
}
