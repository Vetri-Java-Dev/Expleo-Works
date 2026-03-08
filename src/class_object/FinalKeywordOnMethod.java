package class_object;

class Helper{
	final void greet() {
		System.out.println("Hii");
	}
}
public class FinalKeywordOnMethod extends Helper {
	
	//void greet() {
		//System.out.println("Good morning.");
	//}
	
	public static void main(String[] args) {
		
		FinalKeywordOnMethod a=new FinalKeywordOnMethod();
		
		a.greet();
	}
}
