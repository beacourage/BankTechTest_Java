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

    @Test
    public void printStatement() {
        Account account = new Account();
        account.deposit(20);
        account.withdraw(2);
        account.deposit(30);
        account.deposit(40);
        String expected = "The date is 2019/07/23. You deposited 20. You withdrew 0. and total balance is 20.\n" +
                "The date is 2019/07/23. You deposited 0. You withdrew 2. and total balance is 18.\n" +
                "The date is 2019/07/23. You deposited 30. You withdrew 0. and total balance is 48.\n" +
                "The date is 2019/07/23. You deposited 40. You withdrew 0. and total balance is 88.\n";
         assertEquals(expected, statement.printTransactions());
    }



}