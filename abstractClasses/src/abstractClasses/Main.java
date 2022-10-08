package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanCalculator calculator=new WomanCalculator();
		calculator.hesapla();
		calculator.gameOver();
		
		BaseGameCalculator baseGameCalculator = new ManCalculator();
		baseGameCalculator.hesapla();
		baseGameCalculator.gameOver();
	}

}
