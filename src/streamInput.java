import java.util.Scanner;

public class streamInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int compare = 0;

        while(true){
            System.out.print("Enter an integer (negative or zero to stop): ");
            input = scanner.nextLine();
            int number = Integer.parseInt(input);

            if (number <= 0){
                break;
            }

            if (number > compare) {
                compare = number;
                System.out.println("Valid: " + number);
            }
        }

        System.out.println("Largest Number Entered: " + compare);
    }
}

