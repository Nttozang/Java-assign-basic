package ass.gerneral;

import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter a number you want to take the factorial of: ");
        int check = myNumber.nextInt();
        long fact = 1; //
        for (int i = 1 ; i <= check ; i++){
            fact *= i; //
            // check = 4! = 24
            // fact = 1 i = 1 = (1*1)
            // fact = 1 i = 2 = (2)
            // fact = 2 i = 3 = (6)
            // fact = 6 i = 4 = (24)
        }
        System.out.println(check + " ! "+fact);
    }
}
