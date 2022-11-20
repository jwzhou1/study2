package com.studybilibili.encap;

/**
 * @author Jiawei Zhou
 * 2022/11/15
 */
public class homework1 {
    public static void main(String[] args) {
        String name = null;
        String pwd = "312223";
        String email = "dada@sohu.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email) {
        if(!(name != null && pwd!= null && email != null)){
            throw new RuntimeException("不能为空");
        }
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度为6必须全是数字");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱得包括@和.");
        }
    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
