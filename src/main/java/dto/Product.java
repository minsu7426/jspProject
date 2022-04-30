package dto;

import java.io.Serializable;

public class Product implements Serializable {
	
	private static final long serialVersionUID = -4274700572038677000L;
	
	private String productId; 		//상품 아이디
	private String pName; 			//상품명
	private int unitPrice; 			//상품 가격
	private String description; 	//상품 설명
	private String manufacturer;	//제조사
	private String category; 		//분류
	private long unitsInStock; 		//재고 수
	private String condition; 		//신상품 or 중고품 or 재생품
	private String filename;		//이미지 파일 명
	private int quantity;			//장바구니에 담은 개수
	
	public Product() {
		super();
	}
	
	//리턴타입이 없고, 클래스이름하고 같으니 product 클래스의 전역변수를 세팅하는 생성자자 함수다.(new)객체 생성 하기전
	public Product(String productId, String pName, int unitPrice) {
		//파라미터 값을 순서대로 매개변수에 집어넣는다.
		this.productId = productId;
		//매개변수의 값을 전역변수(파란색)에 대입한다.
		this.pName = pName;
		this.unitPrice = unitPrice;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
