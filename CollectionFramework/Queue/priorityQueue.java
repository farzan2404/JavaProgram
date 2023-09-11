// package CollectionFramework.Queue;

import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(43);
        pq.offer(22);
        pq.offer(65);
        pq.offer(33);
        pq.offer(70);
        pq.offer(10);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

        // Comparator.reverseOrder(); // will covert min heap function into max heap.
    }
}
