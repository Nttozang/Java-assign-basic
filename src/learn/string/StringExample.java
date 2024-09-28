package learn.string;

import javax.management.StringValueExp;
import java.util.Arrays;
import java.util.Locale;

public class StringExample {
    public static void main(String[] args){
        /*String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZasdafdfg";
        txt = txt.concat(", karina");
        char[] myArray = txt.toCharArray();
        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println(txt.toUpperCase());
        var ex1 = "ex";
        System.out.println(ex1.equals("EX"));
        System.out.println(ex1.equalsIgnoreCase("ex"));*/
        stringEx2();

    }

    public static void stringEx2(){
        String name = "ntt ";
        int exp = 5;
        String nation = " thai";
        String key = name + exp + nation;
        StringBuilder sb = new StringBuilder("hello : ");
        sb.append(key);
        System.out.println(sb.toString());


        String text1 =
    """
    Hello,
        MY,
    World!
    """;
        System.out.print(text1);

        String [] mArray = {name, String.valueOf(exp),nation};
        String a = String.join("-",mArray);
        System.out.println(a);
    }
}
