package mostusedinterview;

import java.util.Arrays;

public class ArrayForInterview {
    public static void main(String[] args) {
        // datatype [] variable = new datatype[n]
        int[] data = new int[20];

        //mainpulate -> index
        int index = 0;
        data[index] = 5 ;
        System.out.println(Arrays.toString(data));

        String[] name = {"kari","char","ntt"};
        System.out.println(name.length);

        int[] data2 = new int[20];
        Arrays.fill(data2,2);
        System.out.println(Arrays.toString(data2));

        int[] numbers = new int[8];
        numbers[0] = 5;
        numbers[1] = 9;
        numbers[2] = 4;
        numbers[3] =8;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
