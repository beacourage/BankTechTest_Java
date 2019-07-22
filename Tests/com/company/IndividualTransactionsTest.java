package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class IndividualTransactionsTest {

    private  IndividualTransactions transaction;


    @Before
    public void setup() {
        transaction = new IndividualTransactions("03/04/1995", 20, 10, 4000);
    }

    @DisplayName("Initialized the date")
    @Test
    public void date() {
        String date = transaction.getDate();
        assertEquals("03/04/1995", date);
    }

    @DisplayName("Initialized credit")
    @Test
    public void credit() {
        int credit = transaction.getCredit();
        assertEquals(20, credit);
    }

    @DisplayName("Initialized debit")
    @Test
    public void debit() {
        int debit = transaction.getDebit();
        assertEquals(10,debit);
    }

    @DisplayName("Initizlised balance")
    @Test
    public void balance() {
        int balance = transaction.getBalance();
        assertEquals(4000, balance);
    }





}