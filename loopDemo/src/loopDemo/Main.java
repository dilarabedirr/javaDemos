package loopDemo;

public class Main {
	public static void main(String[] args) {
		//For
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For d�ng�s� bitti");
		//1,3,5 ... tek say�lar� yazd�rmak i�in 
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For d�ng�s� bitti");
		//1-10 aras�ndaki �ift say�lar� yazd�rmak i�in
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For d�ng�s� bitti");
		
		//While
		//For gibi belli bir �art sa�lanana kadar i�lemi yapmaya yarar
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While d�ng�s� bitti");
		
		//do-while d�ng�s�
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("Do - While d�ng�s� bitti");
		
		int k=100;
		do {
			System.out.println(k);
			k+=2;
		} while (k<10);
		System.out.println("Do - While d�ng�s� bitti");
		
	}
}
