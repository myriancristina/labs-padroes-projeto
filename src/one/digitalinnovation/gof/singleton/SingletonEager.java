package one.digitalinnovation.gof.singleton;

/**
 * Singleton Eager.
 * @author @myriancristina
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}