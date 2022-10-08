package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	//eðer yazdýðýmýz bir metodun her class için ayný iþlemi yapmasýný ve deðiþtirilemez olmasýný istiyorsak 
	//yani override edilmesin diyorsak final keywordü kullanarak yapacaðýz.
	
//	public final double hesapla(double tutar) {
//		return tutar * 1.18;
//	}
	

}
