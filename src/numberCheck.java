import java.util.Scanner;

public class numberCheck {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Number : ");

        int check = myNumber.nextInt();
        if (check % 2 == 0){
            System.out.println("Number is EVEN");
        }else {
            System.out.println("Number is Odd");
        }
    }
}

