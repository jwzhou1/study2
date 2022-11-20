package com.studybilibili.dynamic;

import java.util.List;
import java.util.Vector;

/**
 * @author Jiawei Zhou
 * 2022/11/18
 */
@SuppressWarnings({"all"})
public class ListExercise01 {
    public static void main(String[] args) {
        //List list = new ArrayList();
        List list = new Vector();
        list.add(new Book("红楼梦","曹雪芹",100));
        list.add(new Book("西游记","吴承恩",10));
        list.add(new Book("水浒传","施耐庵",19));
        list.add(new Book("三国志","罗贯中",80));
        //list.add(new Book("西游记","吴承恩",10));
        for (Object o :list) {
            System.out.println(o);
        }
        sort(list);
        System.out.println("================");
        for (Object o :list) {
            System.out.println(o);
        }


    }
    public static void sort(List list){
        int listSize = list.size();
        for (int i = 0; i < listSize-1; i++) {
            for (int j = 0; j < listSize-1-i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if(book1.getPrice()> book2.getPrice()){
                    list.set(j, book2);
                    list.set(j+1, book1);
                }
            }
        }
    }
}


class Book{
    @Override
    public String toString() {
        return "名称: "+name +"\t\t价格: "+price +"\t\t作者: "+author;
    }

    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
