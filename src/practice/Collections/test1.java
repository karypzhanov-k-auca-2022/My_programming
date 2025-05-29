package practice.Collections;

import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class test1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(6);
        queue.offer(4);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("------------------");
        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer(-9999);
        priorityQueue.offer(9999);
        priorityQueue.offer(2);
        priorityQueue.offer(6); 
        priorityQueue.offer(4);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
