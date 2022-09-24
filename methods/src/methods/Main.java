package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulma();
	}

	public static void sayiBulma() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "Aranan sayı listede var: " + aranacak;
			mesajVer(mesaj);// parametreli metot.
		} else {
			mesajVer("Aradığınız sayı mevcut değil: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
