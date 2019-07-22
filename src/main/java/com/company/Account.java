package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {

    private int balance;
    private String date;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    private Date currentDate = new Date();


    public Account() {
        this.balance = 0;
        this.date = dateFormat.format(currentDate);
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
