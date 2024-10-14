package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> intergerList = List.of(1,4,5,7,8,9,3,2,6,0);
        Stream<Integer> result = intergerList.stream();

     List<Integer> resultReal = result.map(n -> n * 2)
             .filter(n -> n % 5 == 0)
             .toList();
        System.out.println(resultReal);

        var intStream = IntStream.of(1,4,5,7,8,9,3,2,6,0);
        var avg = intStream.average()
                .orElseThrow(() -> new RuntimeException("Error"));
        System.out.println(avg);

        var fruitStream = Stream.of(
                "apple",
                "banana",
                "melon",
                "orange",
                "apple",
                "apple",
                "banana");
        var countFrequency  = fruitStream.collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countFrequency);


        List<Student> students = List.of(
                new Student("ntt",'E'),
                new Student("att",'C'),
                new Student("ztt",'A'),
                new Student("itt",'B'),
                new Student("Ott",'C'),
                new Student("ctt",'A')
        );
        var interestGrade = Set.of('B','C');
        Map<Character,List<Student>> resultStudent = students.stream()
                .filter(s -> interestGrade.contains(s.grade))
                .collect(Collectors.groupingBy(s -> s.grade));
        System.out.println(resultStudent);

    }
    private record Student(String name,char grade){

    }

}
