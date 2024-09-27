package ass.array;

import java.util.Arrays;

public class arraySortedd {
    public static void main(String[] args){
        int[] myNum = {100,200,50,1000,15,648};
        Arrays.sort(myNum);
        for (int i : myNum){
            System.out.println("num :"+i);
        }

        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);
        for (String c : cars){
            System.out.println("car :"+c);
        }
    }
}

