package practice;

import java.util.Scanner;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int counter[] = new int[256];

        // counting the frequency of characters
        for (int i = 0 ; i < word.length(); i ++){
            counter[(int)word.charAt(i)]++;
        }

        //printing the frequency of characters
        for (int i = 0 ; i < 256 ; i++){
            if(counter[i]!=0){
                System.out.println((char)i + "-->" + counter[i]);
            }
        }
    }
}
