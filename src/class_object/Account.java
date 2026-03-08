//Model for account object

package class_object;
import java.util.Scanner;

public class Account {
	
	private String id;
	private String name;
	private int balance;
	
	static Scanner sc=new Scanner(System.in);
	
	Account(){}
	
	Account(String id,String name){
		this.id=id;
		this.name=name;
	}
	
	Account(String id,String name,int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	//Getters
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
	//Setters
	public void setId(String id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public int credit(int amount) {
		
		while(amount<0) {
			System.out.print("Enter valid amount : ");
			amount=sc.nextInt();
		}
		
		balance+=amount;
		
		System.out.println("Amount credited successfully.");
		
		return balance;
	}
	
	public int debit(int amount) {
		
		while(amount>balance) {
			System.out.print("Amount exceeds balance/nEnter valid amount : ");
			amount=sc.nextInt();
		}
		
		balance-=amount;
		
		System.out.println("Amount debited successfully.");
		return balance;
	}
	
	public int transferTo(Account account,int amount) {
		
		while(amount<0) {
			System.out.print("Enter valid amount : ");
			amount=sc.nextInt();
		}
		
		account.setBalance(account.getBalance()+amount);
		
		System.out.println("Amount transfered successfully.");
		
		return balance;
	}
	
	@Override
	public String toString() {
		return "Account id : "+id
				+"\nAccount name : "+name
				+"\nBalance : "+balance;
	}
	
}
