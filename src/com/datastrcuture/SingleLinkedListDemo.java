package com.datastrcuture;

import java.util.LinkedList;
import java.util.Stack;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        HeroNode hero1 = new HeroNode(1,"king","guowang");
        HeroNode hero2 = new HeroNode(2,"queen","wanghou");
        HeroNode hero3 = new HeroNode(3,"aifusen","afisn");
        HeroNode hero4 = new HeroNode(4,"fafa","dadada");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);
//        System.out.println("=====before update=====");
//        singleLinkedList.list();
//        HeroNode hero4New = new HeroNode(4, "qeqeqeqeq - update", "oioipio-update");
//        singleLinkedList.update(hero4New);
//        System.out.println("=====after update=====");
//        singleLinkedList.list();
//        System.out.println("=====Before delete=====");
//        singleLinkedList.list();
//        singleLinkedList.delete(1);
//        singleLinkedList.delete(4);
//        System.out.println("=====After delete=====");
//        singleLinkedList.list();

        System.out.println("翻转前");
        singleLinkedList.list();

        singleLinkedList.reverse();

        System.out.println("翻转后");
        singleLinkedList.list();
        System.out.println("链表数据");
        singleLinkedList.list();
        System.out.println("逆序打印");
        singleLinkedList.reversePrint();

    }
}
class SingleLinkedList{
    private HeroNode head = new HeroNode(0, "","");
    public void add(HeroNode node) {
        HeroNode temp = head;
        while(true) {
            if(temp.next  == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }
    public void reversePrint(){
        if(head.next == null){
            System.out.println("list is empty");
            return;
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.next;
        while(cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
    public void reverse() {
        if (head.next == null) {
            return;
        }
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0, "", "");
        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }


    public void addByOrder(HeroNode node){
        HeroNode temp = head;
        boolean exist = false;
        while (true){
            if(temp.next == null){
                break;
            }
            if(temp.next.no>node.no){
                break;
            }
            if(temp.next.no == node.no){
                exist = true;
                break;
            }
            temp = temp.next;
        }
        if(exist){
            System.out.printf("the insert Hero ID %d has existed, you cannot add \n", node.no);
            return;
        }
        node.next = temp.next;
        temp.next = node;
    }
    public void update(HeroNode newNode){
        if(head.next == null){
            System.out.println("linked list is empty");
            return;
        }
        HeroNode temp = head.next;
        boolean exist = false;
        while(true){
            if(temp == null){
                break;
            }
            if(temp.no == newNode.no){
                exist = true;
                break;
            }
            temp = temp.next;
        }
        if(exist){
            temp.name = newNode.name;
            temp.nickName = newNode.nickName;
        } else{
            System.out.printf("did not find ID %d hero", newNode.no);
        }
    }
    public void delete(int no){
        if(head .next == null){
            System.out.println("linked list is empty");
            return;
        }
        HeroNode temp = head;
        boolean exist = false;
        while(true){
            if(temp.next== null){
                break;
            }
            if(temp.next.no == no){
                exist = true;
                break;
            }
            temp = temp.next;
        }
        if(!exist){
            System.out.printf("did not find matched ID %d \n", no);
            return;
        }
        temp.next = temp.next.next;
    }
    public void list() {
        if(head.next == null){
            System.out.println("linked list is empty");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
class HeroNode{
    public int no;
    public String name;
    public String nickName;
    public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
