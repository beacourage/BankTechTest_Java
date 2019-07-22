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



}