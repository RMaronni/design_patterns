package creational.singleton;

// The Singleton
public class ProductFactory {
	
	private static ProductFactory instance = null;
		
	
	// Constructor
	private ProductFactory() {
		
	}
	
	
	// Method to get the instance
	public static ProductFactory getInstance() {
		if(instance == null) {
			instance = new ProductFactory();
		}
		return instance;
	}
	
	
	public Product createProduct() {
		return new Product();
	}

}
