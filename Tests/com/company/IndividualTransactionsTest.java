package com.company;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class IndividualTransactionsTest {

    private  IndividualTransactions transaction;


    @Before
    public void setup() {
        transaction = new IndividualTransactions("03/04/1995", 20, 10, 4000);
    }





}