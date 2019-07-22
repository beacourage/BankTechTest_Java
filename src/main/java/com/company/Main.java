package com.company;

public class Main {

    public static void main(String[] args) {

        IndividualTransactions individualTransaction = new IndividualTransactions("date", 20, 30, 100);

        System.out.println(individualTransaction.getCredit());
        System.out.println(individualTransaction.getDate());




    }

}
