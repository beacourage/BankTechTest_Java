package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrintStatementTest {

    private PrintStatement statement;
    private  ArrayList<Object> test = new ArrayList<Object>();


    @Before
    public void setup() {
        statement = new PrintStatement(test);
    }

    @DisplayName("Initialized transaction arraylist")
    @Test
    public void arrayList() {
        test.add("firstTransaction");
        test.add("secondTransaction");
        Object firstElement = statement.getTransactions().get(0);
        assertEquals("firstTransaction", firstElement);
    }

    @DisplayName("Can print the bank statement")
    @Test
    public void printStatement_credit() {
        Account account = new Account();
        account.deposit(20);
        account.withdraw(2);
        IndividualTransactions firstelement = (IndividualTransactions) statement.getTransactions().get(0);
        assertEquals(20, firstelement.getCredit());
    }

    @Test
    public void printStatement_debit(){
        Account account = new Account();
        account.deposit(20);
        account.withdraw(2);
        IndividualTransactions secondelement = (IndividualTransactions) statement.getTransactions().get(1);
        assertEquals(2, secondelement.getDebit());
    }

    @Test
    public void printStatement_balance() {
        Account account = new Account();
        account.deposit(20);
        account.withdraw(2);
        IndividualTransactions secondelement = (IndividualTransactions) statement.getTransactions().get(1);
        assertEquals(18, secondelement.getBalance());
    }




}