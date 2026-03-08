package interfaces;

import java.util.function.DoubleToIntFunction;

public interface Shape {
	double DEFAULT_VALUE=1.0;
	
	default void getDescription() {
		System.out.println("Shapen with unspecified dimensions");
	}
	
	void getArea();
	void getPerimeter();
}
