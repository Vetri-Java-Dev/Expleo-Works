package nestedClass;

// static nested class

class Person{
	
	static class Gender{
		void nonStaticMethod() {
			System.out.println("Non Static method.");
		}
		static void staticMethod() {
			System.out.println("Static method.");
		}
	}

	Gender gender=new Gender();
}
public class StaticNestedClass {
	public static void main(String[] args) {
		
		Person person=new Person();
		
		person.gender.nonStaticMethod();
		Person.Gender.staticMethod();
		
	}
}
