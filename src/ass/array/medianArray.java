package ass.array;

import java.util.Arrays;

public class medianArray {
    public static void main(String[] args){
        //step 1 > import array number
        //step 2 > sort array number
        //step 3 > find median
            // if == number odd show median myNum[length / 2]
            // else == number even show median myNum[length / 2 - 1] + myNum[length / 2]
        int[] myNum = {1,9,8,4,33,5,7,6,87,12,6,8,15};
        Arrays.sort(myNum);

        double median ;
        int length = myNum.length;

        if(length % 2 == 1){
            median = myNum[length/2];
        }else {
            median = (myNum[length/2-1] + myNum[length/2])/2.0;
        }
        System.out.println("Median : "+median);
    }
}
