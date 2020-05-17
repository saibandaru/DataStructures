package com.sai.datastructures.stack;

import java.util.Stack;

public class One_IntroductionStack {

    // Stack is a Collection framework that is used to store and retrieve data in a unique way FILO; which is
    //      First In Last Out
    //
    //A Stack in Java supports the following operations
    //  -push(E e) --> pushes the number at the end of the stack and the element is also returned
    //  -pop()     --> retrieves the last added element by removing it from the store
    //  -peek()    --> retrieves the last added element but doesn't remove it from the store
    //  -search(E e) --> searches for the element in the stack, if found returns the offset from the top of the stack
    //                          else -1
    //  -empty()    --> tests if the stack is empty; true when the stack is empty else false

    public static void stackExample() {
        Stack<Integer> store = new Stack<>();
        store.push(100);  // 100<-top
        store.push(200);  // 100<-200<-top
        printStack(store);
        System.out.println("Stack Size: " + store.size());
        System.out.println("Stack top/last-added element : " + store.peek());
        System.out.println("Popping out Stack top/last-added element : " + store.pop());
        store.push(200);  // 100<-200<-top
        store.push(300);  // 100<-200<-300<-top
        store.push(400);  // 100<-200<-300<-400<-top
        printStack(store);
        System.out.println("Search for 300 in Stack  : " + store.search(300));
        System.out.println("Search for 100 in Stack  : " + store.search(100));

    }

    private static void printStack(Stack<Integer> stack) {
        if (stack == null) return;
        Stack<Integer> localCopy = new Stack<>();
        localCopy.addAll(stack);
        System.out.print("Stack: ");
        while(!localCopy.empty()) {
            System.out.print(localCopy.pop());
            if (!localCopy.empty()) System.out.print(" --> ");
            else System.out.println();
        }
    }

}
