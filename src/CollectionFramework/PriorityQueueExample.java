package CollectionFramework;

import CollectionFramework.model.Product;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        obgPriority();
        //Default is min heap
        /*PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(50);
        pq.add(70);
        pq.add(170);
        pq.add(2);
        pq.add(1);

        System.out.println(pq.size());
        System.out.println(pq.poll());
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }*/

        //Maxheap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(20);
        maxHeap.add(50);
        maxHeap.add(70);
        maxHeap.add(170);
        maxHeap.add(2);
        maxHeap.add(1);

        System.out.println(maxHeap.size());
        while (!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }
    }

    private static void obgPriority() {
        PriorityQueue<Product> pq = new PriorityQueue<>(Comparator.comparing(Product::prices).reversed());
       //DESC PriorityQueue<Product> pq = new PriorityQueue<>(Comparator.comparing(Product::prices).reversed());
        Product pdPr1 = new Product("nut",100000.00,1);
        Product pdPr2 = new Product("chaewon",10000000.00,5);
        Product pdPr3 = new Product("karina",200000000.00,4);
        Product pdPr4 = new Product("lisa",50.00,2);
        pq.add(pdPr1);
        pq.add(pdPr2);
        pq.add(pdPr3);
        pq.add(pdPr4);

        // แสดงผลสมาชิกใน PriorityQueue
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

}
