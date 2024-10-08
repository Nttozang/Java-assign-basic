package Fundamentals;

public class MathEaxmple {
    public static void main(String[] args) {
        // ABsolute - diif from zero
        System.out.println(Math.abs(-5));

        // Trigonometric - sin cos tan cosec sec cot

        System.out.println(Math.sin(Math.toRadians(45)));

        // power **

        System.out.println(Math.pow(2,10));

        //square root
        System.out.println(Math.sqrt(25));

        //Compare
        var min = Math.min(5,9);
        var max = Math.max(5,9);
        System.out.println(min);
        System.out.println(max);

        /*Integer.min();
        Integer.max();
        Double.min()*/

        // round floor,ceil
        System.out.println(Math.round(8.5));
        System.out.println(Math.ceil(8.1));
        System.out.println(Math.floor(8.2));

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.TAU);
    }
}
