package com.studybilibili.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPwd("666666");
        account.info();
    }
}
