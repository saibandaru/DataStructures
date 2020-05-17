package com.sai.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class One_IntroductionQueue {

    //Queue is an interface that is defined in java.util package and extends Collections interface.
    // This can hold the items and allows insertion and deletion operations; with a characteristic
    //      of inserting the new element at end and deleting the old element from the front.
    //      FIFO
    //
    //Most common implementation of the Queue are Priority Queue and LinkedList (both being not thread safe)
    //Thread safe implementation is PriorityBlockingQueue  and ArrayBlockingQueue

    //Supported operations: add()       -- offer()
    //                      remove()    -- poll()
    //                      element     -- peek()
    //Since it extends Collections class it gives size(), isEmpty() and contains()

    //LinkedList
    private void linkedListQueue() {
        //declaration
        Queue<Integer> linkedListQueue = new LinkedList<>();
        linkedListQueue.offer(100);
        //throws IllegalStateException when the queue is fill; which happens when the capacity is reached
        linkedListQueue.add(200);
        if (linkedListQueue.isEmpty())
            System.out.println("The linkedList queue is empty");
        System.out.println("First element: " + linkedListQueue.element());
        System.out.println("Remove First element: " + linkedListQueue.remove());
        System.out.println("Second element: " + linkedListQueue.peek());
        System.out.println("Remove Second element: " + linkedListQueue.poll());
        System.out.println("The size of linkedList: " + linkedListQueue.size());
    }
}
