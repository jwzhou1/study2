package com.datastrcuture;

/**
 * @author Jiawei Zhou
 * 2022/11/22
 */
public class doubleList {
    public static void main(String[] args) {


        doubleLinkedList doubleLinkedList;

            HeroNode1 hero1 = new HeroNode1(1, "A1", "AA1");
            HeroNode1 hero2 = new HeroNode1(2, "A2", "AA2");
            HeroNode1 hero3 = new HeroNode1(3, "A3", "AA3");
            HeroNode1 hero4 = new HeroNode1(4, "A4", "AA4");
            doubleLinkedList = new doubleLinkedList();
            doubleLinkedList.add(hero1);
            doubleLinkedList.add(hero4);
            doubleLinkedList.add(hero2);
            doubleLinkedList.add(hero3);
        System.out.println("更新前");
        doubleLinkedList.print();
        HeroNode1 hero4New = new HeroNode1(4, "AAA4", "AAAA4");
        doubleLinkedList.update(hero4New);
        System.out.println("更新后");
        doubleLinkedList.print();
        System.out.println("======================================");
        System.out.println("删除前");
        doubleLinkedList.print();
        doubleLinkedList.delete(1);
        doubleLinkedList.delete(4);
        doubleLinkedList.delete(3);
        System.out.println("删除后");
        doubleLinkedList.print();
        System.out.println("=============");
        doubleLinkedList.addByOrder(hero1);
        doubleLinkedList.addByOrder(hero4);
        doubleLinkedList.addByOrder(hero2);
        doubleLinkedList.addByOrder(hero3);
        doubleLinkedList.addByOrder(hero3);
        doubleLinkedList.print();
    }
}
class doubleLinkedList{
    private HeroNode1 head = new HeroNode1(0, "","");
    public void add(HeroNode1 node){
        HeroNode1 temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }
    public void addByOrder(HeroNode1 node) {
        HeroNode1 temp = head;
        boolean exist = false;
        while (true) {
            // 已到列表尾部
            if (temp.next == null) {
                break;
            }
            // 已找到
            if (temp.next.no > node.no) {
                break;
            }

            // 已存在该编号
            if (temp.next.no == node.no) {
                exist = true;
                break;
            }
            temp = temp.next;
        }
        if (exist) {
            System.out.printf("准备插入的英雄编号 %d 已经存在，不能加入 \n", node.no);
            return;
        }

        // 把节点插入到 temp 和 temp.next 之间
        // temp  ->  node  -> temp.next
        node.next = temp.next;
        temp.next = node;
    }
    public void update(HeroNode1 newNode){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode1 temp = head.next;
        boolean exist = false;
        while(true){
            if(temp == null){
                break;
            }
            if(temp.no != newNode.no){
                exist = true;
                break;
            }
            temp = temp.next;
        }
        if(exist){
            temp.name = newNode.name;
            temp.nickName = newNode.nickName;
        }else {
            System.out.printf("没找到%d 的英雄",newNode.no);
        }
    }
    public void delete(int no){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode1 cur = head.next;
        boolean exist = false;
        while(true){
            if(cur == null){
                break;
            }
            if(cur.no == no){
                exist = true;
                break;
            }
            cur = cur.next;
        }
        if(!exist){
            System.out.printf("未找到匹配的编号 %d \n", no);
            return;
        }
        if(cur.next!= null){
            cur.next.pre = cur.pre;
        }
        cur.pre.next = cur.next;
    }
    public void print(){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode1 cur = head.next;
        while (cur!= null){
            System.out.println(cur);
            cur = cur.next;
        }
    }
}
class HeroNode1{
    public int no;
    public String name;
    public String nickName;
    public HeroNode1 next;
    public HeroNode1 pre;

    @Override
    public String toString() {
        return "HeroNode1{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public HeroNode1(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }
}