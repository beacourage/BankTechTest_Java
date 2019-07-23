package com.company;
import java.util.ArrayList;

public class PrintStatement {


    private static ArrayList<Object> transactions = new ArrayList<Object>();

    public PrintStatement(ArrayList<Object> transactions) {
        this.transactions = transactions;
    }

    public static ArrayList<Object> getTransactions() {
        return transactions;
    }

    public static String printTransactions() {
        String statement = "";
        for (int i = 0; i < getTransactions().size(); i++) {
            Object individualTransaction = getTransactions().get(i);
            IndividualTransactions account = (IndividualTransactions) individualTransaction;
//            System.out.println("The date is " + account.getDate() + ". You deposited " + account.getCredit() + ". You withdrew " + account.getDebit() + ". and total balance is " + account.getBalance());
       statement += "The date is " + account.getDate() + ". You deposited " + account.getCredit() + ". You withdrew " + account.getDebit() + ". and total balance is " + account.getBalance() + ".\n" ;
        }
        return statement;
    }


}

//Initialize the fields when creating the constructor