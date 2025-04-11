package BasicCalculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second number:");
        float num2 = scanner.nextFloat();
        System.out.println("possible calculations");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("please select an option: ");
        String choice = scanner.next();

        float result = num1 + num2 ;
        System.out.printf("%.2f * %.2f = %.2f\n" ,num1,num2, result);
    }
}
