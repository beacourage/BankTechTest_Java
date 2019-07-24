package com.company;

public class Main {

    public static void main(String[] args) {

        IndividualTransactions individualTransaction = new IndividualTransactions("date", 20, 30, 100);

        System.out.println(individualTransaction.getCredit());
        System.out.println(individualTransaction.getDate());


        Account account = new Account();

        account.deposit(2);
        account.withdraw(1);
        account.deposit(3);
        account.deposit(9);


        System.out.println(PrintStatement.getTransactions());

        Object oneTransaction = PrintStatement.getTransactions().get(0);

        System.out.println(oneTransaction);
        System.out.println(PrintStatement.getTransactions().size());

         String answer = PrintStatement.printTransactions();
         System.out.println(answer);


//
//        System.out.println(PrintStatement.printTransactions());





        IndividualTransactions transaction = new IndividualTransactions("date", 20, 30, 100);

        System.out.println(transaction);






    }

}
