package practice;

import java.util.Scanner;

public class PallindromeNumer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int digit=0, reverseNumber=0, orgNumber =0;

        orgNumber = num;

        while(num>0){
            digit = num%10;
            reverseNumber = (reverseNumber * 10) + digit;
            num=num/10;
        }

        if (reverseNumber==orgNumber)
            System.out.println("This is a pallindrome number: "+orgNumber);
        else System.out.println("This is not a pallindrome number: "+orgNumber);
    }
}
