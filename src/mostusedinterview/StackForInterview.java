package mostusedinterview;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackForInterview {
    private record BookStackFor(String title){}

    public static void main(String[] args) {
        Deque<BookStackFor> stack = new ArrayDeque<>();
        var book1 = new BookStackFor("nanomachine");
        var book3 = new BookStackFor("god eye");
        var book2 = new BookStackFor("looksim");
        var book4 = new BookStackFor("the world after fall");
        var book5 = new BookStackFor("word trade");

        stack.push(book1);
        stack.push(book2);
        stack.push(book3);
        stack.push(book4);
        //System.out.println(stack.peek());
        stack.offerFirst(book5);
        //System.out.println(stack.peek());
        stack.pollLast();
        while (!stack.isEmpty()){
            var book = stack.pollFirst();
        }
        System.out.println(STR." Stack is empty \{stack.isEmpty()}");
        System.out.println(stack.size());


    }
}
