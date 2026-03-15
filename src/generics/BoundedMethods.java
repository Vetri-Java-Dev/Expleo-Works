package generics;

public class BoundedMethods {

    public static <T extends Number> void print(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        print(10);
        print(20.5);
    }
}