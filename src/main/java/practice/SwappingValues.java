package practice;

import java.util.Scanner;

public class SwappingValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int temp = 0;

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The numbers are now reversed.");
        System.out.println("Number 1 is :" + number1 + " and Number 2 is : "+ number2);
    }
}
