package learn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assString {
    public static void main(String[] args){
        //reverseWord();

        //howManyDigit();
        iLoveSeries();
    }
    /*public static void reverseWord(){
        Scanner myWord = new Scanner(System.in);
        System.out.println("Enter word : ");
        String checkReWord = myWord.nextLine();

        char[] try1 = checkReWord.toCharArray();
        for (int i = try1.length-1; i> 0; i--)
            System.out.println(try1[i]);
    }

    public static void howManyDigit(){
        Scanner myWord = new Scanner(System.in);
        System.out.println("Enter word : ");
        String checkDigit = myWord.nextLine();

        char[] try2 = checkDigit.toCharArray();
        int count = 0;

        for (char ch : try2){
            if(Character.isDigit(ch)){
                count++;
            }

        } System.out.println(count);
    }*/
    public static void iLoveSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word : ");
        String checkW = sc.nextLine();
        int count = 0;
        int count2 = 0;
        char[] try3 = checkW.toCharArray();
        char[] vowels = {'a','A','e','E','i','I','o','O','u','U'};

        for(char c : try3){
            if(c == 'u' || c == 'U'){
                count++;
            }
        }

        for(char c : try3) {
            for (char a : vowels){
                if(c == a){
                    count2++;
                }
            }
        }
        int[] counts = new int[26];
        for(char c : try3){
            if(c >= 'a' && c <= 'z'){
                counts[c-'a']++;
            }
        }
        for (int i = 0; i < counts.length; i++) {
            char c = (char) ('a' + i);
            System.out.println(c + ": " + counts[i]);
        }

        System.out.println(count);
        System.out.println(count2);
    }
}
