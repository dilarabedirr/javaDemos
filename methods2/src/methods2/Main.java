package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0, 2); // return deðer döndürüyor.
		String sehir = sehirVer();
		System.out.println(sehir);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		System.out.println(yeniMesaj);
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void guncelle() {
		System.out.println("güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla2(int... sayilar) { // variable arguments
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}
