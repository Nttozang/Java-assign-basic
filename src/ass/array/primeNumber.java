package ass.array;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){

    /* prime number -1, N

    N = squrt(N) * squrt(N)
    n = a * b
    a,b < sqrt(N)

    example N = 3
    3 = squrt(3) * squrt(3)
    1.5 , 2 < squrt(3)

  */
        inputNumber();
        inputArrayNumber();
    }
    public static boolean isPrimeNumber (int n){
        int max = (int) Math.sqrt(n);
        for (int current = 2 ; current <= max; current++){
            if(n % current == 0){
                return false;
            }
        }
    return true;
    }

    public static void inputNumber(){
        System.out.println("Enter your username: ");
        Scanner scan = new Scanner(System.in);
        int checkPrime = scan.nextInt();

        boolean result = isPrimeNumber(checkPrime);

        if(result){
            System.out.println("Is prime number");
        }else {
            System.out.println("Is Not prime number");
        }
    }

    public static void inputArrayNumber(){
        int[] myNum = {10,11,12,13,14,9,5,7,8,13,19,21,43};
        for (int i : myNum){
            boolean result = isPrimeNumber(i);
            if(result){
                System.out.println(i + " : Is prime number");
            }else {
                System.out.println(i + " : Is Not prime number");
            }
        }
    }
}
