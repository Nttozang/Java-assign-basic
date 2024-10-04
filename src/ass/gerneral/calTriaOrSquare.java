package ass.gerneral;

import java.util.Scanner;

public class calTriaOrSquare{
    public static <string> void main(String[] args){
    // คำนวนเลือก area สามเหลี่ยม/สี่เหลี่ยม
        Scanner myString = new Scanner(System.in);
        System.out.print("Enter Area : ");
        string areaName = (string) myString.nextLine();

        Scanner numOne = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int cal1 = numOne.nextInt();

        Scanner numTwo = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int cal2 = numTwo.nextInt();

        if(areaName.equals("triangle") ){
            System.out.println("triangle : "+cal1 * cal2 * 0.5);
        }else if(areaName.equals("square")) {
            System.out.println("square : "+cal1 * cal2 );
        }else {
            System.out.println("Invalid:");
        }
    }
}
