package com.company;
import java.util.ArrayList;

public class PrintStatement {


    private ArrayList<Object> transactions = new ArrayList<Object>();

    public PrintStatement(ArrayList<Object> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<Object> getTransactions() {
        return transactions;
    }


}

//Initialize the fields when creating the constructor