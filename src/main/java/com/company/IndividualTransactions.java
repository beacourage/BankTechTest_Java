package com.company;

public class IndividualTransactions {

    private String date;
    private int credit;
    private int debit;
    private int balance;

    public IndividualTransactions(String date, int credit, int debit, int balance) {
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public int getCredit() {
        return credit;
    }

    public int getDebit() {
        return debit;
    }

    public int getBalance() {
        return balance;
    }


}


//We initialize the characteristics/fields through(when) creating constructors.
//Executed the constructor and the fields have been initialized.