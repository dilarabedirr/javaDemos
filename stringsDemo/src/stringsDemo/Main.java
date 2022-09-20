package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayýsý : "+mesaj.length());
		System.out.println("5. Eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(". Yaþasýn!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("l"));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		//yazýlan karakterin metin içinde kaçýncý indexte olduðunu bulmaya yarar
		System.out.println(mesaj.indexOf("a"));
		//aramaya en saðdan baþlar
		System.out.println(mesaj.lastIndexOf("a")); 
		
		//ilgili metindeki bazý karakterleri deðiþtirmeye yarar
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj);
		
		//bir metnin içerisinden bir parça almaya yarar.
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 5));
		
		//bir metni belli bir karakter dizisini dikkate alarak ayýrmaya yarar
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		//mesajý küçük harfe çevirir.
		System.out.println(mesaj.toLowerCase());
		//mesajý büyük harfe çevirir.
		System.out.println(mesaj.toUpperCase());
		
		//mesaj baþýnda ve sonundaki boþluklarý atmamýzý saðlar.
		System.out.println(mesaj.trim());
	}

}
