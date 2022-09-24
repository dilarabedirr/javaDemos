package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Laptop","asus laptop",3000,2,"siyah");
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Asus Laptop");
		//product.setPrice(5000);
		//product.setStockAmount(39);
		//System.out.println(product.getName());

		ProductManager productManager=new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
	}

}
