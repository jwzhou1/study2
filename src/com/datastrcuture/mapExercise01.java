package com.datastrcuture;

import java.util.*;

/**
 * @author Jiawei Zhou
 * 2022/11/22
 */
public class mapExercise01 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("A1","A2");
        map.put("B1","B2");
        map.put("C1","B2");
        map.put("D1",null);
        map.put(null,"F2");
        map.put("G1","G2");
        Set keySet = map.keySet();
        System.out.println("================(1)==============");
        for (Object key :keySet) {
            System.out.println(key +"-" +map.get(key));
        }

        System.out.println("======================(2)================");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key +"-"+ map.get(key));
        }
        System.out.println("============GET VALUE==================");
        System.out.println("============(1)==================");
        Collection values = map.values();
        for (Object value :values) {
            System.out.println(value);
        }
        System.out.println("============(2)==================");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }
        System.out.println("============GET KEY - VALUE==================");
        System.out.println("============(1)==================");
        Set entrySet = map.entrySet();
        for (Object entry :entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() +"-"+m.getValue());
        }
        System.out.println("============(2)==================");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-" +m.getValue());
        }


    }
}
