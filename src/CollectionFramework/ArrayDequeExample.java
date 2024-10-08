package CollectionFramework;


import CollectionFramework.model.Person;

import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDequeExample {
    //Queue - FIFO (FIRST IN - FIRST OUT) "เข้าก่อน ออกก่อน"
    //STACK - LIFO (LAST IN - FIRST OUT) "เข้าหลัง ออกก่อน"
    public static void main(String[] args) {

        var ntt = new Person("ntt");
        var ntt1 = new Person("carina");
        var ntt2 = new Person("chaewon");
        var ntt3 = new Person("pinkk");

        //Queue - FIFO (FIRST IN - FIRST OUT) "เข้าก่อน ออกก่อน"
        Deque<Person> queue = new ArrayDeque<>();
        queue.add(ntt);
        queue.add(ntt1);
        queue.add(ntt2);
        queue.add(ntt3);
       /* System.out.println("Queue peek: " + queue.peek()); //
       // System.out.println("Queue add: " + queue.add(ntt3));
        for(var p : queue){
            System.out.println(p);
        }*/
        System.out.println(queue.pollLast()); // poll = pollfirst
        System.out.println(queue.peek());
        System.out.println(queue.size());


        //ArrayDeque can implement from stack คล้าย stack
        Deque<Person> stack = new ArrayDeque<>();
        stack.offerFirst(ntt);
        stack.offerFirst(ntt1);
        stack.offerFirst(ntt2);
        stack.offerFirst(ntt3);
        // Example of pop stack
        for (var c : stack){
            System.out.println(c);
        }
        System.out.println(stack.pollFirst());
        System.out.println(stack.peekFirst());

    }
}
