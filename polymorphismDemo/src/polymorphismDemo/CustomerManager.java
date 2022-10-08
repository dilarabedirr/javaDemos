package polymorphismDemo;

public class CustomerManager {

	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("m��teri eklendi");
		baseLogger.log("customer class� i�indeki mesaj");
		
	}

}
