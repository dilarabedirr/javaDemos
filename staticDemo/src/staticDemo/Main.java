package staticDemo;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "mouse";
		product.price = 10;
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		DatabaseHelper.Connection.createConnection();
	}

}
