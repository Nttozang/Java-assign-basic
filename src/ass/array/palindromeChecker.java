package ass.array;

import java.util.Arrays;


public  class palindromeChecker {
    public static void main(String[] args){
        int[] myNum = {1,2,3,3,2,1,7,4,5};
if(isPalindrome(myNum)){
    System.out.println(Arrays.toString(myNum) + "is a palindrome  ");
}else{
    System.out.println(Arrays.toString(myNum) + "is not a palindrome  ");

}
    }

    private static boolean isPalindrome(int[] myNum) {
        int start = 0;
        int end = myNum.length-1;

        while(start < end){
            System.out.println("Compare : "+myNum[start]+" and "+myNum[end]);
            if(myNum[start] != myNum[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}