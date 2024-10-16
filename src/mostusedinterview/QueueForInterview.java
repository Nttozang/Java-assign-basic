package mostusedinterview;

import java.util.LinkedList;
import java.util.Queue;

public class QueueForInterview {
    private record foodQueue(String name){}
    public static void main(String[] args) {
        LinkedList<foodQueue> queue = new LinkedList<>();
        var food1 = new foodQueue("pizza");
        var food2 = new foodQueue("somtom");
        var food3 = new foodQueue("kfc");
        var food4 = new foodQueue("icr-cream");
        var food5 = new foodQueue("cocava");

        queue.offer(food1);
        queue.offer(food2);
        queue.offer(food3);
        queue.offer(food4);
        queue.offer(food5);
        queue.pollFirst();
        //System.out.println(queue);
        while (!queue.isEmpty()){
            var food = queue.pollFirst();
            System.out.println(queue);
        }
        System.out.println(STR."NO queue\{queue.isEmpty()}");


    }
}
