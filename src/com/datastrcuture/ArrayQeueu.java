package com.datastrcuture;

import java.util.Scanner;

public class ArrayQeueu {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("s(show): show arrary");
            System.out.println("e(exit): exit arrary");
            System.out.println("a(add): add arrary");
            System.out.println("g(get): get arrary");
            System.out.println("h(head): get arrary head");
            key = scanner.next().charAt(0);
            switch (key){
                case 's':
                    arrayQueue.show();
                    break;
                case'a':
                    System.out.println("please enter a number");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
            break;
                case 'g':
                    try{
                        int res = arrayQueue.getQueue();
                        System.out.printf("get data is %d\n", res);
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try{
                        int res = arrayQueue.headQueue();
                        System.out.printf("head data is %d\n", res);
                } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                case 'e':
                    scanner.close();
                    loop = false;
                default:
                    break;
            }
        }
        System.out.println("program exits");
    }
}
class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;
    public ArrayQueue(int arrMaxsize){
        maxSize = arrMaxsize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }
    public boolean isFull() {
        return rear == maxSize - 1;
    }
    public boolean isEmpty() {
        return rear == front;
    }
    public void addQueue(int n) {
        if (isFull()){
            System.out.println("queue is full");
        
        return;
        }
        rear++;
        arr[rear] = n;
    }
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        front++;
        return arr[front];
    }
    public void show(){
        if(isEmpty()){
            System.out.println("arr is empty");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i,arr[i] );
        }
    }
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("arry is empty");
        }
        return arr[front +1];
    }
}
