package practice;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        String reverse = "";
        char ch;

        for (int i = word.length()-1 ; i >= 0 ; i-- ){

            ch = word.charAt(i);
            reverse = reverse + ch;
        }
        if (reverse.equalsIgnoreCase(word))
            System.out.println("This is a pallindrome word: "+ word);
        else System.out.println("This is not a pallindrome word: "+ word);
    }
}
