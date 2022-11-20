package com.studybilibili.encap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jiawei Zhou
 * 2022/11/18
 */
public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" +i);
        }
        System.out.println("list = " +list);
        list.add(1,"add1");
        System.out.println("list = " + list);
        System.out.println("第五个元素 = "+list.get(4));
        list.remove(5);
        System.out.println("list = "+ list);
        list.set(6,"add 6");
        System.out.println("list = " + list);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
