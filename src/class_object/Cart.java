//Model for Cart to handle Product object

package class_object;

import java.util.*;

public class Cart {
	
	private List<Product> products=new ArrayList<>();
	
	public void addProduct(Product product) {
		
		for(Product p : products) {
			
            if (p.getProductId()==product.getProductId()) {
                p.setQuantity(p.getQuantity() + product.getQuantity());
                System.out.println("Product quantity updated in cart.");
                return;
            }
        }
		
		products.add(product);
		
		System.out.print("Product added succesfully.");
	}
	
	public void removeProduct(int productId) {
		boolean removed=products.removeIf(p -> p.getProductId()==productId);
		
		if(!removed) {
			System.out.println("No product exists with that id.");
		}
		else {
			System.out.println("Product removed succesfully.");
		}
	}
	
	public double calculateCartTotal() {
		double totalAmount=0;
		
		for(Product product : products) {
			totalAmount+=product.calculateTotal();
		}
		
		return totalAmount;
	}
	
	public void displayAllCartItems() {
		
		if (products.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
 
		for(Product product : products) {
			System.out.println(product.getProductDetails());
			System.out.println("--------------------------");
		}
		System.out.println("Total Cart Value : " + calculateCartTotal());
	}
	
}
