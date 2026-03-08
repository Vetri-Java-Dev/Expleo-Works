package class_object;


class Vehicle{
	void display() {
		System.out.println("Vehicle is running.");
	}
}

class Truck extends Vehicle{
	void display() {
		System.out.println("Truck is running.");
	}
}


public class TruckVehicleDemo {
	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		
		vehicle.display();
		
		vehicle=new Truck();
		
		vehicle.display();
	}
}
