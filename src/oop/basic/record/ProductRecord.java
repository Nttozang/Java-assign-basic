package oop.basic.record;

import java.math.BigDecimal;



//sp class to stroe data as immutable
//be java (modern) - Use record to rapresent data communication schema

public record ProductRecord(
        String name,
        String type,
        BigDecimal prices,
        String brand
) {

}
