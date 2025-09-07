// Name: Nathaniel P. Sol
// Section: BSIT 2A
// Date: August 31, 2025

import java.util.Scanner;

public class ArrayLinkedListSimulation {
    int[] arr = new int[10]; // mao ni ang naga fix sa array size
    int size = 0;

    // pag mag add kag element sa pinakalast
    void add(int value) {
        if (size < arr.length) {
            arr[size++] = value;
        } else {
            System.out.println("Array is full.");
        }
    }

    // gina remove niya ang first element
    int poll() {
        if (size == 0) return -1;
        int first = arr[0];
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        return first;
    }

    // gina kuha niya ang first element
    int peek() {
        if (size == 0) return -1;
        return arr[0];
    }

    // gina remove and last element
    int pop() {
        if (size == 0) return -1;
        return arr[--size];
    }

    // gina print niya ang mga elements
    void print() {
        if (size == 0) System.out.println("Array is empty.");
        else {
            for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayLinkedListSimulation list = new ArrayLinkedListSimulation();

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("After add:");
        list.print();

        System.out.println("poll(): " + list.poll());
        list.print();

        System.out.println("peek(): " + list.peek());
        list.print();

        System.out.println("pop(): " + list.pop());
        list.print();

        sc.close();
    }
}
