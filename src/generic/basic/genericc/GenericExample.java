package generic.basic.genericc;

import generic.basic.PrintWriter;
import generic.basic.ProductGene;

public class GenericExample {
    public static void main(String[] args) {
        PrintWriter<Integer> printWriter = new PrintWriter<>();
        printWriter.print(9);

        var doublePrintWriter = new PrintWriter<Double>();
        doublePrintWriter.print(10.0);

        PrintWriter<ProductGene> productPrintWriter = new PrintWriter<>();
        var iphone = (new ProductGene("iphone",35000.00));

        genericMethod(9);
        genericMethod(10.0);
        genericMethod(iphone);
    }

    private static <T> void genericMethod(T data){
        System.out.println("Generic method");
        System.out.println(data);
    }
}
