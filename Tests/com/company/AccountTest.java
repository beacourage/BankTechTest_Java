package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class AccountTest {

    private Account account;


    @Before
    public void setUp() {
        account = new Account();
    }

    @DisplayName("User can deposit money into account")
    @Test
    public void deposit() {
        account.deposit(5);
        int balance = account.getBalance();
        assertEquals(5, balance, 0);
    }

    @DisplayName("User can withdraw money from account")
    @Test
    public void withdraw() {
        account.deposit(10);
        account.withdraw(2);
        assertEquals(8, account.getBalance(), 0);
    }

    @DisplayName("Error thrown if trying to withdraw with insufficient funds")
    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notFunds()  {
        account.deposit(30);
        account.withdraw(35);
        fail("Should have thrown an illegal exception");
    }



}