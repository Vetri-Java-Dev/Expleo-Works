package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	public int empId;
	public String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
}

public class SerializationDemo {
	public static void main(String[] args) {
	
		Employee employee=new Employee(1, "Vetri");
		
		try{
			FileOutputStream file=new FileOutputStream("src/fileIO/file.ser");
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			out.writeObject(employee);
			
			out.close();
			file.close();
			
			System.out.println("Object serialized.");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		Employee deserialEmployee=null;
		
		try {
			FileInputStream file=new FileInputStream("src/fileIO/file.ser");
			ObjectInputStream in=new ObjectInputStream(file);
			
			deserialEmployee=(Employee)in.readObject();
			
			System.out.println("Object deserialized.\n");
			
			System.out.println("Employee id : "+deserialEmployee.empId);
			System.out.println("Employee name : "+deserialEmployee.empName);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
