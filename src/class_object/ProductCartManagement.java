//Class to test Product and Cart class

package class_object;
import java.util.Scanner;

public class ProductCartManagement {
	public static void main(String[] args) {
		
		 	Scanner sc=new Scanner(System.in);
	        Cart cart=new Cart();

	        int choice;

	        do{
	            System.out.println("\n---- Shopping Cart Menu ----");
	            System.out.println("1. Add Product");
	            System.out.println("2. Remove Product");
	            System.out.println("3. View Cart Items");
	            System.out.println("4. Calculate Total");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Product Id: ");
	                    int id = sc.nextInt();
	                    sc.nextLine(); 

	                    System.out.print("Enter Product Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Price: ");
	                    double price = sc.nextDouble();

	                    System.out.print("Enter Quantity: ");
	                    int quantity = sc.nextInt();

	                    Product product = new Product(id, name, price, quantity);
	                    cart.addProduct(product);
	                    break;

	                case 2:
	                    System.out.print("Enter Product Id to remove: ");
	                    int removeId = sc.nextInt();
	                    cart.removeProduct(removeId);
	                    break;

	                case 3:
	                    cart.displayAllCartItems();
	                    break;

	                case 4:
	                    double total = cart.calculateCartTotal();
	                    System.out.println("Total Cart Amount: " + total);
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while(choice!=5);
	}
}
