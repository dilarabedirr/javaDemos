package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	//e�er yazd���m�z bir metodun her class i�in ayn� i�lemi yapmas�n� ve de�i�tirilemez olmas�n� istiyorsak 
	//yani override edilmesin diyorsak final keyword� kullanarak yapaca��z.
	
//	public final double hesapla(double tutar) {
//		return tutar * 1.18;
//	}
	

}
