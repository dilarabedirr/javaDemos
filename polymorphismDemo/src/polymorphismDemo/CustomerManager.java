package polymorphismDemo;

public class CustomerManager {

	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("müþteri eklendi");
		baseLogger.log("customer classý içindeki mesaj");
		
	}

}
