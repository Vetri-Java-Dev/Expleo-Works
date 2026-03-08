package control_flow;

import java.util.Scanner;

public class FestivalDiscount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total cost : ");
        double totalCost=sc.nextDouble();

        double discountRate;

        if(totalCost<2000) {
            discountRate=5;
        }
        else if(totalCost<5000) {
            discountRate=25;
        }
        else if(totalCost<10000) {
            discountRate=35;
        }
        else {
            discountRate=50;
        }

        double finalAmount=totalCost-(totalCost*discountRate/100);

        System.out.println(finalAmount);
    }
}
