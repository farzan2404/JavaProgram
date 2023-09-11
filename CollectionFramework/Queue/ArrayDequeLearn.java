// package CollectionFramework.Queue;

import java.util.ArrayDeque;

public class ArrayDequeLearn {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(22);
        adq.offerLast(25);
        adq.offer(29);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("Deque:" + adq);

        System.out.println(adq.pollFirst());
        System.out.println("Deque:" + adq);

        System.out.println(adq.pollLast());
        System.out.println("Deque:" + adq);

    }
}
