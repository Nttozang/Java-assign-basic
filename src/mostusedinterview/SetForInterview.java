package mostusedinterview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetForInterview {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(List.of(1, 2, 5, 7, 2, 3, 8, 9, 4, 2, 1));
        System.out.println(hashSet);

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(STR."Value \{iterator.next()} ");
        }

        System.out.println(hashSet.size());
    }
}