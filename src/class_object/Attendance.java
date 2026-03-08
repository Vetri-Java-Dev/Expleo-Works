//Model for Attendance associated with Employee 

package class_object;

import java.lang.classfile.Signature.ThrowableSig;
import java.lang.classfile.attribute.NestHostAttribute;
import java.time.LocalTime;

public class Attendance {
	
	private int empId;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private boolean isCheckedIn;
	private boolean isCheckedOut;
	
	public Attendance(){}
	
	public Attendance(int empId) {
		this.empId=empId;
	}
	
	public Attendance(int empId,
			LocalTime checkInTime,
			LocalTime checkOutTime,
			boolean isCheckedIn,
			boolean isCheckedOut){
		
		this.empId=empId;
		this.checkInTime=checkInTime;
		this.checkOutTime=checkOutTime;
		this.isCheckedIn=isCheckedIn;
		this.isCheckedOut=isCheckedOut;
	}
	
	//Getters
	public int getId() {
		return empId;
	}
	public LocalTime getCheckedInTime() {
		return checkInTime;
	}
	public LocalTime getCheckedOutTime() {
		return checkOutTime;
	}
	public boolean getIsCheckedIn() {
		return isCheckedIn;
	}
	public boolean getIsCheckedOut() {
		return isCheckedOut;
	}
	
	
	public void markCheckIn() {
		
		if(isCheckedIn) {
			System.out.print("Already checked in.");
			return;
		}
		
		LocalTime time=LocalTime.now();
		this.checkInTime=time;
		
		isCheckedIn=true;
	}
	
	public void markCheckOut() {
		
		if(!isCheckedIn) {
			System.out.print("Without checkin checkout is not possible.");
			return;
		}
		
		if(isCheckedOut) {
			System.out.print("Already checked out.");
			return;
		}
		
		LocalTime time=LocalTime.now();
		this.checkOutTime=time;
		
		isCheckedOut=true;
	}
	
	@Override
    public String toString() {
        return "Employee ID: " + empId +
                "\nCheck in Time: " + (checkInTime!=null ? checkInTime : "Not Checked In") +
                "\nCheck out Time: " + (checkOutTime!=null ? checkOutTime : "Not Checked Out");
    }
	
}
