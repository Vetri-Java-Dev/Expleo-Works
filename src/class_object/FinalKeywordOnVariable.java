package class_object;


public class FinalKeywordOnVariable {
	
	final double PI=3.14579;
	
	FinalKeywordOnVariable(){
		//PI=3.14;
	}
	
	public static void main(String[] args) {
		
		FinalKeywordOnVariable a=new FinalKeywordOnVariable();
		
		System.out.println(a.PI);
	}
}
