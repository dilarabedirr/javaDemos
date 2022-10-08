package youTubeEgitim;

import youTubeEgitim.youTubeDemo_.Customer;
import youTubeEgitim.youTubeDemo_.CustomerManager;
import youTubeEgitim.youTubeDemo_.TeacherCreditManager;
import youTubeEgitim.youTubeDemo_.CarCreditManager;
import youTubeEgitim.youTubeDemo_.Company;
import youTubeEgitim.youTubeDemo_.CreditManager;
import youTubeEgitim.youTubeDemo_.Person;

public class Main {

	public static void main(String[] args) {

//		// deðer tipler
//		int sayi1 = 10;
//		int sayi2 = 20;
//		sayi1 = sayi2;
//		sayi2 = 100;
//		System.out.println("deðer tiplerde sonuç : " + sayi1);
//
//		// referans tipler
//
//		int[] sayilar1 = new int[] { 1, 2, 3 };
//		int[] sayilar2 = new int[] { 10, 20, 30 };
//		sayilar1 = sayilar2;
//		sayilar2[0] = 1000;
//		System.out.println("referans tiplerde sonuç : " + sayilar1[0]);
//
//		// class kavramý
//
//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//		creditManager.calculate();
//		creditManager.save();
//
//		Customer customer = new Customer();//örneðini oluþturma, instance oluþturma, instance creation - heapte referans numarasýný oluþturmak.
//		customer.id = 1;	
//		customer.city = "ordu";
//
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
//		customerManager.delete();
//		
//		Company company = new Company();
//		company.taxNumber="123456";
//		company.companyName="arçelik";
//		company.id=100;
//		
//		CustomerManager customerManager2 = new CustomerManager(company);
//		customerManager2.save();
//		customerManager2.delete();
//		
//		Person person = new Person();
//		person.nationalIdentity="111111111111";

		// interfaceler genellikle iþ sýnýflarýnýn metotlarýný imza seviyesinde yazarak
		// yazýlýmda baðýmlýlýðý korumak adýna yapýlan çalýþmadýr.
		// yani interfacelerin amacý yazýlýmdaki baðýmlýlýklarý engellemek iflerden
		// kurtulmaktýr.

		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();
	}

}
