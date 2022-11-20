package com.studybilibili.encap;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Jiawei Zhou
 * 2022/11/18
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book1("book1", "author 1", 1.1));
        col.add(new Book1("book2", "author 2", 1.2));
        col.add(new Book1("book3", "author 3", 1.3));
//        for(Object book:col){
//            System.out.println("book = " + book);
//        }
        for (Object o :col) {
            System.out.println(o);
        }

//        System.out.println(col);
//        Iterator iterator = col.iterator();
//        while(iterator.hasNext()){
//            Object obj = iterator.next();
//            System.out.println("obj = " +obj);
//        }
        //itit 快捷键
//        while (iterator.hasNext()) {
//            Object obj = iterator.next();
//            System.out.println("obj = " +obj);
//        }
//        iterator = col.iterator();
//        System.out.println("======");
//        while (iterator.hasNext()) {
//            Object obj = iterator.next();
//            System.out.println("obj = " +obj);
//        }
    }

}
    class Book1{
        private String name;
        private String author;
        private double price;

        public Book1(String name, String author, double price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }

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
    }
