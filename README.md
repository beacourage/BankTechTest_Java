# Bank Tech Test - Java 

In order to practice Java, I will create a Command Line App in Intellij. 
The program will consist of separate classes that can be easily justified, and 
JUnit4 will be used to fully test-drive the code. 

Acceptance Criteria
-----
Given a client makes a deposit of 1000 on 10-01-2012
And a deposit of 2000 on 13-01-2012
And a withdrawal of 500 on 14-01-2012
When she prints her bank statement
Then she would see:

```
date       || credit || debit   || balance
14/01/2012 ||        || 500.00  || 2500.00
13/01/2012 || 2000.00||         || 3000.00
10/01/2012 || 1000.00||         || 1000.00
```

User Stories
-----
```
As a user,
So that I can add money to my account (credit),
I would like to make a deposit.

As a user,
So that I can remove money from my account (debit),
I would like to make a withdrawal.

As a user,
So that I am never overdrawn,
I won't be able to withdraw money if I have insufficient funds. 

As a user,
So that I know how much money I have,
I would like to see my bank statement which includes date, credit, debit, balance.
```

Set Up
-----
* Clone this repository
```
$ git clone git@github.com:beacourage/Bank_tech_test---Java.git

```
