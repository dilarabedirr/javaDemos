package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bug�n hava �ok g�zel";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s� : "+mesaj.length());
		System.out.println("5. Eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(". Ya�as�n!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("l"));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		//yaz�lan karakterin metin i�inde ka��nc� indexte oldu�unu bulmaya yarar
		System.out.println(mesaj.indexOf("a"));
		//aramaya en sa�dan ba�lar
		System.out.println(mesaj.lastIndexOf("a")); 
		
		//ilgili metindeki baz� karakterleri de�i�tirmeye yarar
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj);
		
		//bir metnin i�erisinden bir par�a almaya yarar.
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 5));
		
		//bir metni belli bir karakter dizisini dikkate alarak ay�rmaya yarar
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		//mesaj� k���k harfe �evirir.
		System.out.println(mesaj.toLowerCase());
		//mesaj� b�y�k harfe �evirir.
		System.out.println(mesaj.toUpperCase());
		
		//mesaj ba��nda ve sonundaki bo�luklar� atmam�z� sa�lar.
		System.out.println(mesaj.trim());
	}

}
