package DigitalPayment;
import java.util.Scanner;
import java.time.LocalDate;

public class PaymentDemo {
	
	static Scanner sc=new Scanner(System.in);
	
	public static String getTransactionIdInput() {
		
		System.out.print("Enter Transaction Id : ");
		String transactionId=sc.nextLine();
		
		return transactionId;
	}
	public static double getAmountInput() {
		
		System.out.print("Enter Amount : ");
		double amount =sc.nextDouble();
		
		sc.nextLine();
		
		return amount;
	}
	public static String getCustomerNameInput() {
		
		System.out.print("Enter Customer Name : ");
		String customerName=sc.nextLine();
	
		return customerName;
	}
	
	
	public static void main(String[] args) {
			
		int choice;
		
		do{
			System.out.println("The Payment Options : ");
			System.out.println("1.Credit card payment.");
			System.out.println("2.Net banking payment.");
			System.out.println("3.UPI payment.");
			System.out.println("4.Exit.");
			System.out.print("Choose a payment method : ");
			
			choice=sc.nextInt();
			sc.nextLine();
			
			String transactionId;
			Double amount;
			String customerName;
			
			switch(choice) {
				case 1:
					transactionId=getTransactionIdInput();
					amount=getAmountInput();
					customerName=getCustomerNameInput();
					
					System.out.print("Enter Card Number : ");
					String cardNumber=sc.nextLine();
					
					System.out.print("Enter cvv : ");
					String cvv=sc.nextLine();
					
					System.out.print("Enter expiry date (YYYY-MM-DD) : ");
					LocalDate expiry=LocalDate.parse(sc.next());
					
					Payment currentPayment=new CreditCardPayment(transactionId, amount,
							customerName,cardNumber,cvv,expiry);
					
					currentPayment.executeTransaction();
					System.out.println("");
				
					break;
					
				case 2:
					
					transactionId=getTransactionIdInput();
					amount=getAmountInput();
					customerName=getCustomerNameInput();
					
					System.out.print("Enter Bank Name : ");
					String bankName=sc.nextLine();
					
					System.out.print("Enter Account numer : ");
					String accountNumber=sc.nextLine();
					
					System.out.print("Enter IFSC code : ");
					String ifscCode=sc.nextLine();
					
					currentPayment=new NetBankingPayment(transactionId, amount,
							customerName,bankName,accountNumber,ifscCode);
					
					currentPayment.executeTransaction();
					System.out.println("");
					
					break;
				
				case 3:
					transactionId=getTransactionIdInput();
					amount=getAmountInput();
					customerName=getCustomerNameInput();
					
					System.out.print("Enter UPI Id : ");
					String upiId=sc.nextLine();
					
					System.out.print("Enter UPI Pin : ");
					String upiPin=sc.nextLine();
					
					currentPayment=new UPIPayment(transactionId, amount, customerName, upiId, upiPin);
					
					currentPayment.executeTransaction();
					System.out.println("");
					
					break;
				
				case 4:
					System.out.println("Exiting...");
				
				default:
					System.out.print("Invalid choice try again : ");
			}
		}while(choice!=4);
		
	}
}
