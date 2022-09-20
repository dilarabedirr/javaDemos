package loopDemo;

public class Main {
	public static void main(String[] args) {
		//For
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		//1,3,5 ... tek sayýlarý yazdýrmak için 
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		//1-10 arasýndaki çift sayýlarý yazdýrmak için
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		
		//While
		//For gibi belli bir þart saðlanana kadar iþlemi yapmaya yarar
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");
		
		//do-while döngüsü
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("Do - While döngüsü bitti");
		
		int k=100;
		do {
			System.out.println(k);
			k+=2;
		} while (k<10);
		System.out.println("Do - While döngüsü bitti");
		
	}
}
