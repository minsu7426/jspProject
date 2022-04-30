package dao;

import java.util.ArrayList;
import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	//ProductRepository 데이터 타입
	//class변수(static), 전역변수, 참조변수
	public static ProductRepository getInstance() {
		return instance; //값 혹은 변수 ProductRepository는 리턴타입
	}
	
	//함수의 모양을 하고있다.
	//데이터 타입이 없다. (리턴 값이 없다)
	//이름은 반드시 클래스의 이름과 같아야 한다.
	//이것은 생성자다~
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone 12 mini", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		phone.setFilename("P1234.png");
		
		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3inch, IPS LED display, 5rd Generation Intel Core Processors");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		notebook.setFilename("P1235.png");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8*125.6*6.6m, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		tablet.setFilename("P1236.png");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	
	public Product getProuctById(String productId) {
		Product productById = null;
		
		for(int i = 0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
