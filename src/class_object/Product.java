//Model for product with their attributes and methods

package class_object;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	Product(int productId,String productName,double price,
			int quantity){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	
	//getters
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public String getProductDetails() {
		return "Product Id : "+productId
				+"\nProduct Name : "+productName
				+"\nPrice : "+price
				+"\nQuantity : "+quantity;
	}
	
	public void setQuantity(int quantity) {
		if(quantity<0) {
			System.out.print("Quantity can't be negative.");
			return;
		}
		
		this.quantity=quantity;
		System.out.print("Quantity updated succesfully.");
	}
	
	public double calculateTotal(){
		return price*quantity;
	}
	
}
