package variables;

public class Main {

	public static void main(String[] args) {
		// Reusability - bir kere yaz tekrar tekrar kullan demek. Yeni bir kere yaz her
		// yerde kullan.
		// Deðiþkenlere camelCasing isimlendirme yapýlýr.
		// Code Refactoring - kötü kodlarý temizleme
		// + -> String ve int deðerlerini metinsel toplama yapar, ikisi de int olsaydý
		// sayýsal toplama yapardý.
		// String metinsel ifadeler için, int tam sayý ifadeler için kullanýlýr.
		// Deðiþkenleri çalýþtýðýmýz blokta tekrar tekrar kullanabilmek için ve
		// bellekten tasarruf yapmak için kullanýyoruz.
		int ogrenciSayisi = 10;
		String mesaj = "Öðrenci sayýsý : ";
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println("Öðrenci Sayým : " + ogrenciSayisi);
	}

}
