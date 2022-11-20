package com.studybilibili.dynamic;

/**
 * @author Jiawei Zhou
 * 2022/11/19
 */
public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hi = new Node("hi");
        jack.next = tom;
        tom.next = hi;
        hi.pre = tom;
        tom.pre = jack;
        Node first = jack;
        Node last = hi;
        while(true){
            if(first ==null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("===============");
        while(true){
            if(last==null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        Node smith = new Node("smith");
        smith.next = hi;
        smith.pre= tom;
        hi.pre= smith;
        tom.next = smith;
        first = jack;
        System.out.println("===========");
        while(true){
            if(first ==null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("===============");
        last = hi;
        while(true){
            if(last==null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
    }
}
class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}
