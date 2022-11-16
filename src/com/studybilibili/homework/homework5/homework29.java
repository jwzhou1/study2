package com.studybilibili.homework.homework5;

/**
 * @author Jiawei Zhou
 * 2022/11/15
 */
public class homework29 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("===交换前===");
        System.out.println(str);
        String reverse = null;
        try {
            reverse = reverse(str, 5, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("===交换后===");
        System.out.println(reverse);
    }


    public static String reverse(String str, int start, int end) {
        if(!(str != null && start>=0 && end > start&& end < str.length())){
            throw new RuntimeException("参数不正确");
        }
            char[] chars = str.toCharArray();
            char temp = ' ';
        for (int i = start,j = end;  i<j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
