package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNtt {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(70);
        System.out.println(number);

        List<Integer> result = number.stream()
                .filter(n -> n % 2 ==0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(result);
    }

}
