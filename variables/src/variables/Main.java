package variables;

public class Main {

	public static void main(String[] args) {
		// Reusability - bir kere yaz tekrar tekrar kullan demek. Yeni bir kere yaz her
		// yerde kullan.
		// De�i�kenlere camelCasing isimlendirme yap�l�r.
		// Code Refactoring - k�t� kodlar� temizleme
		// + -> String ve int de�erlerini metinsel toplama yapar, ikisi de int olsayd�
		// say�sal toplama yapard�.
		// String metinsel ifadeler i�in, int tam say� ifadeler i�in kullan�l�r.
		// De�i�kenleri �al��t���m�z blokta tekrar tekrar kullanabilmek i�in ve
		// bellekten tasarruf yapmak i�in kullan�yoruz.
		int ogrenciSayisi = 10;
		String mesaj = "��renci say�s� : ";
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println("��renci Say�m : " + ogrenciSayisi);
	}

}
