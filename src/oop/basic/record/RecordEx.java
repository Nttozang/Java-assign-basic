package oop.basic.record;

import java.math.BigDecimal;

public class RecordEx {
    public static void main(String[] args) {
        Product p1 = new Product("macbook","elect", new BigDecimal("1000.00"),"aa");

        ProductRecord p2 = new ProductRecord("laptop","electronic", new BigDecimal("100.00"),"cc");
        System.out.println(p2);
        System.out.println(p2.name());
    }
}
