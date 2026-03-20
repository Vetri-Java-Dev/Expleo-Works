package collectionHandson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Person implements Comparable<Person>{
	String firstName;
	String lastName;
	
	Person(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Person o) {
		return this.firstName.compareTo(o.getFirstName());
	}
	
}
/* Priscilla Wagner, 
Tom Parker, Elvis Presley)*/
public class FirstNameSorting {
	public static void main(String[] args) {
		
		ArrayList<Person> persons=new ArrayList<>();
		
		persons.add(new Person("Priscilla", "Wagner"));
		persons.add(new Person("Tom", "Parker"));
		persons.add(new Person("Elvis", "Presley"));
		persons.add(new Person("Werner", "Zeigler"));
		
		Collections.sort(persons);
		
	}
}
