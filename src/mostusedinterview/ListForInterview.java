package mostusedinterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListForInterview {
    //Defi
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("hello");

        List<PersonMostUsed> nameList = new ArrayList<>();
        nameList.add(new PersonMostUsed("hi"));
        nameList.add(new PersonMostUsed("hiww"));
        nameList.add(new PersonMostUsed("erew"));

        List<String> newUsers = List.of(
                "toby",
                "popy",
                "ioio",
                "retre"
        );

        name.addAll(newUsers);

        name.add(2,"tyuio");
        System.out.println(name.contains("toby"));
        System.out.println(name);

        nameList.clear();
        System.out.println(nameList);

        List<Integer> numberList = new ArrayList<>(List.of(87, 8, 1, 87, 52, 41, 3, 8, 52, 8));
        numberList.sort(Integer::compare); //ASC
        System.out.println(numberList);
        numberList.sort(Comparator.reverseOrder()); //DESC
        System.out.println(numberList);

        //name.remove(0);
        /*System.out.println(name);
        name.remove("toby");
        System.out.println(name);*/

        List<StatMostUsed> statList = new ArrayList<>(
                List.of(
                        new StatMostUsed(5,81),
        new StatMostUsed(1,8),
        new StatMostUsed(2,1),
        new StatMostUsed(3,87),
        new StatMostUsed(4,89)
                )
        );
        statList.sort((e1,e2) -> Integer.compare(e1.overall, e2.overall()));
        System.out.println(statList);
        statList.sort((e1,e2) -> Integer.compare(e2.overall, e1.overall()));
        System.out.println(statList);

        List<StatMostUsed> find2Number = statList.stream()
                .map(s -> new StatMostUsed(s.playerID(),s.overall() * 3))
                .limit(3)
                .sorted((e1,e2) -> Integer.compare(e1.overall, e2.overall()))
                .collect(Collectors.toList());
        System.out.println(find2Number);

    }
    private record PersonMostUsed(String name){}
    private record StatMostUsed(int playerID,int overall){}

}
