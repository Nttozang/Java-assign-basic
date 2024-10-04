package ass.gerneral;

import java.util.Scanner;

public class averageTen{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int n = 10 ;
        for (int i = 1 ; i <= n ; i++){
            System.out.print("Enter Number  " + i + " : ");
            double input = Double.parseDouble(scanner.nextLine());
            sum += input;
        }
        double avar = sum/10;
        System.out.println("Average : "+avar);
    }
}
