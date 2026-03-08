//Testing functionalities of Employee class

package class_object;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		
		/*Account account=new Account("1", "White",600000);
		
		//credit
		account.credit(100);
		
		//debit
		account.debit(50);
		
		Account account2=new Account("2", "Jesse");
		
		account.transferTo(account, account2, 500);
		
		System.out.println(account);
		
		System.out.println("");
		
		System.out.println(account2);*/
		
		Scanner sc=new Scanner(System.in);
		
		//Account account=new Account();

		while(true) {
			System.out.println("Account operations : ");
			System.out.println("1.Account creation.");
			System.out.println("2.Credit amount.");
			System.out.println("3.Debit amount.");
			System.out.println("4.Transfer amount.");
			System.out.println("5.Enter -1 to exit.\n");
			
			switch(sc.nextInt()) {
				case 1:
					System.out.print("Enter Id : ");
					//account.setId(sc.next());
					
					System.out.print("Enter Name : ");
					//account.setName(sc.next());
					
					System.out.print("Account succesfully created");
					break;
					
					
					
			}
		}
		
	}
}
